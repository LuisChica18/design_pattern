package org.example.command;

import java.util.HashMap;
import java.util.Map;

public class CommandManger {

    private static CommandManger commanManager;

    private static Map<String, Class<? extends ICommand>> commands = new HashMap<>();

    private CommandManger(){
        regist(ExitCommand.COMMAND_NAME, ExitCommand.class);
        regist(DateCommand.COMMAND_NAME, DateCommand.class);
    }

    public synchronized static CommandManger getIntance(){
        if(commanManager == null){
            commanManager = new CommandManger();
        }
        return commanManager;
    }

    public void regist(String commandName, Class<? extends ICommand> clazz){
        commands.put(commandName, clazz);
    }

    public ICommand getCommand(String command){
        if(!commands.containsKey(command)){
            return new CommandNotFound();
        }
        try {
            ICommand iCommand = (ICommand)commands.get(command).newInstance();
            return iCommand;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

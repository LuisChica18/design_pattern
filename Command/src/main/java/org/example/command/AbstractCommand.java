package org.example.command;

import java.io.OutputStream;

public abstract class AbstractCommand implements ICommand {

    @Override
    public abstract String getCommandName();

    @Override
    public abstract void execute(String[] args, OutputStream out);

    public void write(OutputStream stream, String message){
        try {
            stream.write(message.getBytes());
        } catch (Exception e) { }
    }
}

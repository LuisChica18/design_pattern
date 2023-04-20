package org.example;

import org.example.command.CommandManger;
import org.example.command.ICommand;
import org.example.util.CommandUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommandManger commandManger = CommandManger.getIntance();

        while(true){
            String newLine = scanner.nextLine();
            if(newLine.trim().isEmpty()){
                continue;
            }

            String[] commandArgs = CommandUtil.tokenizerArgs(newLine);
            String commandName = commandArgs[0];
            String[] commandArgs2 = null;
            if(commandArgs.length > 1){
                commandArgs2 = Arrays.copyOfRange(commandArgs, 1, commandArgs.length);
            }
            ICommand command = commandManger.getCommand(commandName);
            command.execute(commandArgs2, System.out);
        }
    }
}

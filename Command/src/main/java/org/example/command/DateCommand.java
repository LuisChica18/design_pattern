package org.example.command;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCommand extends AbstractCommand{

    public static final String COMMAND_NAME = "date";

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public void execute(String[] args, OutputStream out) {
        if(args == null || args.length == 0 ){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            String fDate = format.format(new Date());
            write(out, fDate);
        }else{
            SimpleDateFormat format  = new SimpleDateFormat(args[0]);
            String fDate = format.format(new Date());
            write(out, fDate);
        }
    }
}

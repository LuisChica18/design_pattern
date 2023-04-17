package org.example.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Luis Chica Moncayo
 */
public class AuditService {
    public void auditServiceUsed(String user, String service){
        SimpleDateFormat formater= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println(user + " used the service > "
                + service + ", at " +formater.format(new Date()));
    }
}

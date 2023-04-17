package org.example.service;

public class SecurityService {

    public boolean authorization(String user,String password){
        if(user.equals("LuisChica") && password.equals("1234")){
            System.out.println("User " + user + " authorized");
            return true;
        }else{
            System.out.println("User " + user + " no authorized");
            return false;
        }
    }
}
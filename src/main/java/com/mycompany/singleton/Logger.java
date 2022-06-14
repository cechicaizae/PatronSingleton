/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author ce.christian
 */

public class Logger {
    private static Logger log;
    private String value;
    private Logger(){
        
    }
    
    public static Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }
    
    public void log(String msg){
        System.out.println(msg);
    }
    
    public void setValue(String msg){
        value = msg;
    }
    
    public String getValue(){
        return value;
    }
}

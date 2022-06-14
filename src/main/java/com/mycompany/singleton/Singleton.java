/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleton;

/**
 *
 * @author ce.christian
 */
public class Singleton {

    public static void main(String[] args) {
        Logger logger_1 = Logger.getInstance();
        Logger logger_2 = Logger.getInstance();
        
        logger_1.setValue("Singleton");
        System.out.println(logger_2.getValue());
        
    }
}

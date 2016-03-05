/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arquillian.example;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author srishtimehra
 */
public class CalculatorClient {
    
    public String userOperation()
    {
        return ("Enter the operation you want the application to perform and the numbers you want to perform the operation on (separated by ,)");
    }
    public String instruction()
    {
        return ("You can enter: sum, difference, multiply or divide. Please type the operation name.");
    }
    
    public static void main(String args[])
    {
        CalculatorClient c = new CalculatorClient();
        System.out.println(c.userOperation());
        System.out.println(c.instruction());
        
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        StringTokenizer strtok;
        strtok = new StringTokenizer(input,",");
        
        String operation = strtok.nextToken();
        String token1 = strtok.nextToken();
        String token2 = strtok.nextToken();
        double num1 = Double.parseDouble(token1);
        double num2 = Double.parseDouble(token2);
        
        Calculator calculator = new Calculator(num1,num2,operation);
        System.out.println(calculator.calculateResult());
        
    }
}

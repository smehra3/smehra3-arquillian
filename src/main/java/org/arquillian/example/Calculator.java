package org.arquillian.example;

/**
 * A component for creating personal greetings.
 */
import static java.lang.Double.NaN;

public class Calculator {
    private double num1;
    private double num2;
    private String operation;

    public Calculator(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
   
    public double calculateResult(){
        if(operation.equals("sum"))
        {
           return num1+num2; 
        }
        else if(operation.equals("difference"))
        {
           return num1-num2; 
        }
        else if(operation.equals("product"))
        {
           return num1*num2; 
        }
        else if(operation.equals("division"))
        {
           if(num2!=0)
           {
            return num1/num2; 
           }
        }
        return NaN;   
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
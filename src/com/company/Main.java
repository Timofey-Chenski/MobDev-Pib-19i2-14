package com.company;
import java.util.*;

public class Main {
    static double calc (double x, double y, char operation)
    {
        switch(operation)
        {
            case '+' : return (x + y);
            case '-' : return (x - y);
            case '*' : return (x * y);
            case '/' : return (x / y);
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String oper = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        if (    Double.parseDouble(firstNumber) > 0
             || Double.parseDouble(firstNumber) < 0
             || Double.parseDouble(firstNumber) == 0
             || Double.parseDouble(secondNumber) > 0
             || Double.parseDouble(secondNumber) < 0
             && Double.parseDouble(secondNumber) == 0 )
        {
            double x = Double.parseDouble(firstNumber);
            double y = Double.parseDouble(secondNumber);
            char operation = oper.charAt(0);
            if (y == 0)
            {
                System.out.print("NaN");
            }
            else
            {
                System.out.print(calc(x, y, operation));
            }
        }
        else
        {
            System.out.print("Ошибка, попробуйте еще раз");
        }
    }

}

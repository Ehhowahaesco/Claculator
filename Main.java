package Package;

import java.util.Scanner;

import static Package.Logics.*;
import static Package.Assistant.*;

//Ввод данных через пробел, римские верхний регистр
public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        String romeOrArab = "null";
        String [] rome = new String[]{"X","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] arab = new String[]{"10","1","2","3","4","5","6","7","8","9"};
        String input = null;
        String[] inputArray = new String[2];

        Scanner sc = new Scanner(System.in);
        try {
             input = sc.nextLine();
            inputArray = input.split(" ");
        }
        catch (Exception e){
            System.out.println("Введите корректные данные");
        }
        
        
        
       

       romeOrArab = chekRom(rome, inputArray, arab, romeOrArab);

        if(romeOrArab == "ROME"){
          int number1 =  toInt(inputArray[0],rome, arab);
          int number2 =  toInt(inputArray[2],rome, arab);
            int result = calc(number1, number2, inputArray[1]);
            String resultString = Integer.toString(result);
            System.out.println(toRom(resultString,rome, arab));
        }
        else if(romeOrArab == "ARAB"){
            int number1 = Integer.parseInt(inputArray[0]);
            int number2 = Integer.parseInt(inputArray[2]);
            System.out.println(calc(number1, number2, inputArray[1]));
        }

    }

}

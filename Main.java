package Package;

import java.util.Scanner;

import static Package.Logics.*;
import static Package.Assistant.*;

//Ввод данных через пробел, римские верхний регистр
public class Main {

    public static void main(String[] args) throws IllegalArgumentException {

        String [] romeOutput = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX", "X","XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX", "LX", "LXI", "LXII", "LXIII"
                , "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIV", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX","XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        int [] arabOutput= new int[100];

        for(int i = 0; i < arabOutput.length; i++){
            arabOutput[i] = i + 1;
        }



        String romeOrArab = "null";
        String [] rome = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX", "X",};
        String [] arab = new String[]{"1","2","3","4","5","6","7","8","9", "10"};
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
            System.out.println(toRom(resultString,romeOutput, arabOutput));
        }
        else if(romeOrArab == "ARAB"){
            int number1 = Integer.parseInt(inputArray[0]);
            int number2 = Integer.parseInt(inputArray[2]);
            System.out.println(calc(number1, number2, inputArray[1]));
        }

    }

}

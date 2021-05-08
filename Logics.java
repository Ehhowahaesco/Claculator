package Package;

public  class Logics {

    public static int calc(int number1, int number2, String operand) throws IllegalArgumentException {
        if(operand.equals("+")){
            return number1 + number2;
        }
        if(operand.equals("-")){
            return number1 - number2;
        }
        if(operand.equals("*")){
            return number1 * number2;
        }
        if(operand.equals("/")){
            return number1 / number2;
        }
        else throw new IllegalArgumentException("Неверное значение");

    }


    public static String chekRom(String[] rome, String[] inputArray, String[] arab, String romeOrArab) throws IllegalArgumentException {
        if(romeOrArab == "null") {
            for (String i : rome) {

                if (i.equals(inputArray[0])) {

                    for (String j : rome) {

                        if (j.equals(inputArray[2])) {
                            romeOrArab = "ROME";
                            return romeOrArab;
                        }
                    }

                }

            }
        }

        if(romeOrArab == "null"){

            for (String i : arab) {

                if (i.equals(inputArray[0])) {

                    for (String j : arab) {

                        if (j.equals(inputArray[2])) {
                            romeOrArab = "ARAB";
                            return romeOrArab;
                        }
                    }

                }

            }
        }



        throw new IllegalArgumentException("Введите корректные данные");
    }

}

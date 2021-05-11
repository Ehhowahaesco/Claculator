package Package;

public class Assistant {

    public static int toInt(String value, String[] rome, String[] arab) throws IllegalArgumentException {
        for(int i = 0; i < rome.length; i++){
            if(value.equals(rome[i]))

                return Integer.parseInt(arab[i]);


        }
        throw new IllegalArgumentException("Введите корректные данные");
    }


    public static String toRom(String result, String[]  romeOutput, int[] arabOutput) throws IllegalArgumentException {

        int resultInt = Integer.parseInt(result);

        for(int i = 0; i < arabOutput.length; i++){
            if(resultInt == arabOutput[i + 1]){
                return romeOutput[i + 1];
            }
        }
        throw new IllegalArgumentException("Введите корректные данные toRom");
    }
}

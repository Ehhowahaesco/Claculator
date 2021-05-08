package Package;

public class Assistant {

    public static int toInt(String value, String[] rome, String[] arab) throws IllegalArgumentException {
        for(int i = 0; i < rome.length; i++){
            if(value.equals(rome[i]))

                return Integer.parseInt(arab[i]);


        }
        throw new IllegalArgumentException("Введите корректные данные");
    }


    public static String toRom(String result, String[]  rome, String[] arab) throws IllegalArgumentException {

        for(int i = 0; i < arab.length; i++){
            if(result.equals(arab[i])){
                return rome[i];
            }
        }
        throw new IllegalArgumentException("Введите корректные данные");
    }
}

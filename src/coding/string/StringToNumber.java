package coding.string;

public class StringToNumber {
    public static void main(String[] args) {
        final String str = "1234 ajay";
        //output 1234
        System.out.println(getNumberFromString(str));

        final String str2 = "-1234 ajay";
        //output -1234
        System.out.println(getNumberFromString(str2));

        final String str3 = "ajay 1234";
        //output 0
        System.out.println(getNumberFromString(str3));

        final String str4 = "123433434343434 ajay";
        //output Integer.MAX_VALUE = 2147483647
        System.out.println(getNumberFromString(str4));

        final String str5 = "-1122322222222222 ajay";
        //output Integer.MIN_VALUE = -2147483648
        System.out.println(getNumberFromString(str5));

    }
    public static Integer getNumberFromString(String str){
        if (str.isBlank()) {
            return 0;
        }
        str = str.trim();
        boolean isNeg = false;
        char c = str.charAt(0);
        if (c == '-'){
            str = str.substring(1);
            isNeg = true;
        }else if (c == '+'){
            str = str.substring(1);
        }
        StringBuilder finalNumber = new StringBuilder("0");
        for (int i = 0 ; i< str.length(); i++){
            char c1 = str.charAt(i);
            if (c1 >= '0' && c1 <= '9'){
                finalNumber.append(c1);
            }else {
                break;
            }
        }
        long longRes = isNeg ? Long.valueOf(finalNumber.toString())*(-1):Long.valueOf(finalNumber.toString());
        if (longRes > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if (longRes <Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)longRes;
    }
}

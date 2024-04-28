package coding.numbers;

public class RomanToNumber {
    public static void main(String[] args) {
        System.out.println(getNumberFromRoman("XXXX"));
    }
    public static Integer getNumberFromRoman(String roman){
        if(roman == null || roman.isBlank()){
            return 0;
        }
        int res = 0;
        for (int i = roman.length()-1; i>=0; i--){
            switch (roman.charAt(i)){
                case 'M':
                    res +=1000;
                    break;
                case 'D':
                    res +=500;
                    break;
                case 'C':
                    res +=100*(res>=500?-1:1); //for CM or CD
                    break;
                case 'L':
                    res +=50;
                    break;
                case 'X':
                    res +=10*(res>=50?-1:1); //for XC or XL
                    break;
                case 'V':
                    res +=5;
                    break;
                case 'I':
                    res +=(res>=5?-1:1); // for IX or IV
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}

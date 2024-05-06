package coding.string;

public class MatchingLettersInBothStrings {

    public static void main(String[] args) {

        String jewels = "aAb";
        String stones = "aAAbbbb";
        System.out.println(getCasesensitiveLetterMatch(jewels,stones));

    }
    private static int getCasesensitiveLetterMatch(String str1, String str2){
        int count = 0 ;
        for (int i = 0; i < str1.length(); i++){
              char c = str1.charAt(i);
            for (int j = 0 ; j < str2.length() ; j++){
                if (c== str2.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}

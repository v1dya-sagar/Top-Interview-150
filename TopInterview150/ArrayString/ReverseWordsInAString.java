package TopInterview150.ArrayString;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String givenString = " Sky   is blue ";
        String[] arrString = givenString.trim().split("\\s+");
        String result = "";
        for (int i = arrString.length - 1; i >= 0; i--){
            result += arrString[i] + " ";
        }
        System.out.println(result);
    }
}

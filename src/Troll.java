import java.util.regex.Pattern;

public class Troll {
    public static String disemvowel(String str) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        String VOWELS = "aeiouAEIOU";
        while(count < str.length()){
            if (VOWELS.indexOf(str.charAt(count)) == -1) {
                sb.append(str.charAt(count));
            }
            count ++;
            }

        System.out.println(sb);
        return str;

    }
}
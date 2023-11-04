public class Troll {
    public static String disemvowel(String str) {
        StringBuffer sb = new StringBuffer();
        int count = 0;

        while(count < str.length()){
            sb.append(str.charAt(count));

            count ++;
            }

        System.out.println(sb);
        return str;

    }
}
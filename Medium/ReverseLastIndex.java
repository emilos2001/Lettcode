package LeetCode.Medium;

public class ReverseLastIndex {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()){
                sb.append(words[i]);
                if (i > 0){
                    sb.append(" ");
                }
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String word = "  hello world  ";
        String result = reverseWords(word);
        System.out.println(result);
    }
}

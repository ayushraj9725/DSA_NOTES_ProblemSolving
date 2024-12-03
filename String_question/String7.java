public class String7 {
    public static String convertString(String str) {
        // Write your code here
        StringBuilder sb = new StringBuilder(str);

    boolean flag = true;
    for (int i = 0; i < sb.length(); i++) {
        if (flag == true && Character.isLowerCase(sb.charAt(i))) {
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        if (Character.isSpaceChar(sb.charAt(i))) {
            flag = true;
        } else {
            flag = false;
        }
    }

    return sb.toString();
}
}

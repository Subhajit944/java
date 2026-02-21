public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String [] {
            "THIS", "IS","THE","BEST","COURSE"
        };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append("  ");
        }
        System.out.println(sb);
    }
}

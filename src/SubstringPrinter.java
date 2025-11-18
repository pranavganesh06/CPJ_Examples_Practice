public class SubstringPrinter {

    public static void printAllSubstrings(String word) {

        int n = word.length();

        // length 1 up to full length
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start + len <= n; start++) {
                String sub = word.substring(start, start + len);
                System.out.println(sub);
            }
        }
    }
}

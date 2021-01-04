public class Main {
    static char[] chA;
    public static void main(String[] args) {
        String s = "the sky is blue";
        chA = s.toCharArray();
        System.out.println(chA);
        reverseWords();
        System.out.println(chA);
    }

    private static void reverseWords() {
        int i = 0;
        for (int j = 0; j < chA.length; j++) {
            if (chA[j] == ' ') {
                reverse(i, j - 1);
                i = j + 1;
            }
        }
        reverse(i, chA.length - 1);

        reverse(0, chA.length - 1);
    }
    private static void reverse(int i, int j) {
        while(i < j) {
            char t = chA[i];
            chA[i] = chA[j];
            chA[j] = t;
            i++;
            j--;
        }
    }
}

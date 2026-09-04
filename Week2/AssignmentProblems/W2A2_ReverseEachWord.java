package Week2.AssignmentProblems;

public class W2A2_ReverseEachWord {

    static String reverseEachWord(
            String sentence) {

        String[] words =
            sentence.split(" ");

        StringBuilder result =
            new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder word =
                new StringBuilder();

            for (
                int j = words[i].length() - 1;
                j >= 0;
                j--
            ) {

                word.append(
                    words[i].charAt(j)
                );
            }

            result.append(word);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(
            reverseEachWord("hello club")
        );
    }
}
package Task3;

public class Quantity {
    public static void main(String[] args) {
        int maxLength = 0;
        String maxWord = "";
        String sentence = " The is a house of rising sun ";
        String[]  arrayWord = sentence.trim().split(" ");

        for(int i = 0;i < arrayWord.length;i++) {

            if (arrayWord[i].length() > maxLength) {
                maxWord = arrayWord[i];
                maxLength = arrayWord[i].length();
            }
        }

        System.out.format("Number of words is %s",arrayWord.length);
        System.out.format("%nThe first max word is '%s' of %s letters",maxWord,maxLength);

    }
}

package Task2;

public class Palindrom {
    public static void main(String[] args) {
        boolean isPalindrom;
        String text1 = "Dots I stod";
        String text2;


        StringBuilder message = new StringBuilder(text1);
        StringBuilder sb = new StringBuilder(text1);

        text2 = sb.reverse().toString();

        isPalindrom = (text1.equalsIgnoreCase(text2)) ? true : false;

        if (isPalindrom) {
            System.out.println(message.insert(0,"'").append("'").append(" is palindrom").toString());
        } else {
            System.out.println(message.insert(0,"'").append("'").append(" is not palindrom").toString());
        }

    }
}

package java_basics;

public class quiz {

    public static void main(String[] args) {
        printEachLetter("JaVa is an IslAnd");

    }

    public static void printEachLetter(String text) {

        char[] textArray = text.toLowerCase().toCharArray();
        int length = textArray.length;

        for (int i = 0; i <= length; i++) {
            System.out.print(textArray[i]);
        }
    }
}















package Sda;

public class StringUtils {
    public static boolean isPalindrome(char[] text) {
        for(int i = 0; i < text.length / 2; i++) {
            if(text[i] == text[text.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public static char[] reverse(char[] text) {
        char newText[] = new char[text.length];
        for(int i = 0; i < text.length; i++) {
            newText[i] = text[text.length - 1 -i];
        }
        return newText;
    }

    public static boolean isOccurs(char[] tab, char element) {
        for(char e: tab) {
            if(e == element) {
                return false;
            }
        }
        return true;
    }

    public static int differentCharCount(char[] text) {
        int count = 0;
        char[] wynik = new char[text.length];
        for(int i = 0; i < text.length; i++) {
            if(isOccurs(wynik, text[i])) {
                wynik[i] = text[i];
                count++;
            }
        }
        return count;
    }

    public static boolean contains(char[] textFirst, char[] textSecond) {
        for(int i = 0; i < textFirst.length - textSecond.length + 1; i++) {
            boolean contains = true;
            for(int j = 0; j < textSecond.length; j++) {
                if(textFirst[i + j] != textSecond[j]) {
                    contains = false;
                    break;
                }
            }
            if(contains) {
                return true;
            }
        }
        return false;
    }
}

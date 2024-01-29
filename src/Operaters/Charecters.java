package Operaters;

import java.util.Scanner;

public class Charecters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the charecter is :");
        char charecter = sc.next().charAt(0);
        alpahabets alpahabet = new alpahabets(charecter);
        System.out.println(alpahabet.checkVowel());
        System.out.println(alpahabet.CheckConsonet());

        alpahabet.UpperCase();
        alpahabet.LowerCase();
        alpahabet.isDigit();

    }
}

class alpahabets {
    private char ch;

    public alpahabets(char ch) {
        this.ch = ch;

    }

    public boolean checkVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;

        }
        return false;
    }

    public boolean CheckConsonet() {
        if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
            return true;

        }
        return false;
    }

    public void UpperCase() {
        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            System.out.println(ch);
        }
    }

    public void LowerCase() {
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            System.out.println(ch);
        }
    }

    public void isDigit() {
        for (int i = 48; i <= 57; i++) {
            System.out.println((char) i);
        }
    }
}

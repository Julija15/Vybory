import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Person person = new Person();
        int[] voice = new int[10];
        String[] getName = new String[10];
        for (int i = 0; i < getName.length && i < voice.length; i++) {
            System.out.print("Введите имя кандидата: ");
            getName[i] = userInput.next( );
            Random rand = new Random();
            voice [i] =(int) getName ( random() * 10);
            System.out.println("имя кандидата" + getName[i] + voice[i]);
        }
    }
    public static String highest(int[] voice, String name[]) {
        int high = voice[0];
        String s = name [0];
        for (int i = 1; i < voice.length; i++) {
            if (voice[i] > high) {
                high = voice[i];
                s = name[i];
            }
        }
        s = s + "" + high;
        return s;
        names[Arrays.asList(names).indexOf(highest(votes))];
    }
    public String toString() {
        return
    }
}
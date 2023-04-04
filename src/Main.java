// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Tugas No 1 (Do While)

        Scanner sc = new Scanner(System. in);
        Random rand = new Random();
        int upperbound = 10;
        int x,y,yy,r;
        y = rand.nextInt(upperbound);
        System.out.println("The number is y = " + y);
        yy = y;
        r = 0;
        System.out.println("Input multiple number: ");
        do {
            x=sc.nextInt();
            if(x%y == 0){
                r++;
            }
        }while(x%y==0);
        System.out.println("Amount of right answer: " + r);
    }
}
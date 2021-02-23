import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[]args) throws IOException {
        Random kor = new Random();
        File kofile = new File("Uczniowie.txt");
        Scanner kosc = new Scanner(kofile);


        String uczniowie[] = new String[10];
        for(int a=0;a<uczniowie.length;a++){

        }


        int ocena[] = new int [6];
        for (int i=0;i<ocena.length;i++){
            ocena[i]= kor.nextInt(6)+1;
            System.out.println(ocena[i]);
        }





    }
}

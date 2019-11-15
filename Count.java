package practice;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbę");
        int x = inputScanner.nextInt();
        loop(x);
        loop2(x);
    }
//Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
    public static void loop(int x){
        for (int i=0;i<(x+1);i++){
            System.out.println(i);
        }
    }
//Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
    public static void loop2(int x){
        int i=0;
        while (i<(x+1)){
            System.out.println(i);
            i++;
        }
    }
}

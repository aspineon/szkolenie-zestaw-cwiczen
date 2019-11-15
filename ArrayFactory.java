package practice;

import java.util.Scanner;

public class ArrayFactory {
    private final int x;
    public ArrayFactory(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbę");
        int x = inputScanner.nextInt();
        for (int i=0; i<x;i++){
            for (int j=0; j<x;j++){
                System.out.print(twoDimension(x)[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] oneDimension(int x) {
        return new int[x];
        }
    public static int[][] twoDimension(int x) {
        int[][] tablica = new int[x][x];
        for (int i=0;i<x;i++){
            for (int j=0;j<x;j++){
                if (i==j){
                    tablica[i][j]=1;
                } else {
                    tablica[i][j]=0;
                }
            }
        }
        return tablica;
    }
}


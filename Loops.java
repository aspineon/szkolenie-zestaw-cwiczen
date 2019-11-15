package practice;

import java.util.Scanner;

public class Loops {
//Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1)
    public static void reverseInt(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int x = inputScanner.nextInt();
        String newOne = new String();
        int j=String.valueOf(x).length()-1;
        for (int i=0; i<String.valueOf(x).length();i++){
            newOne+=String.valueOf(x).substring(j,(j+1));
            j--;
        }
        System.out.println(newOne);
    }
//Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w “seip”,
    public static void reverseString(String string){
        String newString=new String();
        int i=0;
        int j = string.length()-1;

        while (i<string.length()){
            newString+=string.substring(j,(j+1));
            j--;
            i++;
        }
        System.out.println(newString);
    }
//Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej
    public static void binary(int liczba){
        int wynik=liczba/2;
        int reszta=0;
        String bin=String.valueOf(liczba%2);
        liczba=wynik;

        while (liczba>0){
            wynik=liczba/2;
            reszta=liczba%2;
            bin=String.valueOf(reszta)+bin;
            liczba=wynik;
        }
        System.out.println(bin);
    }
//Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
    public static boolean palindrom(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        char[] ciag;
        ciag=inputScanner.nextLine().toCharArray();
        int j=ciag.length-1;
        int status=0;
        for (int i = 0;i<ciag.length;i++){
            if (ciag[i]==ciag[j]){
                status++;
            }
            j--;
        }
        if (status==ciag.length){
            return true;
        } else {
            return false;
        }
    }
//Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”
    public static void tablica(int array[]){
        System.out.print("[");
        for (int i=0;i<(array.length);i++){
            System.out.print(array[i]);
            if (i==(array.length-1)){
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }

    }
//Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do największej liczby
    public static int[] babelki(int array[]){
        int zmiana = 1;
        int zmienna = 0;
        while (zmiana==1){
            zmiana=0;
            for (int i =0;i<array.length;i++){
                if (i<array.length-1){
                    if (array[i] > array[(i + 1)]) {
                        zmienna = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = zmienna;
                        zmiana = 1;
                    }
                }
            }

        }
        return array;
    }
    public static void main(String[] args) {
        String string = "Akronim";
        int liczba =5;
        int[] array = new int[]{9,5,7,3,1,8,6,9,4,2,1};

        reverseString(string);
        reverseInt();
        binary(liczba);
        System.out.println(palindrom());
        tablica(babelki(array));
    }
}

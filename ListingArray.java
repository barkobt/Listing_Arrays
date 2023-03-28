import java.util.Arrays;
import java.util.Scanner;

/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221
 */
public class ListingArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz n: ");
        int n = scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz: ");
        int[] arr = new int[n];
        int[] arrTemp = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            arr[i] = x;
            System.out.println((i + 1) + ". Elemanı: " + x);
        }
        int arr2;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr2;
                }
            }
        }
        System.out.println("Sıralı dizimiz \t: " + Arrays.toString(arr));


    }
}
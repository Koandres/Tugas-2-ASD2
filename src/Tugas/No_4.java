package Tugas;
import java.util.Scanner;
public class No_4 {
    public static void main(String[]args){
        int i,j,m,n;
        int matriks[][]= new int[2][3];
        int transpose[][]= new int [3][2];
        Scanner scan = new Scanner(System.in);
        m = 2;
        n = 3;
        System.out.println("Masukkan elemen matriks: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(matriks[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Koandres");
    }
}

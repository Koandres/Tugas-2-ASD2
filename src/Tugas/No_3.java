package Tugas;
public class No_3 {
    public static void main(String[]args){
        int[][] A={
            {3,8,3},
            {4,2,4}
        };
        int[][] B={
            {3,3},
            {2,5},
            {6,3}
        };
        if(A[0].length == B.length){
            int[][] C= new int[A[0].length][B.length];
            for(int i=0;i<A[0].length;i++){
                for(int j=0;j<B.length;j++){
                    for(int k=0;k<A.length;k++){
                        C[i][j]+= A[k][i]*B[j][k];
                    }
                }
            }
            for(int[]c:C){
                for(int i:c){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran kolom A tidak sama dengan baris B");
        }
        System.out.println();
        System.out.println("Koandres");
    }
}

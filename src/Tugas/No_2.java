package Tugas;
public class No_2 {
    public static void main(String[]args){
        int [][] A={
            {7,6},
            {8,9},
            {11,10}
        };
        int [][] B={
            {1,2},
            {5,6},
            {9,10},
        };
        if((A.length == B.length)&&(A[0].length == B[0].length)){
            int [][] C=new int[A.length][A[0].length];
            for(int i=0;i<A.length;i++){
                for(int j=0;j<A[0].length;j++){
                    C[i][j]=A[i][j]-B[i][j];
                }
            }
            for(int[]c:C){
                for(int q:c){
                    System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(C[1][1]);
        }
        else{
            System.out.println("Cek dulu ukuran matrixnya :)");
        }
        System.out.println();
        System.out.println("Koandres");
    }
}

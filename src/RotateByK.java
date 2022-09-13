import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] ar = new int[n];
        for(int i =0; i<n;i++){
            ar[i] = scan.nextInt();
        }
        int b = scan.nextInt();
        int i =0; int j = ar.length-1;
        solveRev(i, j, ar);
        solveRev(i, b, ar);
        solveRev(b, j, ar);

        for(int p =0;p<ar.length;p++){
            System.out.print(ar[p]+" ");
        }
    }
    static void solveRev(int i, int j, int[] ar){
        while(i<j)
        {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
}

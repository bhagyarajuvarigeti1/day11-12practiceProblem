import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Stocks");
        int N = in.nextInt();
        String[][] arr = new String [N][3];
        for(int i = 0;i < N;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=in.nextLine();
            }
        }
    }
}

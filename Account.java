import java.util.Scanner;

public class Account {
    public static int savings;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount in account");
        int Savings = in.nextInt();
    }
    public static int debit(int withDraw){
        if(withDraw>savings){
            System.out.println("not sufficient amount in account");
            return savings;
        }
        savings = savings - withDraw;
        return savings;

    }
}

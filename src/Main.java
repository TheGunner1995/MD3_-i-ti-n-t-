import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner USD = new Scanner(System.in);
        System.out.println("nhập số tiền USD : ");
        int money = USD.nextInt();
        int VND = money * 23;
        System.out.println( "VND = " +VND);

    }
}
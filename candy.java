import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 10, K = 5;
        int jar = N;

        int order = sc.nextInt();

        if (order > jar || order <= 0) {
            System.out.println("INVALID INPUT");
        } else {
            jar -= order;

            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available:" + jar);

            if (jar <= K) jar = N;
        }

        sc.close();
    }
}

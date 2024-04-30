package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = Integer.parseInt(tec.nextLine());

        for (int i = 0; i < n; i++){
            int value = Integer.parseInt(tec.nextLine());
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        tec.close();
    }
}

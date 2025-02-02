import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Введите конечное значение индекса: ");
        double n = scan1.nextDouble();

        System.out.print("Введите значение Х: ");
        double x = scan1.nextDouble();

        if (Math.abs(x) < 1)
        {
            double result = 0;
            for (double i = 0; i <= n; i++)
            {
                double numerator = 1;
                double j = 1;
                for(; j <= i; j = j + 2)
                {
                    numerator=numerator*j;
                }
                double denominator = 1;
                double l = 2;
                for (; l <= i; l = l + 2)
                {
                    denominator=denominator*l;
                }
                result += (numerator*Math.pow(x,2*j+1))/(denominator*(2 * l + 1));
            }

            System.out.println("Результат: " + (x + result));
        }
        else
        {
            System.out.println("неверное значение х");
        }
    }
}
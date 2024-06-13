import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.print("Enter a number (0 to quit): ");
            int number = console.nextInt();
            
            // Verifica se o número informado é 0
            if (number == 0) {
                break;
            }
            
            sum += number;  // Adiciona o número à soma
            count++;        // Incrementa o contador
        }

        System.out.println("The sum of the numbers is " + sum);
        console.close();
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double k, m;
        /*leia uma velocidade em km/h (quilômetros por hora) e apresente convertida em m/s (metros por segundo). A fórmula de conversão é M = K/36, sendo K a velocidade em km/h e M em m/s.*/ 
        
        System.out.println();
        System.out.println("Conversão de velocidade");
        System.out.println();
        System.out.print("Digite uma velocidade em km/h: ");
        k = scanner.nextDouble();
        System.out.println();
        m = k / 3.6;
        System.out.printf("A velocidade convertida em m/s é de: %.2f", m);


        scanner.close();
    }
}

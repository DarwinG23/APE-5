import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n----------------------------------------------------");
        System.out.println("Un cordial saludo estimado usuario");
        System.out.print("Ingresar la longitud del Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingresar la longitud del Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingresar la longitud del Lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        double area = triangulo.calcularArea();
        System.out.printf("El área del triángulo es: %.2f", area);
        System.out.println("\n----------------------------------------------------");
    }
}

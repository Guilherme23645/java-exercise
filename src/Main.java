import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        do {
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Círculo");
            System.out.println("4. Sair");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> squareArea();
                case 2 -> rectangleArea();
                case 3 -> circleArea();
                case 4 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (choice != 4);
    }

    public static void squareArea() {
        System.out.println("Informe o tamanho do lado do quadrado:");
        double side = scanner.nextDouble();
        Shape square = new Square(side);
        System.out.println(square.getArea());
    }

    public static void rectangleArea() {
        System.out.println("Informe o comprimento do retângulo:");
        double width = scanner.nextDouble();
        System.out.println("Informe a altura do retângulo:");
        double height = scanner.nextDouble();
        Shape rectangle = new Rectangle(width, height);
        System.out.println(rectangle.getArea());
    }

    public static void circleArea() {
        System.out.println("Informe o tamanho do lado do quadrado:");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println(circle.getArea());
    }
}

public class App {
    public static void main(String[] args) {
        int num = 5;

        int tableLength = 10;

        System.out.println("Tabela de multiplicação por " + num);

        for (int i = 1; i <= tableLength; i++) {
            int multiplication = num * i;
            System.out.println(num + " x " + i + " = " + multiplication);
        }
    }
}

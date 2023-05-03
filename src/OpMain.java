import java.util.Scanner;

public class OpMain {
    public OpMain() {
    }
    public void op() {
        Scanner scanner = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();
        Registro registro = new Registro();
        int x = 0;

        while(x != 3) {
            System.out.println("\t\t- - M E N U - -\n(1) Ingresar\n(2) Mostrar\n(3) Salir\nIngresa una opcion: ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    registro.ingresar(scanner);
                    break;
                case 2:
                    temperatura.muestra(registro);
                    break;
                case 3:
                    System.out.println("Saliste del prgrama");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }

    }
}

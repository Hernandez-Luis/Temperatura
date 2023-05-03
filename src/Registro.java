import java.util.Scanner;
public class Registro {
    Paciente[] paciente;
    public void ingresar(Scanner scanner) {
        CalcularTemperatura calcularTemperatura = new CalcularTemperatura();
        paciente = new Paciente[5];
        double tempFahrenheit = 0,tempCelcius = 0;

        for (int i = 0; i < paciente.length; i++) {
            System.out.println("Ingresa el nombre: ");
            String nombre = scanner.next();
            System.out.println("Edad: ");
            int edad = scanner.nextInt();
            System.out.println("Ingrea la unidad de temperatura: Celcius (1) o Fahrenheit (2) ");
            int tipo = scanner.nextInt();
            System.out.println("Ingresa la temperatura: ");
            double temp = scanner.nextDouble();
            if(tipo==1) {
                tempFahrenheit = calcularTemperatura.celciusAFahrenheit(temp);
                tempCelcius = temp;
            }
            else if (temp==2) {
                tempCelcius = calcularTemperatura.fahrenheitACelcius(temp);
                tempFahrenheit = temp;
            }
            paciente [i] = new Paciente(nombre, edad, tempCelcius, tempFahrenheit);
        }
    }
}

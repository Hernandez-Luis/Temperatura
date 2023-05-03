public class Paciente {
    String nombre;
    int edad;
    double temperaturaC;
    double temperaturaF;

    public Paciente(String nombre, int edad, double temperaturaC, double temperaturaF) {
        this.nombre = nombre;
        this.edad = edad;
        this.temperaturaC = temperaturaC;
        this.temperaturaF = temperaturaF;
    }

    @Override
    public String toString() {
        return " Nombre: " + this.nombre + "\tEdad: " + this.edad + " años \n\t\tTemperatura\nCelcius: " + this.temperaturaC + " Fahrentheit: " + this.temperaturaF;
    }
}
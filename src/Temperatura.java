
public class Temperatura {

    public void muestra(Registro registro) {
        System.out.println("\t\t- - D A T O S - -");
        for (int i = 0; i < 5; i++) {
            System.out.println("Paciente " + (i+1) + ": ");
            System.out.println(registro.paciente[i].toString());
            System.out.println("\n______________________________________________");
        }
    }
}
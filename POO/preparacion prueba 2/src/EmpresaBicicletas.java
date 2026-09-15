import java.util.ArrayList;
import java.util.Scanner;

public abstract class EmpresaBicicletas implements GestionArriendos{
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Arriendo> arriendos = new ArrayList<>();

    @Override
    public int leerEntero(String mensaje) {
        return System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());;
    }

    @Override
    public void registrarArriendo(){
        System.out.println("Ingresa el codigo del arriendo");
        String codigo = entrada.nextLine().trim();
        System.out.println("Ingresa el nombre del usuario");
        String nombre = entrada.nextLine().trim();
        int horasUso = leerEntero("Ingrese la cantidad de horas");

        System.out.println("1. Bicicleta Normal");
        System.out.println("2. Bicleta Electrica");
        int tipo = leerEntero("Seleccione el tipo de bicicleta");
        Arriendo arriendo;

        if (tipo==1){
            arriendo = new ArriendoNormal(codigo,nombre,horasUso);
        }else if(tipo==2) {
            arriendo = new ArriendoElectrico(codigo,nombre,horasUso);
        }
        else{
            throw new IllegalArgumentException("El tipo de bicicleta debe ser 1 o 2");
        }
        arriendos.add(arriendo);
        System.out.println("Arriendo exitoso");

    }
}

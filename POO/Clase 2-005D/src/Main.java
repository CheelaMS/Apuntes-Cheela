public class Main {
    public static void main(String[] args) {
        //condicionales

        int edad = 20;
        if(edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        //if else
        int edadCliente = 16;
        if(edadCliente>=16) {
            System.out.println("Puede ingresar al cine");
        }else{
            System.out.println("No cumple con la edad necesaria");
            }
        //

        int edadUsuario = 22;
        boolean tieneEntrada = true;
        if(edadUsuario >= 18 && tieneEntrada){
            System.out.println("Puede ingresar");
        }else{
            System.out.println("No puede ingresar");
        }

        //else if

        double nota = 5.5;

        if (nota >= 6.0){
            System.out.println("Excelente");
        }else if (nota >= 5.0){
            System.out.println("Bueno");
        } else if (nota >= 4.0) {
            System.out.println("Aprobado");

        }else {
            System.out.println("Reprobado");
        }
        // Ejemplo temperatura

        int temperatura = 28;

        if (temperatura>=30){
            System.out.println("Hace mucho calor");
        } else if (temperatura >= 20) {
            System.out.println("Temperatura agradable");

        } else if (temperatura >= 10) {
            System.out.println("Hace frio");
        } else {
            System.out.println("Esta helao");
        }

        //switch

        int opcion= 4;

        switch (opcion){
            case 1:
                System.out.println("Crear Usuario");
                break;
            case 2:
                System.out.println("Actualizar Usuario");
                break;
            case 3:
                System.out.println("Eliminar Usuario");
                break;
            case 4:
                System.out.println("Mostrar Usuarios");
                break;
            default:
                System.out.println("Opcion invalida");
                break;

        }

        // operador ternario = condicional ? = If, : = Else

        int edadPersonaTernaria = 16;

        String mensajeEdad = edadPersonaTernaria >=18 ? "Eres mayor de edad" : "Eres menor edad";

        System.out.println(mensajeEdad);

        //control de acceso
        //JavaDocs

        String nombrePersona = "Camila";
        int edadPersona = 30;
        double altura = 1.65;
        boolean tieneEntradaAtraccion = true;
        int tipoEntrada = 2;

        switch (tipoEntrada){
            case 1:
                System.out.println("Entrada general");
                break;
            case 2:
                System.out.println("Entrada VIP");
                break;
            case 3:
                System.out.println("Entrada Estudiante");
                break;
            default:
                System.out.println("Tipo de entrada invalida");
                break;

        }
        if(!tieneEntradaAtraccion){
            System.out.println("Acceso rechazado: No tiene entrada");
        }else if(edadPersona<12){
            System.out.println("Acceso rechazado: No tiene edad requirida");
        } else if (altura<1.40) {
            System.out.println("Acceso rechazado: Altura menor a la requerida");
        }else {
            System.out.println("Acceso autorizado");
        }


    }
}

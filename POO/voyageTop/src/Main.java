import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//
public class Main {
    static Scanner entrada = new Scanner(System.in);

    static ArrayList<PaqueteTuristico> paqueteTuristicos = new ArrayList<>();

    static String leerString(String mensaje){
        System.out.println(mensaje);
        return entrada.nextLine();
    }
    static int leerEntero(String mensaje){
        System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }
    static double leerDecimal(String mensaje){
        System.out.println(mensaje);
        return Double.parseDouble(entrada.nextLine());
    }

    public static void main(String[] args){

        System.out.println("""
                ============================================
                AGENCIA DE VIAJES VOYAGETOP
                ============================================
                """);
        double impuesto = -1;

        while (true)try {

            impuesto = leerDecimal("Ingrese el porcentaje de impuesto");

            if (0 > impuesto || impuesto > 100) {
                System.out.println("Impuesto no puede ser menor a 0 o mayor a 100");
            } else {
                System.out.println("Impuesto de un "+impuesto+"%");
                break;
            }
        }catch (NumberFormatException e) {
            System.out.println("Error: Dato ingresado debe ser un numero");
        }catch (Exception error){
            System.out.println("Error: inesperado");
        }//el ingreso del impuesto lo deje al principio siguiendo el ejemplo de menu sugerido en la guia

        int opcion= -1;
        while (opcion != 0){
            System.out.println("""
                    MENÚ PRINCIPAL
                    1. Registrar paquete
                    2. Mostrar todos los paquetes
                    3. Buscar por destino
                    4. Buscar por destino y tipo
                    5. Contratar seguro (paquete internacional)
                    6. Consultar seguro (paquete internacional)
                    0. Salir
                    
                    """);
            try {
                opcion = leerEntero("Seleccione una opción:");
                switch (opcion){
                    case 1:
                        registrarPaquete();
                        break;
                    case 2:
                        mostrarPaquetes(impuesto);
                        break;
                    case 3:
                        buscarDestino(impuesto);
                        break;
                    case 4:
                        buscarDestinoTipo(impuesto);
                        break;
                    case 5:
                        int posicion = leerEntero("Seleccione posicion del paquete:");
                        PaqueteTuristico paquete = paqueteTuristicos.get(posicion);
                        if (!Objects.equals(paquete.getTipo(), "Paquete Internacional")){
                            System.out.println("Paquete no valido para contratar seguro");
                        }else{
                            PaqueteInternacional paqueteInternacional = (PaqueteInternacional) paquete;
                            paqueteInternacional.contratarSeguro(leerString("Ingrese compañia de seguro: "));
                        }
                        break;
                    case 6:
                        int posicion2 = leerEntero("Seleccione posicion del paquete:");
                        PaqueteTuristico paquete2 = paqueteTuristicos.get(posicion2);
                        if (!Objects.equals(paquete2.getTipo(), "Paquete Internacional")){
                            System.out.println("Paquete no valido para contratar seguro");
                        }else{
                            PaqueteInternacional paqueteInternacional2 = (PaqueteInternacional) paquete2;
                            paqueteInternacional2.consultarSeguro();
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema.");
                        entrada.close();
                        break;

                    default:
                        System.out.println("Opcion no existe");
                        break;
                }

            }catch (NumberFormatException e){
            System.out.println("Error: Dato ingresado debe ser un numero");
            }catch (IndexOutOfBoundsException e){
            //user pone posicion inexistente en el caso 5 o 6
            System.out.println("Error: Posición no existe");
            }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
            }catch(Exception e){
            System.out.println("Error inesperado");
            }


        }
    }
    static Boolean seleccionSiNo(String mensaje){
        System.out.println(mensaje);
        int seleccion = leerEntero("1.Si 2.No");
        while(true){
            if(seleccion==1){
                return true;
            }else if(seleccion==2) {
                return false;
            }else {
            System.out.println("Opción invalida");
            }
        }
    }
    static void registrarPaquete(){
        PaqueteTuristico paqueteTuristico;
        String nombre = leerString("Ingrese nombre completo del pasajero/a:");
        String pasaporte = leerString("Ingrese Pasaporte del pasajero/a");
        String email = leerString("Ingrese email del pasajero/a");
        Pasajero pasajero = new Pasajero(nombre,pasaporte,email);
        int tipo = leerEntero("""
                    Seleccione el tipo de paquete turistico:
                    1- Nacional
                    2- Internacional
                    3- Crucero
                    """);
        String destino;
        int duracion;

        switch (tipo){
            case 1:
                destino=leerString("Ingrese el destino del pasajero/a");
                duracion = leerEntero("Ingrese duracion del viaje en dias");
                paqueteTuristico = new PaqueteNacional(destino,duracion,pasajero);
                break;
            case 2:
                destino=leerString("Ingrese el destino del pasajero/a");
                duracion = leerEntero("Ingrese duracion del viaje en dias");
                Boolean primeraclase = seleccionSiNo("¿Primera clase?");
                paqueteTuristico = new PaqueteInternacional(destino,duracion,pasajero,primeraclase);
                break;
            case 3:
                destino=leerString("Ingrese el destino del pasajero/a");
                duracion = leerEntero("Ingrese duracion del viaje en dias");
                Boolean balcon = seleccionSiNo("¿Camarote con Balcón?");
                paqueteTuristico = new PaqueteCrucero(destino,duracion,pasajero,balcon);
                break;
            default:
                throw new IllegalArgumentException("Opcion Invalida");
        }
        paqueteTuristicos.add(paqueteTuristico);
        System.out.println("Paquete registrado con exito");
    }
    static void mostrarPaquetes(double impuesto){
        if (paqueteTuristicos.isEmpty()){
            System.out.println("No existen paquetes registrados");

        }
        int contador = 0;
        for (PaqueteTuristico paqueteTuristico: paqueteTuristicos){

            paqueteTuristico.mostrarDatos(impuesto);

            System.out.println("Posicion en la lista: "+ contador);
            contador ++;
            System.out.println("--------------------------------------------\n");
        }
    }
    static void buscarDestino(double impuesto){
        String destino = leerString("Seleccione el destino a buscar: ");
        destino = destino.toUpperCase();
        for(PaqueteTuristico paqueteTuristico: paqueteTuristicos){
            if(paqueteTuristico.getDestino().toUpperCase().equals(destino)){
                paqueteTuristico.mostrarDatos(impuesto);
            }
        }
    }
    static void buscarDestinoTipo(double impuesto){
        String destino = leerString("Seleccione el destino a buscar: ");
        destino = destino.toUpperCase();
        String tipo="";
        int seleccion = leerEntero("""
                    Seleccione el tipo de paquete turistico:
                    1- Nacional
                    2- Internacional
                    3- Crucero
                    """);
        if(seleccion==1){
            tipo = "Paquete Nacional";
        } else if (seleccion==2) {
            tipo = "Paquete Internacional";
        } else if (seleccion==3) {
            tipo = "Paquete Crucero";
        }else{
            System.out.println("Seleccion invalida");
        }
        for (PaqueteTuristico paqueteTuristico: paqueteTuristicos){
            if(paqueteTuristico.getDestino().toUpperCase().equals(destino)&& paqueteTuristico.getTipo().equals(tipo)){
                paqueteTuristico.mostrarDatos(impuesto);
            }
        }
    }

}

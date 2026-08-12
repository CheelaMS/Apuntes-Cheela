public class Main {
    //metodo principal para ejecutar java
    public static void main(String[] args) {

        System.out.println("Tipos de datos");

        int edad = 26;
        double estatura = 1.65;
        char inicial = 'C';
        boolean estudiante = true;
        String nombre = "Cheela";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + estudiante);

        System.out.println("========Operaciones Arismeticas========");

        int numero1 = 20;
        int numero2 = 17;

        System.out.println("Suma: " + (numero1+numero2));
        System.out.println("Resta: " + (numero1-numero2));
        System.out.println("Multiplicacion: " + (numero1*numero2));
        System.out.println("Division: " + (numero1/numero2));
        System.out.println("Modulo: " + (numero1%numero2));

        System.out.println("=====Operadores Comparaciones========");

        System.out.println("Es mayor: " + (edad > 18));
        System.out.println("Es menor: " + (edad < 18));
        System.out.println("Es mayor o igual: " + (edad >= 18));
        System.out.println("Es menor o igual: " + (edad <= 18));
        System.out.println("Es igual: " + (edad == 18));
        System.out.println("Es distinto: " + (edad != 18));

        System.out.println("=====Operadores Logicos========");

        boolean tieneDinero = true;
        boolean productoDisponible = true;

        boolean puedeComprar = tieneDinero && productoDisponible;
        System.out.println("Se puede comprar" + puedeComprar);

        System.out.println("=====Precedencia===============");

        int resultado1 = 10+5*2;
        int resultado2 = (10+5)*2;

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);

        System.out.println("=========Asignacion===========");

        int saldo = 20000;

        saldo+= 2000;
        saldo-=100;

        System.out.println("Saldo: " + saldo);

        System.out.println("=========Incremento y Decremento===========");

        int vidas = 3;

        vidas++;
        vidas--;
        vidas--;

        System.out.println("Vidas: " + vidas);









    }
}

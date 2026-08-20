public class Main {
    public static void main(String[] args){
        System.out.println("Sistema de Vehículos");
        System.out.println();

        //crear auto

        Auto auto = new Auto("Mazda","Mazda 3", 4);
        Moto moto = new Moto("Yamaha", "R15", 150);

        auto.mostrarInformacion();
        System.out.println();
        moto.mostrarInformacion();
        System.out.println();

        System.out.println("Acelerando");

        auto.acelerar(180);
        moto.acelerar(146);

        System.out.println("Velocidad Auto: "+auto.getVelocidad());
        System.out.println("Velocidad Moto: "+moto.getVelocidad());

        System.out.println("Modificar datos");
        auto.setModelo("Miata");
        auto.mostrarInformacion();

        //detener
        System.out.println("Detener");
        auto.detener();
        moto.detener();

        System.out.println("Auto Detenido: "+auto.getVelocidad()+" km/h");
        System.out.println("Moto Detenida: "+moto.getVelocidad()+" km/h");

    }
}

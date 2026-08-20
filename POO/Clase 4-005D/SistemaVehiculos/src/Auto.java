public class Auto extends Vehiculo {
    //atributo especifico
    private int cantidadPuertas;
    //constructor
    public Auto(String marca, String modelo, int cantidadPuertas){
        //llamar a super para heredar
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        if(cantidadPuertas > 0) {
            this.cantidadPuertas = cantidadPuertas;
        }else{
            System.out.println("Ingrese un dato valido");
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("AUTO");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cantidad de puertas: "+getCantidadPuertas());
        System.out.println("Velocidad: "+getVelocidad()+" km/h");
    }
}

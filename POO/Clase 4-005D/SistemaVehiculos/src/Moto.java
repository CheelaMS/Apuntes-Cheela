public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if(cilindrada>0){
            this.cilindrada = cilindrada;
        }

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("MOTO");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cilindrada: "+getCilindrada()+" cc");
        System.out.println("Velocidad: "+getVelocidad()+" km/h");
    }
}

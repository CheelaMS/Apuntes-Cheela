public class PaqueteNacional extends PaqueteTuristico {
    public PaqueteNacional(String destino, int duracion, Pasajero pasajero) {
        super(destino, duracion, pasajero);
    }

    @Override
    public double calcularCosto() {
        return 150000;
    }

    @Override
    public String getTipo() {
        return "Paquete Nacional";
    }

    @Override
    public void mostrarDatos(double impuesto) {
        System.out.println("""
                --------------------------------------------
                PAQUETE REGISTRADO
                --------------------------------------------""");

        System.out.println("Destino: "+ getDestino());
        System.out.println("Duracion: "+ getDuracion());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Pasajero: "+ getPasajero().getNombreCompleto());
        System.out.println("Pasaporte: "+ getPasajero().getPasaporte());
        System.out.println("Correo: "+getPasajero().getEmail());
        System.out.println("Costo calculado: "+calcularCosto());
        System.out.println("Impuesto aplicado: "+impuesto+"%");
        System.out.println("Precio Final: "+ calcularPrecioFinal(impuesto));
        System.out.println("--------------------------------------------");
    }


}

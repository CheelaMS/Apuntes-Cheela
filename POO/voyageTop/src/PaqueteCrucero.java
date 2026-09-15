public class PaqueteCrucero extends PaqueteTuristico{
    private Boolean balcon;

    public PaqueteCrucero(String destino, int duracion, Pasajero pasajero,Boolean balcon) {
        super(destino, duracion, pasajero);
        this.balcon = balcon;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    @Override
    public double calcularCosto() {
        if (getBalcon()){
            return  800000*1.25;
        }else {
            return 800000;
        }
    }

    @Override
    public String getTipo() {
        return "Paquete Crucero";
    }

    @Override
    public void mostrarDatos(double impuesto) {
        System.out.println("""
                --------------------------------------------
                PAQUETE REGISTRADO
                --------------------------------------------""");

        System.out.println("Destino: " + getDestino());
        System.out.println("Duracion: " + getDuracion());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Pasajero: " + getPasajero().getNombreCompleto());
        System.out.println("Pasaporte: " + getPasajero().getPasaporte());
        System.out.println("Correo: " + getPasajero().getEmail());
        if (getBalcon()) {
            System.out.println("Balcón: Si");
        } else {
            System.out.println("Balcón: No");
        }
        System.out.println("Costo calculado: " + calcularCosto());
        System.out.println("Impuesto aplicado: " + impuesto + "%");
        System.out.println("Precio Final: " + calcularPrecioFinal(impuesto));
        System.out.println("--------------------------------------------");
    }
}

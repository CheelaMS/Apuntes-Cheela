public class PaqueteInternacional extends PaqueteTuristico implements Asegurable{
    private Boolean primeraclase; //decidi manejar las variables primera clase y si tiene seguro con booleanos, no se la diferencia entre Booleano con Mayus o sin mayus pero puse todos los booleanos con mayus y no genero problemas.
    private Boolean seguro = false;
    private String companiaSeguro;

    public String getCompaniaSeguro() {
        return companiaSeguro;
    }

    public void setCompaniaSeguro(String companiaSeguro) {
        this.companiaSeguro = companiaSeguro;
    }

    public Boolean isPrimeraclase() {
        return primeraclase;
    }

    public void setPrimeraclase(Boolean primeraclase) {
        this.primeraclase = primeraclase;
    }

    public Boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public PaqueteInternacional(String destino, int duracion, Pasajero pasajero, Boolean primeraclase) {
        super(destino, duracion, pasajero);

        this.primeraclase = primeraclase;
    }

    @Override
    public void contratarSeguro(String compania) {
        setSeguro(true);
        setCompaniaSeguro(compania);
        System.out.println("Seguro actualizado: " + compania + " asignada a pasajero "+ getPasajero().getNombreCompleto() );
    }

    @Override
    public void consultarSeguro() {
        if(isSeguro()){
            System.out.println("Pasajero "+ getPasajero().getNombreCompleto()+ " ya posee seguro. Su compañia de seguro es: "+getCompaniaSeguro());
        }else{
            System.out.println("Pasajero "+getPasajero().getNombreCompleto() + " no posee seguro");
        }

    }

    @Override
    public double calcularCosto() {
        if (isPrimeraclase()){
            return 450000*1.35;
        }else{
            return 450000;
        }
    }

    @Override
    public String getTipo() {
        return "Paquete Internacional";
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
        if(isPrimeraclase()){
            System.out.println("Primera clase: Si");
        }else{
            System.out.println("Primera clase: No");
        }
        System.out.println("Costo calculado: "+calcularCosto());
        System.out.println("Impuesto aplicado: "+impuesto+"%");
        System.out.println("Precio Final: "+ calcularPrecioFinal(impuesto));
        if(isSeguro()) {
            System.out.println("Seguro: Si");
            System.out.println("Compañia: " + getCompaniaSeguro());
        }else{
            System.out.println("Seguro: No");
        }


        System.out.println("--------------------------------------------");
    }
}

public abstract class PaqueteTuristico {
    private String destino;
    private int duracion; //duracion en dias
    private Pasajero pasajero;

    public PaqueteTuristico(String destino, int duracion, Pasajero pasajero) {
        if (destino.isBlank()||duracion <= 0){
            throw new IllegalArgumentException("Datos inválidos: destino no puede esta vacío o duración es menor a 0 días");
        }else {

            this.destino = destino;
            this.duracion = duracion;
            this.pasajero = pasajero;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
// algunos setters no seran utilizados sin embargos los decidi mantener pensando en ampliacion del codigo.
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public abstract double calcularCosto();
    public abstract String getTipo();

    public double calcularPrecioFinal(double impuesto){
        return calcularCosto() * ((impuesto/100)+1);
    }

    public abstract void mostrarDatos(double impuesto);
    //agregue metodo mostrar datos para simplificarme la vida a la hora de mostrar datos en las funciones 2,3 y 4 del menu
}

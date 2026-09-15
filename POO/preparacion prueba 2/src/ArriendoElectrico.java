public class ArriendoElectrico extends Arriendo{
    public ArriendoElectrico(String codigo, String nombre, int horasUso) {
        super(codigo, nombre, horasUso);
    }

    @Override
    public String getTipo() {
        return "Bicicleta Electrica";
    }

    @Override
    public int calcularTotal() {
        return (5000 * getHorasUso()) + 2000;
    }
}


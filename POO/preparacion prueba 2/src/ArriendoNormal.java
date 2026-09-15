public class ArriendoNormal extends Arriendo{
    public ArriendoNormal(String codigo, String nombre, int horasUso) {
        super(codigo, nombre, horasUso);
    }

    @Override
    public String getTipo() {
        return "Bicicleta Normal";
    }

    @Override
    public int calcularTotal() {
        return 3000 * getHorasUso();
    }
}

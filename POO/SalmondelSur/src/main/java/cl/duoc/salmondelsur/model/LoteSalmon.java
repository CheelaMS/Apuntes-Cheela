package cl.duoc.salmondelsur.model;

// Clase base: datos comunes, encapsulamiento y validaciones.
public abstract class LoteSalmon {
    private final int id;
    private final String codigo;
    private final String centro;
    private final int kilos;

    public LoteSalmon(int id, String codigo, String centro, int kilos) {
        if (codigo == null || codigo.isBlank() || centro == null || centro.isBlank()) {
            throw new IllegalArgumentException("Código y centro son obligatorios.");
        }
        if (kilos <= 0) {
            throw new IllegalArgumentException("Los kilos deben ser mayores que cero.");
        }
        this.id = id;
        this.codigo = codigo.trim();
        this.centro = centro.trim();
        this.kilos = kilos;
    }

    public int getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getCentro() { return centro; }
    public int getKilos() { return kilos; }

    // Cada clase hija define su tipo y el valor estimado del lote.
    public abstract String getTipo();
    public abstract int getValorEstimado();

    @Override
    public String toString() {
        return codigo + " | " + centro + " | " + getTipo() + " | "
                + kilos + " kg | $" + getValorEstimado();
    }
}

package cl.duoc.salmondelsur.model;

// Tarifa didáctica: $7.500 por kilogramo de salmón fresco.
public class LoteFresco extends LoteSalmon {
    public LoteFresco(int id, String codigo, String centro, int kilos) {
        super(id, codigo, centro, kilos);
    }

    @Override
    public String getTipo() { return "FRESCO"; }

    @Override
    public int getValorEstimado() { return getKilos() * 7500; }
}

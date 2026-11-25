package cl.duoc.salmondelsur.model;

// Tarifa didáctica: $6.500 por kilogramo de salmón congelado.
public class LoteCongelado extends LoteSalmon {
    public LoteCongelado(int id, String codigo, String centro, int kilos) {
        super(id, codigo, centro, kilos);
    }

    @Override
    public String getTipo() { return "CONGELADO"; }

    @Override
    public int getValorEstimado() { return getKilos() * 6500; }
}

public abstract class Arriendo {
    private String codigo;
    private String nombre;
    private int horasUso;

    public Arriendo(String codigo, String nombre, int horasUso) {
        if (codigo.isBlank()||nombre.isBlank()|| horasUso <= 0){
            throw new IllegalArgumentException("Datos invalidos");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.horasUso = horasUso;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public abstract String getTipo();

    public abstract int calcularTotal();

    public String mostrarDetalle(){
        return codigo
                + " | " + nombre
                + " | " + getTipo()
                + " | " + horasUso + " Hrs."
                + " | Total: $" + calcularTotal();

    }




}

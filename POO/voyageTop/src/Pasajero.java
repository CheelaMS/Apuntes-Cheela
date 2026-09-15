public class Pasajero {
    private String nombreCompleto;
    private String pasaporte;
    private String email;

    public Pasajero(String nombreCompleto, String pasaporte, String email) {
        if (nombreCompleto.isBlank()||pasaporte.isBlank()||email.isBlank()){
            throw new IllegalArgumentException("Datos invalidos (no pueden estar en blanco)");
        }else{

            this.nombreCompleto = nombreCompleto;
            this.pasaporte = pasaporte;
            this.email = email;
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public abstract class Vehiculo {
    private String marca;
    private String modelo;

    private int velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    //getter
    //public tipoDato get + atributo(){}
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        //validar que la marca no este vacia
        if (marca != null && !marca.isBlank()){
        this.marca=marca;
        }else{
            System.out.println("Ingresa un dato valido");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isBlank()){
        this.modelo = modelo;
        }else{
            System.out.println("Ingrese un dato valido");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad>=0) {
            this.velocidad = velocidad;
        }else{
            System.out.println("Ingrese un dato valido");
        }
    }
    //metodo concreto
    public void acelerar(int cantidad){
        if (cantidad >0){
            //modificando la velocidad
            setVelocidad(getVelocidad() + cantidad);
        }
    }
    public void detener(){
        setVelocidad(0);
    }
    //metodo obligatorio abstracto
    public abstract void mostrarInformacion();
}


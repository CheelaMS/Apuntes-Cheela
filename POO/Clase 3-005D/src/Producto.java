public class Producto {
    //encapsular
    private String nombre;
    private double precio;
    private int stock;
    //constructor = crear objetos
    //constructor con argumentos
    // 1-public 2- nombreClase 3- (arguentos=atributos){contenido}
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    //metodo sin argumentos sin retorno
    public void mostrarInformacion(){
        System.out.println("Información del producto");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    //metodo con argumentos sin retorno
    public void vender(int cantidad){
        //revisamos si hay stock suficiente
        if(cantidad<=stock){
            //puede vender
            stock -= cantidad;
            //mensaje
            System.out.println("Venta realizada "+ cantidad+ "Unidad(es)");
        }else{
            //no se puede vender
            System.out.println("No hay stock suficiente");
        }

    }

    //metodo sin argumento pero con retorno
    public double calcularIva(){
        double precioConIva = precio * 1.19;
        return precioConIva;
    }
    //metodo con argumento y con retorno

    public double calcularPrecioFinal(int cantidad){
        //calcular precio por cantidad
        double total=precio*cantidad;
        return total;
    }
    //sobrecarga de metodos
    public double calcularPrecioFinal(int cantdad, double descuento){
        double total = precio*cantdad;

        double montoDescuento = total * descuento/100;

        double totalDescuento = total - montoDescuento;
        return totalDescuento;
    }




}

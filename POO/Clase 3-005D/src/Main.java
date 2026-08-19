public class Main {
    public static void main(String[] args){

        System.out.println("BIENVENIDO A TECHSTORE");

        //crear objeto
        //1- nombreClase 2- nombreObjeto 3- new nombreClase 4 (datos = atributos)

        Producto notebook = new Producto("Notebook ASUS TUF Gaming", 800000.0,6);
        Producto smartphone = new Producto("Iphone 16", 920000.0, 15);
        //llamamos al metodo

        notebook.mostrarInformacion();
        smartphone.mostrarInformacion();

        //ventas
        System.out.println("Ventas: ");
        notebook.vender(2);
        smartphone.vender(2);

        notebook.mostrarInformacion();
        smartphone.mostrarInformacion();
        //iva
        System.out.println("IVA");
        double precioConIVA= notebook.calcularIva();
        System.out.println("Precio con IVA del notebook "+precioConIVA);

        //compra normal
        System.out.println("Compra Normal");
        int cantidad =3;
        double totalCompra = smartphone.calcularPrecioFinal(cantidad);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio final: "+totalCompra);
        //descuento
        System.out.println("Descuentos");
        double totalDescuento = smartphone.calcularPrecioFinal(cantidad,20);
        System.out.println("Total con 20% de descuento: "+totalDescuento);

        System.out.println("CIERRE DEL SISTEMA");
    }

}

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Sistema sistema = new Sistema();
        boolean salir = false;

        while (!salir) {

            //Despliega el menu
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
            System.out.println("▬   Bienvenidos a Beat the Rhythm   ▬");
            System.out.println("▬                                   ▬");
            System.out.println("▬   A. Agregar instrumento          ▬");
            System.out.println("▬   B. Vender instrumento           ▬");
            System.out.println("▬   C. Consultar inventario         ▬");
            System.out.println("▬   D. Cerrar programa              ▬");
            System.out.println("▬                                   ▬");
            System.out.println("▬   Introduzca una opción (A-D)     ▬");
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");

            String opcionMenu = StdIn.readString();

            //Menu de opciones
            switch (opcionMenu) {

                case "A":
                    agregarInstrumento(sistema);
                    break;
                case "B":
                    venderInstrumento(sistema);
                    break;
                case "C" :
                    consultarInventario(sistema);
                    break;
                case "D":
                    System.out.println("Hasta pronto.");
                    System.out.println("Programa finalizado.");
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR, introduzca una opcion valida (A-D");
                    System.out.println("");
            }
        }
    }
        private static void agregarInstrumento (Sistema sistema){
            System.out.println("No se supo como leer el archivo CSV.");
            System.out.println("");
        }
        private static void venderInstrumento(Sistema sistema){
            System.out.println("Ingrese el id del instrumento que desea comprar: ");
            String idCompra = StdIn.readString();
            System.out.println("No se ha logrado obtener el inventario de la tienda.  ");
        }
        private static void consultarInventario(Sistema sistema){
            System.out.println("No se ha logrado obtener el inventario de la tienda.  ");
        }

}

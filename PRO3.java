public class PRO3 {

    public static void main(String[] args) {

// Creamos variable del usuario y del dinero del banco        
        
        String usuarioCorrecto = "copete";
        double banco = 50;

// Mensaje de bienvenida        
        
        System.out.println("¡Bienvenido " + usuarioCorrecto + "!");
         
// Creamos variables del contardor y del total

        double total = 0;
        int contador = 0;

        int[] productosSeleccionados = {1, 3, 4, 0};

        for (int opcion : productosSeleccionados) {

            switch (opcion) {
                case 1:
                    total += 1.50;
                    contador++;
                    System.out.println("Has seleccionado Kinder.");
                    break;

                case 2:
                    total += 0.80;
                    contador++;
                    System.out.println("Has seleccionado Agua.");
                    break;

                case 3:
                    total += 1.20;
                    contador++;
                    System.out.println("Has seleccionado Papas.");
                    break;

                case 4:
                    total += 5.00;
                    contador++;
                    System.out.println("Has seleccionado Vapes.");
                    break;

                case 5:
                    total += 2.00;
                    contador++;
                    System.out.println("Has seleccionado Papel de fumar.");
                    break;

                case 0:
                    System.out.println("\nHas seleccionado " + contador + " productos.");
                    System.out.printf("Total a pagar: %.2f€\n", total);

                    if (total > banco) {
                        System.out.println("No tienes suficiente dinero en el banco.");
                    } else {
                        banco -= total;
                        System.out.println("Pago realizado correctamente.");
                        System.out.printf("Saldo restante: %.2f€\n", banco);
                    }

                    System.out.println("\nGracias por tu compra. ¡Hasta luego!");
                    return;
            }
        }
    }
}

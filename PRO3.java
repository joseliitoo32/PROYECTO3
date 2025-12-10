public class PRO3 {

    public static void main(String[] args) {

        // Creamos variable para almacenar el nombre del usuario y el dinero disponible en el banco
        String usuarioCorrecto = "copete";
        double banco = 50;

        // Mensaje de bienvenida personalizado para el usuario
        System.out.println("¡Bienvenido " + usuarioCorrecto + "!");

        // Variables para llevar el control del total de la compra y la cantidad de productos seleccionados
        double total = 0;
        int contador = 0;

        // Array que contiene los productos que el usuario ha seleccionado (representados por números)
        int[] productosSeleccionados = {1, 3, 4, 0};

        // Bucle for-each que recorre cada opción seleccionada por el usuario
        for (int opcion : productosSeleccionados) {

            // Estructura switch para determinar qué producto se ha seleccionado
            switch (opcion) {
                case 1:
                    total += 1.50; // Sumar el precio del producto al total
                    contador++;     // Incrementar el contador de productos
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
                    // Caso 0: el usuario ha terminado de seleccionar productos
                    System.out.println("\nHas seleccionado " + contador + " productos.");
                    System.out.printf("Total a pagar: %.2f€\n", total);

                    // Comprobamos si el usuario tiene suficiente dinero
                    if (total > banco) {
                        System.out.println("No tienes suficiente dinero en el banco.");
                    } else {
                        // Si hay suficiente dinero, se realiza el pago y se descuenta del saldo
                        banco -= total;
                        System.out.println("Pago realizado correctamente.");
                        System.out.printf("Saldo restante: %.2f€\n", banco);
                    }

                    // Mensaje de despedida
                    System.out.println("\nGracias por tu compra. ¡Hasta luego!");
                    return; // Salimos del programa
            }
        }
    }
}

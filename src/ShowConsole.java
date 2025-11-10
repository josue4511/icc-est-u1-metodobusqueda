public class ShowConsole {

    public void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}


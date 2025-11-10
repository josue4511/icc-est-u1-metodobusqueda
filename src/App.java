public class App {
    public static void main(String[] args) {

        ShowConsole consola = new ShowConsole();
        Busqueda buscador = new Busqueda();

        // arreglo base
        int[] numeros = {10, 11, -2, 5, 6, 8, 15, 22, 4};

        // mostrar el arreglo
        consola.mostrarArreglo(numeros);

        // números a buscar
        int[] numerosBuscar = {5, -2, 20, 100, 10};

        for (int n : numerosBuscar) {
            int posicion = buscador.buscarNumero(numeros, n);

            if (posicion != -1) {
                consola.mostrarMensaje("El número {" + n + "} se encontró en la posición [" + posicion + "]");
            } else {
                if (n == 20) {
                    consola.mostrarMensaje("Error → No se encontró el {" + n + "}");
                } else {
                    consola.mostrarMensaje("Error → El número buscado NO se encontró");
                }
            }
        }
    }
}




public class Busqueda {

    public int buscarNumero(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i; // retorna la posición si lo encuentra
            }
        }
        return -1; // si no se encuentra
    }
}


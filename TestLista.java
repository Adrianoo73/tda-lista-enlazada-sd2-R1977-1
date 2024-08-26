public class TestLista {
    public static void main(String[] args) {
        // se crea la lista
        Lista listaNumeros = new Lista();

        // boolean estaVacia = listaNumeros.estaVacia();
        // System.out.println(estaVacia);
        // String listaString = listaNumeros.toString();
        // System.out.println(listaString);

        // clase en la que se programo el metodo recorrer lista
        // prbando metodo recorrido :)

        // para insertar elementos
        listaNumeros.insertarElemento(4);
        listaNumeros.insertarElemento(5);
        listaNumeros.insertarElemento(1);
        listaNumeros.insertarElemento(9);

        // Recorrer e imprimir la lista después de insertar elementos
        System.out.println("La lista es: " + listaNumeros.recorrerLista());

        // para buscar elementos
        System.out.println(listaNumeros.seEncuentraElemento(1));
        System.out.println(listaNumeros.seEncuentraElemento(1));

        // para buscar un nodo en la lista
        Nodo nodo = listaNumeros.buscarElemento(5);
        System.out.println("Nodo encontrado: " + (nodo != null ? nodo : "No encontrado"));
    }
}

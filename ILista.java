public interface ILista {
    void inicializacionoCreacion();

    void insertarElemento(Object elementoaInsertar);

    void eliminarElemento(Object elementoaEliminar);

    Nodo buscarElemento(Object elementoaBuscar);

    boolean seEncuentraElemento(Object elementoaEncontrar);

    String recorrerLista();

    boolean estaVacia();
}



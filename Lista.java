public class Lista implements ILista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public Lista(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public void inicializacionoCreacion() {

    }

    @Override
    public Nodo buscarElemento(Object elementoaBuscar) {
        Nodo temp = cabeza;
        while (temp != null) { 
            if (temp.getDato().equals(elementoaBuscar)) { 
                return temp; 
            }
            temp = temp.getEnlace(); 
        }
        return null; 
    }

    @Override
    public void eliminarElemento(Object elementoaEliminar) {

    }

    @Override
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lista [cabeza=" + cabeza + "]";
    }

    @Override
    public void insertarElemento(Object elementoaInsertar) {
        if (elementoaInsertar instanceof Number) {
            Nodo nuevoNodo = new Nodo(); 
            nuevoNodo.setDato(elementoaInsertar);
            nuevoNodo.setEnlace(cabeza); 
            cabeza = nuevoNodo; 
        } else {
            System.out.println("Error: Solo se pueden insertar números (enteros o decimales).");
        }
    }

    @Override
    public String recorrerLista() {
        String recorridoString = "";
        if (estaVacia()) {
            return "No se puede recorrer la lista, ya que esta vacia.";
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            recorridoString = recorridoString + auxNodo.getDato() + " ";
            auxNodo = auxNodo.getEnlace();
        }
        return recorridoString;
    }

    // TODO : Implementar el metodo recorrer lista, para hoy 22/08/2024
    // practica en clase
    @Override
    public boolean seEncuentraElemento(Object elementoaEncontrar) {
        Nodo temp = cabeza;
        while (temp != null) { // Recorre la lista desde la cabeza hasta que llegue al final
            if (temp.getDato().equals(elementoaEncontrar)) { 
                                                            
                return true; 
            }
            temp = temp.getEnlace();
        }
        return false; 
    }

}


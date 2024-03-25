package repo;

import model.Libro;

public class DBLibro {
    public int disminuirStock(Libro libro){
        //Deberia ser cantidad de libros en la venta pero apra ir rapido
        int stock = libro.getStock() - 1;
        return stock;
    }
}

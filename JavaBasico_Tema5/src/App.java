/*
 Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que 
implemente la interfaz CocheCRUD.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y 
llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

public class App {
    public static void main(String[] args){
        
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}

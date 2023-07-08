public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Se ha creado un coche nuevo");
        
    }

    @Override
    public void findAll() {
        System.out.println("Honda, Toyota, Ford");
        
    }

    @Override
    public void delete() {
        System.out.println("Se ha eliminado un coche");
        
    }
    
}

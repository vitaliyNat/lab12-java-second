import java.util.function.Supplier;

public class SupplierPracownik implements Supplier<Pracownik> {

    public Pracownik pracownik;

    SupplierPracownik(String path){
        pracownik = Controller.getEmployee(path);
    }
    @Override
    public Pracownik get() {
        return pracownik;
    }
}

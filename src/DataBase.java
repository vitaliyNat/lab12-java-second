
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DataBase {
    private HashMap<String,Pracownik> MainDataBase = new HashMap<String,Pracownik>();

    public  void setDataBase(HashMap<String,Pracownik> pracownikHashMap){
        this.MainDataBase = pracownikHashMap;
    }
    public HashMap<String,Pracownik> getMainDataBase(){
        return MainDataBase;
    }
    public void addEmployee(Pracownik employee){
        MainDataBase.put(employee.getPesel(), employee);
    }
    public Pracownik removeEmployee(Pracownik employee){
        return MainDataBase.remove(employee.getPesel());
    }
    public Pracownik searchEmployee(String employeePesel){
        return MainDataBase.get(employeePesel);
    }
    public void showAllEmployeers(){
        AtomicInteger Qty = new AtomicInteger(1);
        MainDataBase.forEach((pesel, employee)->{
            employee.showEmployee();
            System.out.println("                                       [Pozycja: "+Qty+"/"+MainDataBase.size()+"]");
            Qty.getAndIncrement();
            if(!Controller.getKeyNext()){
                return;
            }

        });
    }
    public boolean has(Pracownik employee){
        return !(MainDataBase.containsKey(employee.getPesel()));
    }

    public void createCopytemp(ObjectOutputStream out){
        MainDataBase.forEach((pesel, employee)->{
            try {
                out.writeObject(employee);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }
    public void clear(){
        MainDataBase.clear();
    }


}

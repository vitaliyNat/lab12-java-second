public class WriteRunnable implements  Runnable{

    private Pracownik employee;

    WriteRunnable(Pracownik employee){
        this.employee = employee;
    }
    @Override
    public void run() {
        Controller.saveEmployee(employee);
    }
}

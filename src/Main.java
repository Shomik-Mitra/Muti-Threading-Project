public class Main {
    public static void main(String[] args) {
    Printer obj=new Printer();
    Thread T1=new Thread(new Task(obj,1), String.valueOf(ThreadName.Thread1));
    Thread T2=new Thread(new Task(obj,2),String.valueOf(ThreadName.Thread2));
    Thread T3=new Thread(new Task(obj,0),String.valueOf(ThreadName.Thread0));
    T1.start();
    T2.start();
    T3.start();
    }
}

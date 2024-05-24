public class Task implements Runnable{
    private Printer obj;
    private int no;

    public Task(Printer obj, int no) {
        this.obj = obj;
        this.no = no;
    }

    @Override
    public void run() {
        try {
            this.obj.print(this.no);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

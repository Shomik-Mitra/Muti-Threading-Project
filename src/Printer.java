public class Printer {
    private static final int rem=3;
    private int number=1;
    public void print(int no) throws InterruptedException {
        while(number<10){
            synchronized (this){
                if(number%rem!=no) {
                    this.wait();
                }
                else {
                    System.out.println(Thread.currentThread().getName()+" "+number);
                    number++;
                    notifyAll();
                }

            }
        }
    }

}

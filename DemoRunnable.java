public class DemoRunnable implements Runnable{
    private Thread t;
    private String threadName;

    public DemoRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Create "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try{
            for (int i = 4; i >0; i--) {
                System.out.println("Thread: "+ threadName + ", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread "+threadName +" interrupted!");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

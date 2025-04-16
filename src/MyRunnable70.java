//70. Multithreading = Enables a program to run multiple threads concurrently
//                     (Thread = A set of instructions that run independently)
//                     Useful for background tasks or time-consuming operations

public class MyRunnable70 implements Runnable{

    private final String text;

    MyRunnable70(String text){
        this.text = text;
    }
    @Override
    public void run(){
        for (int i = 0;i<=2;i++){
            try {
                Thread.sleep(1000);
                //System.out.println(Thread.currentThread().getName()+" "+i);
                //System.out.println(i);
                System.out.println(text);
            //sleep报出错需要此代码InterruptedException
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}

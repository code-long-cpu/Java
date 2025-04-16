//69. Threading = Allows a program to run multiple tasks simultaneously
//                Helps improve performance with time-consuming operations
//                (File Input/Output,network communications, or any background tasks)
//How to create a Thread
//Option 1. Extend the Thread class(simpler) -limited to single inheritance
//Option 2✅. Implement the Runnable interface (better)


//Main方法中的main thread 负责接收用户输入
//这个separate thread 负责倒计时
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000); //线程每间隔1秒执行一次
            }
            //sleep报出错需要此代码InterruptedException
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==5){
                System.out.println("Time is up.");
                System.exit(0); //如果倒计时到了，就退出程序；
            }

        }
    }
}

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock71 implements Runnable{

    //用此类的构造函数从主线程那里获取用户定义的闹钟时间alarmTime；
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scan;
    AlarmClock71(LocalTime alarmTime,String filePath,Scanner scan){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scan =scan;
    }

    @Override
    public void run(){
        //获取当前时间
        //LocalTime now = LocalTime.now();

        //如果当前时间比闹钟早，程序继续睡1秒；
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);//程序每隔一秒执行一次

                //制定当前时间显示格式
                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int seconds = LocalTime.now().getSecond();

                //显示当前时间(每隔一秒); %02d: int占位符，保留2位整数；
                // \r是inplace输出结果，覆盖原来的值，不是另起一行,
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
            //sleep报出错需要此代码InterruptedException
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");;
            }
        }

        //如果跳出了循环，说明时间到了，就执行闹钟响了
        System.out.println("\nAlarm noises");
        //Toolkit.getDefaultToolkit().beep(); 系统响一声
        //执行闹钟方法；
        playSound(filePath,scan);

    }
    //播放闹钟音乐方法；
    private void playSound(String filePath,Scanner scan){
        //创建file对象，传入音乐路径
        File file = new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Scanner scanner = new Scanner(System.in)){
            //Clip对象就像Sound Player：load an audio file and then play, pause, stop, reset the audio;
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream); //打开音乐
            //System.out.println("No problem detected"); //测试执行到这一步是否找得到音乐文件
            clip.start(); // 播放闹钟音乐
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            clip.start();// 停止闹钟音乐

            scan.close();
        }
        //找不到音乐文件报此错误；
        catch (FileNotFoundException e){
            System.out.println("Could not locate file.");
        }
        //getAudioInputStream(file)音乐文件格式不支持报错,例如播放mp3文件就会报此错误；
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        //AudioSystem.getClip() 无法播放音乐报错；
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource.");
        }
        //捕捉广泛的错误，但是不够具体
        catch (IOException e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("You get up!!");
        }

    }
}

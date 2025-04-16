//39. Object = An entity that holds data(attributes)
//             and can perform actions(methods)
//             It is a reference data type

public class Car_39 {
    //attributes(成员变量)  无static需要用实例Object访问，有static只需类名即可；
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    //actions   无static需要用实例Object调用，有static只需类名调用即可；
    void start(){
        //local varible(局部变量)
        isRunning = true;
        System.out.println("You start the engine!");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine!");
    }
    void drive(){
        System.out.println("You drive the "+model);
    }
    void brake(){
        System.out.println("You brake the "+model);
    }
}

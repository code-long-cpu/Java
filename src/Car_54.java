//54.Composition(b对象在A对象构造函数中new) = Represents a "Part-of" relationship between objects.
//                 For example, an Engine is "Part of" a Car.
//                 Allow complex objects to be constructed from smaller objects.
//Object(Car) is composed with another object(engine),engine对象不能独立存在，engine不是自己手动new的，是Car构造函数中new的，car被创建时候engine才new。
public class Car_54 {
    String model;
    int year;
    Engine engine;

    Car_54(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); //Composition，在构造器中new，通过engine实例可以调用engine的方法
    }
    void start(){
        this.engine.start(); //通过car对象来调用engine对象的start()方法；
        System.out.println("The "+this.model+" is running.");
    }
}

//Composition中，由于Engine对象是Car构造函数new对象的时候才new的，所以Engine对象跟着Car对象的销毁而销毁。engine对象不是自己new的，所以自己不能独立存在；
class Engine{
    String type;
    Engine(String type){
        this.type = type;
    }
    void start(){
        System.out.println("You start the "+this.type+" engine.");
    }
}
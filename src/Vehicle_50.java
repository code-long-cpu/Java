//50.Polymorphism = "Poly" = "many" 多
//                  "morph"="shape" 态
//                  objects can identify as other onjects
//                  objects can be treated as objects of a common superclass.
//其实就是父类声明对象，cat和dog和wolf都继承animal父类(接口抽象类父类)，就能用animal声明对象，调用父类方法；
//同一个接口，表现不同的行为；

//接口，抽象类，普通父类，都可以实现多态，一个animal父类声明，多个cat dog wolf方法调用；
//抽象类abstract实为了不让直接new抽象类，方法必须被多个子类继承实现，代码更规范；
public abstract class Vehicle_50 {
    abstract void go();
}

class Car50 extends Vehicle_50{
    @Override
    void go(){
        System.out.println("You can drive the car.");
    }
}

class Bike50 extends Vehicle_50{
    @Override
    void go(){
        System.out.println("You ride the bike.");
    }
}

class Boat50 extends Vehicle_50{
    @Override
    void go(){
        System.out.println("You sail the boat.");
    }
}

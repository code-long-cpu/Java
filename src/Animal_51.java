//51. Dynamic Polymorphism = When the method that gets executed is decided
//                          at runtime based on the actual type of the object.
//同一个接口，表现不同的行为 (Dynamic Polymorphism),某个方法调用在new时候决定；
//其实就是父类声明对象，cat和dog和wolf都继承animal父类(接口抽象类父类)，就能用animal声明对象，调用父类方法；
public abstract class Animal_51 {
    abstract void speak(); //抽象方法不能有方法体；
}

class Dog extends Animal_51{
    @Override
    void speak(){
        System.out.println("The dog goes woof");
    }
}

class Cat extends Animal_51{
    @Override
    void speak(){
        System.out.println("The cat goes meow");
    }
}

interface Interface_49_Predator {

    void hunt(); //⚠️ 子类必须实现
}
interface Interface_49_Prey{
    void flee(); //⚠️ 子类必须实现

}

//⚠️抽象类和接口中，子类必须实现的是抽象方法，而不是属性；
class Rabbit_49 implements Interface_49_Prey{

    @Override
    public void flee(){
        System.out.println("The rabbit is running away.");
    }
}

class Hawk implements Interface_49_Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting.");
    }
}

//子类多继承,这是接口的特点；
class Fish implements Interface_49_Predator,Interface_49_Prey{
    @Override
    public void flee(){
        System.out.println("The fish is swimming away.");
    }
    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}


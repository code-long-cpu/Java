//44. inheritance = One class inherits the attributes and methods from another class
//                  parent -> child

public class InherAnimal_44 {
    boolean isAlive;
    String first;
    String last;
    void eat(){
        System.out.println("The animal is eating.");
    }


    //45.Super 父类的构造方法，子类需要用super继承才能用；
    InherAnimal_44(String first,String last){ //被子类继承后，可以接受子类的参数
        this.isAlive = true;
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.println(this.first+" "+this.last);
    }

    //46. Method overriding
    void move(){
        System.out.println(this.first + " is running."); //typescript的抽象类快题的问题解决了，如何调用父类的快递方法同一处理子类的快递订单
        //System.out.println("This animal is running.");
    }

    //47.toString() 这样打印object名字时候就是打印返回结果了，不再是hashcode了
    @Override
    public String toString(){
        return this.first+" "+this.last;
    }
}

//44. inheritance,keywords(extends)
class InherDod_44 extends InherAnimal_44{
    int lives =1;
    double gpa;

    //45.Super
    InherDod_44(String first, String last, double gpa){
        super(first, last); //Dog继承自Animal，构造方法也得用super去call父类的有参数的构造方法，父类构造方法没有参数，就不用super；
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.first + "'s gpa is: "+this.gpa);
    }
    void speak(){
        System.out.println("The dog goes woof");
    }
}


//44. inheritance,keywords(extends)
class InherCar_44 extends InherAnimal_44{
    int lives =9;
    double gpa;

    //45.Super
    InherCar_44(String first, String last, double gpa){
        //Cat继承自Animal，构造方法也得用super去call父类的有参数的构造方法，父类构造方法没有参数，就不用super；
        super(first, last);
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.first + "'s gpa is: "+this.gpa);
    }

    void speak(){
        System.out.println("The cat goes mewo");
    }
}

class InherFish_44 extends InherAnimal_44{
    InherFish_44(String first, String last){
        super(first,last);

    }
    //关键字@Override，当子类继承父类，并覆盖父类方法时，得用这个；
    //如果不写的话，你在拼错move方法名时，就是新定义了一个方法，你自己也不会察觉；
    //如果写了，你在拼错move方法名时候，就是提醒你父类没有这个方法；
    @Override
    void move(){  //重写父类方法
        System.out.println(this.first+ " is swimming.");
    }

}

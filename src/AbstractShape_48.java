//48.abstract = Used to define abstract classes and methods.
//              Abstraction is the process of hiding implementation details
//              and showing only the essential features;
//              Abstruct class can't be instantiatied directly
//              Can cantain 'abstract' methods (Which must be implemented)
//              Can contain 'concrete' methods (Which are inherited)

//加上abstruct关键字，new时候就会提示报错，因为抽象类不允许new；
public abstract class AbstractShape_48 {
    //abstract methods 抽象类中只声明，在子类中才能override实现具体操作；不实现就会报错；
    abstract double area();

    //concrete methods 具体方法 ，子类继承父类就可调用，不用override
    void display(){
        System.out.println("The area of this shape is: "+this.area());
    }
}

class Rectangle_48 extends AbstractShape_48{

    double length;
    double width;

    Rectangle_48(double lenght,double width){
        this.length = lenght;
        this.width = width;
    }

    //实现抽象类的area()方法
    @Override
    double area(){
        return length * width;
    }
}

class Triangle_48 extends AbstractShape_48{

    double base;
    double height;

    Triangle_48(double base, double height){
        this.base = base;
        this.height = height;
    }

    //实现抽象类的area()方法
    @Override
    double area(){
        return 0.5 * this.base *this.height;
    }
}



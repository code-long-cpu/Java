
//复习抽象类
//抽象类和接口中，子类必须实现的是抽象方法，而不是属性；
public abstract class AbstractPackage_48 {

    double weight;

    //抽象类和普通父类的构造方法，⚠️所有子类必须用super继承
    AbstractPackage_48(double weight){
        this.weight=weight;
    }

    //抽象方法，计算运费- ⚠️所有子类必须继承重写Override实现
    abstract double calculate();

    //具体方法，打印包裹信息- 子类可直接调用
    void printPackage(){
        System.out.println("包裹重量为： "+this.weight+"kg, 运费为： "+this.calculate()+" 元。");
    }
}

//子类-①标准包裹
class StandardPackage extends AbstractPackage_48{

    //子类自己的属性
    double unitPrice;

    //⚠️必须继承抽象类（父类）的构造函数
    StandardPackage(double weight,double unitPrice){
        super(weight);
        this.unitPrice = unitPrice;
    }

    //⚠️必须实现抽象类（父类）的抽象方法
    @Override
    double calculate(){
        return this.weight * this.unitPrice;
    }
}
//子类-②特快包裹
 class ExpressPackage extends AbstractPackage_48{
    //子类自己的属性
    double unitPrice;
    double additional;

    //⚠️必须继承抽象类（父类）的构造函数
    ExpressPackage(double weight,double unitPrice, double additional){
        super(weight);
        this.unitPrice = unitPrice;
        this.additional = additional;
    }

    //⚠️必须实现抽象类（父类）的抽象方法
    @Override
    double calculate(){
        //超出10kg部分，每公斤多收additioanl元；
        if(this.weight > 10){
            return 10*this.unitPrice+(this.weight-10)*this.additional;
        }else{
            return this.weight*this.unitPrice;
        }
    }
}


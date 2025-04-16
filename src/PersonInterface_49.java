
//接口PersonInterface_49限制了类Person的格式

interface PersonInterface_49 {
    //String name = "";
    //int age= 0;

    void speak(int n); //⚠️ 子类必须实现此方法
}
interface Creature{
    void move();
}

class Person implements PersonInterface_49{

    //子类属性
    String name = "";
    int age= 0;
    double gpa = 0;
    Person(String name, int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public void speak(int n){
        for(int i =0;i<n;i++){
            System.out.println("你好，我叫"+this.name+", 我的年龄是"+this.age+"， 我考了"+this.gpa);
        }
    }
}
class Man implements PersonInterface_49,Creature{
    //子类属性
    String name = "";
    int age= 0;
    double gpa = 0;
    Man(String name, int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public void speak(int n){
        for(int i =0;i<n;i++){
            System.out.println("我是"+this.name+", 我的年龄是"+this.age+"， 我考了"+this.gpa);
        }
    }
    @Override
    public void move(){
        System.out.println("男人都是很擅长运动的。");
    }

}

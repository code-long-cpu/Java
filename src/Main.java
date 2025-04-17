
import javax.sound.sampled.*;
import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException; //57课 Exception
import java.lang.classfile.instruction.SwitchCase;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static int x = 4; //29.class scope variable 对应local scope variable; 同理static在此是静态变量，与静态方法一致，本类中访问它不用new直接访问。
    static Scanner scanner = new Scanner(System.in); //29.直接声明class scope 的 static scanner，下面的每个method都能调用；
    static Random random = new Random(); //30.筛子数量
    public static void main(String[] args) throws InterruptedException { //这里的throws InterruptedException是23课forloop的Thread sleep需要的
        System.out.println("Hello and welcome!");
        //primitive data type
        //2.variable;
        int age = 5;
        System.out.println("I am "+age+" years old!");
        double a = 5.3;
        double b = 4.555;
        double c = 5;
        System.out.println(a+","+b+","+c);
        char d = 'A' ;//char的值是单引号
        char e = '@';
        char f ='!';
        System.out.println(d+","+e+","+f);
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        if(isStudent){
            System.out.println("I am a student");
        }else{
            System.out.println("I am not a student");
        }
        //reference data type
        String name = "Long"; //string的值是双引号
        System.out.println("My name is "+name);

        //3.userInput; 导入import java.util.Scanner;
        //方法名不加static需要new对象，才能调用
        //Main three = new Main();
        //three.Three_input();  遇到了scanner.nextLine()的问题，只能先把这个注释了；

        //4.mad libs game，(input练习)根据提示完形填空，好无聊，不写了；
        //方法名加static直接能调用,省略类名Mian；
        //For_MadLibsGame();

        //5.Arithmetic Assignment Operators;加减乘除操作 x=x+y;x+=y;
        //Increment and Decrement Operators; x++;x--
        //Order of Operations [P-E-M-D-A-S] :parenthess-exponents-multiplication-division-addition-subtration
        double result4 = 3+4*(7-5)/2.0; //7.0
        System.out.println("[P-E-M-D-A-S] = "+result4);

        //6.Shopping cart program;（input+arithmetic练习）
//        Five_ShoppingCart();

        //7.if ,else if, else statement;>,>=, <,<=, ==, string.isEmpty();
        //8.random numbers//import java.util.Random;
        Random random= new Random();
        int number;
        number = random.nextInt(1,7); //生成1-6的随机数；默认范围从-2billion——2billion；
        System.out.println(number);

        double number2;
        number2=random.nextDouble(); //默认范围从0-1的小数；
        System.out.println(number2);

        boolean isTrue;
        isTrue = random.nextBoolean();//默认生成true或false；
        System.out.println(isTrue);

        if(isTrue){
            System.out.println("isTrue is true");
        }else{
            System.out.println("isTrue is false");
        }
        //9.math class;
        System.out.println(Math.PI); //3.141592653589793
        System.out.println(Math.E); //2.718281828459045
        System.out.println(Math.pow(2,3)); //8.0
        System.out.println(Math.abs(-5)); //5
        System.out.println(Math.sqrt(9)); //3.0
        System.out.println(Math.round(3.14));//3 to the nearest whole integer
        System.out.println(Math.round(3.94));//4 to the nearest whole integer
        System.out.println(Math.ceil(3.14));//4.0
        System.out.println(Math.floor(3.99));//3.0
        System.out.println(Math.max(10,20));//20.0
        System.out.println(Math.min(10,20));//10.0 cm
        //保留小数位数
        System.out.printf("保留一位小数: %.1f", 4.5555); //4.6， %是占位符，用于放置后面的变量；
        System.out.printf("保留两位小数: %.2f", 4.5555); //4.56
        //保留整数位数 %02d: %是int占位符+02d保留位整数；
        System.out.printf("%02d\n",4);//04
        System.out.println();

        //10.printf() = is a method used to format output
        //%[flags][width][.precision就是.1f,.2f啥的][specifier-character]
        String name10 = "Long Xie";
        char firstLetter = 'L';
        int age10 = 30;
        double height = 175.555;
        boolean isEmployed = true;
        System.out.printf("Hello %s.\n",name10); //Hello Long Xie, %s是字符串占位符；\n是换行符
        System.out.printf("Your name starts with a %c.\n", firstLetter); //L, %c是字符占位符；
        System.out.printf("you are %d years old.\n",age); //30 %d是int占位符
        System.out.printf("You are %.2f inches tall.\n",height); // 175.56 ,%f是double占位符,.1和.2是保留位数
        System.out.printf("Employed: %b.\n",isEmployed);//%b是boolean占位符
        //multiple using
        System.out.printf("%s is %d years old.\n",name10,age10); //Long Xie is 30 years old.

        //11.Compund interest calculator 复利计算器； principal amount 本金；
        //12.nested if statements
        if(true){
            if(true){
                System.out.println("Nested if statemnts.");
            } else if (false) {
                System.out.println("No Nested if statemnts.");
            }
        }
        //13.String methods;
        String name13 = "Long Xie";
        String name13_1 = "";
        String name13_2 ="Long Xie";
        int length = name13.length();
        System.out.println(name13 + " is: " + length +" Chars."); //8
        char letter = name13.charAt(2); //n
        int index = name13.indexOf("n");//2
        int index2 = name13.indexOf(" ");//4 空格的位置在index=4的位置
        System.out.println(letter+","+index);//n,2
        name13 = name13.toUpperCase();
        System.out.println(name13); //LONG XIE
        name13 = name13.toLowerCase();
        System.out.println(name13); //long xie
        name13 = name13.replace('g','d'); //lond xie;
        System.out.println(name13);
        System.out.println(name13.isEmpty()); //false;
        System.out.println(name13_1.isEmpty()); //true;
        System.out.println(name13.contains("l")); //true
        System.out.println(name13.contains(" ")); //true
        System.out.println(name13.equals("lond xie")); //true ;
        System.out.println(name13.equals(name13_1));//false
        System.out.println(name13_2.equals("Long Xie")); //true ;考虑case sensitivity 大小写
        System.out.println(name13_2.equalsIgnoreCase("long xie")); //true; 不考虑case sensitivity 大小写

        //14.substring = a method used to extract a portion of a string; string.substring(start, end);
        String email = "longbao7552@gmail.com";
        String username= email.substring(0,7); //7 is exclusive;
        System.out.println(username); //longbao
        String domain = email.substring(12,21);
        String domain_2 = email.substring(12); //只用输入第一位，后面自动的全部截取
        System.out.println(domain);     //gmail.com
        System.out.println(domain_2);   //gmail.com
        //more flexable 输入任何邮箱都以 @ 索引位置，截取邮箱
        String username_2=email.substring(0,email.indexOf("@"));
        String domain_3=email.substring(email.indexOf("@")+1);
        System.out.println(username_2); //longbao
        System.out.println(domain_3);   //gmail.com
        //substring mail
//        Forteen_Substring();
        //15.weight converter: pseudocode
//        Converter();

        //16.ternary operator; variable = (condition) ? ifTrue : ifFalse;
        int score = 65;
        String PassOrFail = (score > 60) ? "PASS" : "FAIL";
        System.out.println(PassOrFail); //PASS

        int number16 = 4;
        String EvenOrOdd = (number16 % 2 ==0)? "EVEN" : "ODD";
        System.out.println(EvenOrOdd); //EVEN

        //17.temperature convertor;
        //temperatureConvertor();

        //18.Enhanced Switch = A replacement to many else if statements
        //if statements
        String day = "Monday";
        if(day.equals("Monday")){
            System.out.println("It is weekday");
        }else if(day.equals("Tuesday")){ //等等周三周四周五
            System.out.println("It is weekday");
        }else{ //等等周三周四周五
            System.out.println("It is weekday");
        }
        //switch statements
        switch (day){ //下面字符串用“”，字符用'';
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is weekday.😭");
            case "Saturday","Sunday"  -> System.out.println("It is weekday.😁");
            default -> System.out.println(day +" is not a day!");
        }
        //19.calculator program (switch statemtents)
        //calculator();
        //String str19 = "long";
        //System.out.println(str19.charAt(1)); //o; 读取string某位字符char；

        //20.logical operator; &&=and; ||=or; !=not;
        double temp = 40;
        boolean isSunny = true;
        if(temp <=30 && temp >=0 && isSunny){
            System.out.println("The weather is good!😄");
            System.out.println("It is SUNNY outside! ☀️");
        }else if(temp <=30 && temp >=0 && !isSunny){
            System.out.println("The weather is good!😄");
            System.out.println("It is CLOUDY outside! ☁️️");
        }else if(temp > 30||temp<0){
            System.out.println("The weather is bad!😭");
        }
        //unsername function
        //newUnserName();

        //21.while loop= repeat code forever if condition is true; infinite loop;
        //whileLoop();  //先判断，后进入循环体；
        //doWhileLoop(); //先进入循环体执行代码一次，后判断。do while loop 代码会至少执行一次；

        //22.number gussing game(do while loop);
        //numberGussGame();

        //23.for loop= execute some code a certain amount of times;
        //forLoop();

        //24. break and continue;
        //break = break out of a loop (STOP);
        //continue = skip current iteration of a loop (Skip);
        for(int i =0;i<10;i++){
            if(i==5){
                //break; // 0 1 2 3 4   到5跳出循环体
                continue; //0 2 3 4 6 7 8 9 跳过5，继续执行循环
            }
            System.out.print(i+" ");
        }

        //25.nested loop = a loop inside another loop; used often with matrix and datastruct;
        for(int i =0;i<=3;i++){
            for(int j=0;j<=4;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //26.methods = a block of reused code that is excuted when called();
        String name26="Long";
        //example_1
        int age26 = 30;
        happyBirthday(name26,age26);
        //example_2
        int result26 = suqare(3);
        System.out.println("result26 = "+result26);
        //example_3
        int age26_2 = 16;
        if(ageCheck(age26_2)){
            System.out.println("You may sign up.");
        }else{
            System.out.println("You must be 18+ to sign up.");
        }


        //27.overloaded methods = methods that share the same name, but different parameter; signature(unique) = name + paramaters;
        //add(1,2); 3
        //add(1,2,3); 6

        //28.variable scope = where a variable can be accessed; local scope(inside methods) and class scope(inside class)
        int y= 3; //local varibale
        System.out.println(x); //4 访问的成员变量class variable
        System.out.println(y); //3 访问的局部变量local varibale; pass arguments to other methonds

        //29. banking program
        //bankingProgram();

        //30. dice roller program;
        //diceRoller();

        //31.arrays
        array_31.array();

        //32.inputArray ①先声明数组长度，②在给数组赋值
        array_31.inputArray(); //pizza taco hamburger

        //32_2.handleInputArray;
        //array_31.handleEnterArray();

        //33.search an array
        //array_31.searchIntArray(); //5 元素3在array索引5的位置；
        //array_31.searchStrArray();

        //34. varargs
        System.out.println("result of varargs is: "+array_31.varargsAdd(4,2,3,4)); //13

        //35. 2Darray
        array_31.MultipleArray();

        //36. java quiz game
        //quizGame_36.quizGame();

        //37. RockPaperScissor Game
        //RockPaperScissor_37.RPS();

        //38. Slot Machine
        //Slot_machine_38.SlotMachine();

        //39. Object(new对象) = An entity that holds data(attributes)
        //             and can perform actions(methods)
        //             It is a reference data type
        Car_39 car = new Car_39();
        System.out.println(car.make); //Ford;
        System.out.println(car.model); //Mustang;
        car.isRunning= true;
        System.out.println(car.isRunning); //true
        car.start(); //You start the engine!
        car.stop(); //You stop the engine!
        car.drive(); //You drive the Mustang
        car.brake(); //You brake the Mustang

        //40. Constructor(传参) = A special method to initialize objects
        //                  you can pass arguments to a constructor
        //                  and set up initial values
        Student_40 student1 = new Student_40("Long",30,3.4);
        Student_40 student2 = new Student_40("Le",31,3.2);

        System.out.println(student1.name+","+student1.age+","+student1.gpa+","+student1.isEnrolled); //Long,30,3.4,true
        System.out.println(student2.name+","+student2.age+","+student2.gpa+","+student2.isEnrolled); //Le,31,3.2,true

        student1.study(); //Long is studying.
        student2.study(); //Le is studying.

        //41. overloaded constructor(传不同的参数) = Allow a class to have multiple constructors (like overloaded methods)
        //                             with different parameter lists.
        //                             Enable objects to be initialized in various ways.
        User_41 user1 = new User_41("LongXie");
        System.out.println(user1.username); //"LongXie"
        System.out.println(user1.age);  //0
        System.out.println(user1.email); //"Not provided"

        User_41 user2 = new User_41("LeLe","gmail");
        System.out.println(user2.username); //"LeLe"
        System.out.println(user2.age);  //31
        System.out.println(user2.email); //"gmail"

        User_41 user3 = new User_41("DIDI","didi@com",3);
        System.out.println(user3.username); //"DIDI"
        System.out.println(user3.age);  //3
        System.out.println(user3.email); //"didi@com"

        User_41 user4 = new User_41(); //如果不设置默认值就是null与0
        System.out.println(user4.username); //"Guest"       //null
        System.out.println(user4.age);  //0                 //0
        System.out.println(user4.email); //"Not provided"   //null

        //42, array of object;
        Car_42 car1 = new Car_42("Mustang","Red");
        Car_42 car2 = new Car_42("Corvette","Blue");
        Car_42 car3 = new Car_42("Charger","Yellow");

        //data type of array is Car_42
        Car_42[] cars ={car1,car2,car3};  //第一种方法 unique identifier
        Car_42[] cars2 ={new Car_42("Mustang","Red"), //第二种 Anonymous objects
                         new Car_42("Corvette","Blue"),
                         new Car_42("Charger","Yellow")};

        for(int i =0; i<cars.length;i++){
            cars[i].drive();
            //You drive the Red Mustang
            //You drive the Blue Corvette
            //You drive the Yellow Charger
        }
        //enhanced forloop
        for(Car_42 chezi : cars){ //data type item in array;
            chezi.drive();
            //You drive the Red Mustang
            //You drive the Blue Corvette
            //You drive the Yellow Charger
        }
        for(Car_42 chezi : cars) { //data type item in array;
            chezi.color = "black";  //修改车子颜色为黑色
        }
        for(Car_42 chezi : cars) { //data type item in array;
            chezi.drive();
            //You drive the black Mustang
            //You drive sthe black Corvette
            //You drive the black Charger
        }

        //43. static = Makes a variable or method belong to the class
        //             rather than to any specific  object
        //             Commonly used for utility methods or shared resources
        Friend_static_43 friend1 = new Friend_static_43("Long-Xie");
        Friend_static_43 friend2 = new Friend_static_43("long");
        Friend_static_43 friend3 = new Friend_static_43("longlong");

        System.out.println(Friend_static_43.numberOfFriends+" friends objects you have created."); // 3 创建了3个朋友对象;访问类属性
        Friend_static_43.numberOfFriends(); //You have 3 total friends. ;访问类方法

        //Math class static method;
        Math.round(3.99);

        //44. inheritance,keywords(extends) =  One class inherits the attributes and methods from another class
        //                                      parent -> child
        InherDod_44 dog = new InherDod_44("Long","Gou",10);
        InherCar_44 cat = new InherCar_44("Le","Mao",9);
        System.out.println(dog.isAlive);  //true
        System.out.println(cat.isAlive);  //true
        dog.eat(); //The animal is eating.
        cat.eat(); //The animal is eating.
        System.out.println(dog.lives); //1
        System.out.println(cat.lives); //9
        dog.speak(); //The dog goes woof
        cat.speak(); //The cat goes mewo


        //45.Super = refers to the parent class (superclass -> subclass)
        //           Used in constructor(继承父类构造方法) and method overriding（重写父类方法）
        //           Calls the parent constructor to initialize attributes
        //Dog和Cat继承自Animal，构造方法也得用super去call父类的有参数的构造方法，父类构造方法没有参数，就不用super；
        dog.showName(); //Long Gou
        cat.showName(); //Le Cat
        System.out.println(dog.gpa); //10.0
        System.out.println(cat.gpa); //9.0
        dog.showGPA();//Long's gpa is: 10.0
        cat.showGPA();//Le's gpa is: 9.0

        //46. Method overriding = When a subclass provides its own
        //                        implementation of a method that is already defined.
        //                        Allows for code reusability and give spectific implementations
        //typescript的抽象类快题的问题解决了，如何调用父类的快递方法同一处理子类的快递订单
        dog.move(); // Long is running.
        cat.move(); // Le is running.
        InherFish_44 fish = new InherFish_44("Feng","xiao");
        //@Override 鱼重写父类方法
        fish.move(); //Feng is swimming.

        //47.toString() = Method inherited from the Object class.
        //                Used to return a string representation of an object.
        //                By default, It returns a hash code as a unique identifier.
        //                It can be overridden to provide meaningful details.
        InherAnimal_44 animal = new InherAnimal_44("wang","ba");
        //System.out.println(animal); //InherAnimal_44@3b9a45b3 , it's a hash code, a unique identifier for that animal object
        //直接打印object结果
        //① normally
        System.out.println(animal.first+ " " + animal.last); //wang ba
        //②用toString(): 在父类InherAnimal_44中用overrider 重写toString()方法;
        System.out.println(animal);//wang ba

        //48.abstract = Used to define abstract classes and methods.
        //更加严格的父类，更严格的限定子类行为；(不能实例化，只能被继承)
        //              Abstraction is the process of hiding implementation details
        //              and showing only the essential features;
        //              Abstract class can't be instantiated directly
        //              Can contain 'abstract' methods (Which must be implemented)
        //              Can contain 'concrete' methods (Which are inherited)
        //抽象类的目的就是防止直接实例化父类，抽象类防止子类忘记实现普通父类关键功能，抽象方法不被继承，就会报错，提高代码规范；
        //就是抽象类统一规定的抽象方法，所有的子类都得跟上实现；而普通父类的方法，子类无所谓。
        Rectangle_48 rectangle = new Rectangle_48(3,5);
        Triangle_48 triangle = new Triangle_48(3,5);

        //调用抽象类的concrete methods
        rectangle.display(); //The area of this shape is: 15.0.
        triangle.display();  //The area of this shape is: 7.5
        System.out.println(rectangle.area()); //15.0
        System.out.println(triangle.area());  //7.5

        //48.abstract复习
        //①标准快递
        StandardPackage s1 = new StandardPackage(10,5);
        System.out.println(s1.calculate()); //50.0
        s1.printPackage(); //包裹重量为： 10.0kg, 运费为： 50.0 元。
        ExpressPackage e1 = new ExpressPackage(13,8,2);
        e1.printPackage(); //包裹重量为： 13.0kg, 运费为： 86.0 元。

        //49.Interface = A blueprint for a class that specifies a set of abstract methods
        //               that implementing classes Must define.
        //               Supports multiple-inheritance-like behavior.
        //               一个子类只能继承一个父类，但是可以继承多个interface
        //⚠️抽象类和接口中，子类必须实现的都是抽象方法，而不是属性；
        //①普通父类中属性方法，子类可以自由继承实现；
        //②抽象类中，子类必须实现抽象类的方法；适合共性模板，可以有自己的具体方法；
        //③接口，子类必须实现其方法声明，无自己的具体方法，①继承其接口的子类们方法统一，②子类可以继承多个接口，适合组合方法能力；
        //三者合作：接口定义“必须做什么”，抽象类提供“共性怎么做”，具体类实现“个性化细节”。

        //子类实现接口方法，声明对象；
        //②多继承；
        Rabbit_49 rabbit = new Rabbit_49();
        rabbit.flee(); //The rabbit is running away.
        Hawk hawk = new Hawk();
        hawk.hunt(); //The hawk is hunting.
        Fish fish1 = new Fish(); //fish既是prey也是predator
        fish1.flee(); //The fish is swimming away.
        fish1.hunt(); //The fish is hunting

        //普通继承，
        Person p1 = new Person("tom",18,10);
        p1.speak(2);
        //你好，我叫tom, 我的年龄是18， 我考了10.0

        //①多态，接口可以当类型用,只要是接口声明的对象，能直接调用其方法（多态）；
        PersonInterface_49 p2 = new Person("jery",20,5);
        p2.speak(1);  //你好，我叫jery, 我的年龄是20， 我考了5.0

        //接口的主要特性是多态和多继承；比起抽象只能单继承；接口可以多继承，也可以多态；
        Man p3 = new Man("long",30,100);
        p3.speak(1); //我是long, 我的年龄是30， 我考了100.0
        p3.move();      //男人都是很擅长运动的。

        //50.Polymorphism多态 = "Poly" = "many" 多 (就是面向接口编程)
        //（关键字extends、implements）;语法 Animal a = new Dog(); a.speak();
        //                  "morph"="shape" 态
        //                  objects can identify as other objects
        //                  objects can be treated as objects of a common superclass.
        //同一个接口，表现不同的行为 (Dynamic Polymorphism),接口规定的方法名一样，但是具体执行方法效果在new具体子类的时候决定；
        //父类声明对象，cat和dog和wolf都继承animal父类(接口抽象类父类，实现规定方法)，就能用animal声明对象，实现同样的方法，不同的执行效果；
        Car50 car5 = new Car50();
        Bike50 bike = new Bike50();
        Boat50 boat = new Boat50();

        car5.go(); //You can drive the car.
        bike.go(); //You ride the bike.
        boat.go(); //You sail the boat.

        //⚠️接口Vehicle_50规定了方法名go，Car50和Bike50和Boat50继承接口方法名go，在接口声明下的实现类方法，方法名一样，子类内部执行方法却不一样；未来把car换成bike都是一样跑，跑的方式就不一样，不用重新写代码，达到想要的效果；
        //⚠️就跟Arraylist和PriorityQueue都是继承Queue的接口一样，方法名一样，方法体(各个实现类内部自己定义)不一样；（这就是面向接口编程）
        Vehicle_50 car50 = new Car50();
        Vehicle_50 bike50 = new Bike50();
        Vehicle_50 boat50 = new Boat50();

        car50.go();     //You can drive the car.
        bike50.go();    //You ride the bike.
        boat50.go();    //You sail the boat.

        //②同一个父类，声明多个交通工具car bike boat的类型；
        Vehicle_50[] vehicles = {car5,bike,boat};
        for(Vehicle_50 vehicle:vehicles){
            vehicle.go();
            //You can drive the car.
            //You ride the bike.
            //You sail the boat.
        }

        //51. Dynamic Polymorphism = When the method that gets executed is decided
        //                          at runtime based on the actual type of the object.
        //①同一个接口，表现不同的行为 (Dynamic Polymorphism),某个方法调用在new时候决定；
        //其实就是父类声明对象，cat和dog和wolf都继承animal父类(接口抽象类父类)，就能用animal声明对象，调用父类方法；
        //DynamicPolymorphism();

        //52. Encapsulation (getter & setter) protect object data and add rules for accessing or modifying them.
        //Getters = methods that make a field readable.
        //Setters = methods that make a field writeable.
        //不封装，代码容易被修改 (Car_52加了private修饰符，就访问不到了，用getter 和 setter
        Car_52 car52 = new Car_52("Charger","Yellow",10000);
        //用Getter访问private属性
        System.out.println(car52.getColorl()+" "+car52.getModel()+" "+car52.getPriceDollar());  //Yellow Charger $10000
        //用Setter修改private属性值
        car52.setColor("Blue");
        //car52.setPrice(-2000);  //Price can't be less than zero.
        car52.setPrice(2000);
        System.out.println(car52.getColorl()+" "+car52.getModel()+" "+car52.getPriceDollar());  //Blue Charger $2000

        //53.Aggregation(b对象外部new引入A对象)  = Represents a "has-a" relationship between objects.
        //                  One object(library) contains another object(book) as part of its structure,
        //                  but the contained object/s(book和library) can exist independently.
        //library object 包含 book object， 可以调用book对象的方法, book也可以独立存在；

        Book book1 = new Book("The Fellow of the ring", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the king", 416);

        Book[] books = {book1,book2,book3};

        //Aggregation
        Library_53 library = new Library_53("NYC Public library",1897,books);

        //✅library对象调用book的方法
        library.displayInfo();
        //The 1897 NYC Public library
        //The Fellow of the ring (423 pages)
        //The two towers (352 pages)
        //The return of the king (416 pages)


        //54.Composition(b对象在A对象构造函数中new) = Represents a "Part-of" relationship between objects.
        //                 For example, an Engine is "Part of" a Car.
        //                 Allow complex objects to be constructed from smaller objects.
        //Object(Car) is composed with another object(engine)
        Car_54 car54 = new Car_54("Corvette",2025,"V8");
        System.out.println(car54.model); //Corvette
        System.out.println(car54.year);  //2025
        System.out.println(car54.engine); //Engine@4fca772d, 输出的是engine对象
        System.out.println(car54.engine.type); //V8, 输出的是engine对象的type属性值

        //✅car对象的方法里面调用了enegine的方法
        car54.start();
        //You start the V8 engine.
        //The Corvette is running.

        //55.Wrapper classes = Allow primitive values(int, char, double, boolean)
        //                      to be used as objects. "Wrap them in an object"
        //                      Generally, don't wrap primitives unless you need an object.
        //                      Allows use of Collections Framework and static Utility Methods.
        //让基本类型像对象一样使用,就可以调用对应的类方法；
        int a54 = 5;
        //Autoboxing(wapper primitive to class(reference data type)) have many useful utility static methods;
        //弃用Integer a55 = new Integer(5);//Integer is depreciated since version 9
        Integer a55 = 5;
        System.out.println("Autoboxing: " + (a55 + 8)); //Autoboxing: 13; a55是Integer类型的对象，进行计算操作时候自动拆包为int，可以进行计算操作
        System.out.println("Autoboxing: " + a55 + 8); //Autoboxing: 58;  从左到右拼接字符串；
        //原始类型也是从左到右拼接字符串；（字符串一出场，后面全拼接）
        System.out.println("Autoboxing: "+5+6);//Autoboxing: 56; 从左到右自动进行拼接字符串；

        System.out.println(a55.toString()); //"5”
        System.out.println(a55.equals(6)); //false
        int a56 = 10; //a56是原始类型，就没有任何方法，只能进行计算操作。
        Double b55 = 3.14;
        Character c55 = '$';
        Boolean d55 = true;
        String e55 = "Pizza"; //很像给String赋值

        //Unboxing(unwrapper calss back to primitive)，变量f55只是普通变量，只能进行计算操作，没有类方方法；
        int f55 = a55;
        double g55 = b55;
        char h55 = c55;
        boolean i55 = d55;

        //将primitive类型转为String, 调用Wrapper class的static方法；
        String j55 = Integer.toString(123); //"123"
        String k55 = Double.toString(3.14); //"3.14"
        String l55 = Character.toString('@');//'@'
        String m55 = Boolean.toString(false);//"false"

        String n55 = j55+k55+l55+m55;
        System.out.println(n55); //1233.14@false

        //将String转为primitive，调用Wrpper class的parseInt()方法
        int o55 = Integer.parseInt("123"); //123
        double p55 = Double.parseDouble("3.14"); //3.14
        char q55 = "Pizza".charAt(0);   //P char是字符，所以只返回单个字母
        boolean r55 = Boolean.parseBoolean("false"); //false
        System.out.println(q55); //P

        //其他方法(可以用于验证用户输入)
        char letter55 = 'b';
        System.out.println(Character.isLetter(letter55)); //true， b是字母
        char letter56 = '$';
        System.out.println(Character.isLetter(letter56)); //false， $不是字母
        char letter57 = 'B';
        System.out.println(Character.isUpperCase(letter57)); //true


        //56. ArrayList(类) = A resizeable array that stores objects(autoboxing).
        //                Arrays are fixed in size, but ArrayLists can change.
        //Java的泛型(generics)只能接受引用类型(对象类型)不支持基本类型(primitive types)
        //arrylist.add(5); 传入primitive type自动autoboxing为Integer类型；
        //array是对象，ArrayList是类。
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); //自动将int 3,包装为Integer(3)
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(2);

        list.remove(2);
        list.set(0,5);//index为0的位置，换成5
        System.out.println(list); //[5, 1, 4, 2]
        //list[4];不能像array那样访问某个索引位置的值  得用get
        System.out.println(list.get(0)+5); //3+5=8; 自动将Integer(3)拆包为int 3
        System.out.println(list.size());   //2
        Collections.sort(list);
        System.out.println(list); //[1, 2, 4, 5]
        for(Integer lis:list){
            System.out.println(lis);
        }
        //example
        //foodYouLike();

        //57,Exception = An event that interrupts the normal flow of a program
        //              (if you do thing like Dividing by zero, file not found, mismatch input type)
        //               Any dangerous code you feel can be surrounded with a try{} block
        //               try{},catch{},finally{}
        divideException57();    //You can't divide by zero!
        //inputMissException57(); //That wasn't a number!

        //58.How to write a file using java(4 popular options) 配合writer.flush()提交;
        //FileWriter = Good for small or medium-sized text files
        //BufferWriter = Better performance for large amounts of text
        //PrintWriter = Best for structured data, like reports or logs
        //FileOutputStream = Best for binary files (e.g., images, audio files)
        FileWriter58();

        //59.How to read a file using Java (3 popular options)
        //FileReader + BufferedReader: Best for reading text files line-by-line;
        //FileInputStream: Best for binary files(e.g., images, audio files)
        //RandomAccessFile: Best for read/write specific portions of a large file;
        BufferedReader59();

        //60.How to play audio with java(.vav, .au, .aiff) 播放MP3的文件需要格外的java fx包
        //playAudio();

        //61.Java Hangman game
        //hangManGame();

        //62.Dates & Time using in java
        //LocalDate, LocalTime, LocaDateTime, UTC timestamp
        dateTime();
        //用dog模仿静态方法，静态工厂方法；静态方法return一个new对象；
        dogStatic happydog = dogStatic.happyDog("Didi",2);
        System.out.println(happydog);  //Dog{name='didi', age=10}
        dogStatic saddog = dogStatic.sadDog("Huanghuang",12);
        System.out.println(saddog); //Dog{name='Huanghuang', age=12}

        //63.Anoymous class = Aclass that doesn't have a name. Cannot be reused.
        //                    Add custom behavior without having to create a new class.
        //                    Often used for one time uses (TimerTask, Runnable, callbacks)
        Dog63 dog1 = new Dog63();
        Dog63 dog2 = new Dog63(){ //匿名类，用于创建仅仅用一次的对象；无需写用子类重新new
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };
        dog1.speak(); //The dog goes *woof*
        dog2.speak(); //Scooby Doo says *Ruh Roh*

        //64. Timer = Class that schedules tasks at specific times or periodically
        //            Useful for: sending notification, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()
        //timerTask();

        //65. Countdown timer
        //countDownTimer();

        //66. Generics泛型类<T> = A concept where you can write a class, interface, or method
        //Java的泛型(generics)只能接受引用类型(对象类型)不支持基本类型(primitive types)
        //arrylist.add(5); 传入primitive type自动autoboxing为Integer类型；
        //泛型作用：存任何类型的数据，但又想类型安全；用法：定义类的时候用<T>，new的时候得给出具体的类型<string>；关键字：<T> ； 语法：List<String>、class Box<T>
        //普通类，只能存内部定义的类型；
        //普通类：如果你只要一把小刀，用专用的就好；
        //泛型：但如果你要写一把能切苹果、削土豆、切面包的万能刀，泛型就是你最好的选择。
        //<T> 是类型形参，实际用的时候由具体的类型实参决定它到底是什么。
        //                  that is compatible with different data types.
        //                  <T> type parameter (placeholder that gets replaced with a real type)
        //                  <String> type argument (specifies the type)
        //<T>和<E>本质没有区别，都是类型形参，只是语义不同、为了让人更好读懂代码。Type（通用类型）；	Element（集合中的元素）
        //<Stirng>type argument
        ArrayList<String> fruits = new ArrayList<>(); // <String> type argument
        fruits.add("apple");
        fruits.add("orange");
        ArrayList<Integer> numb = new ArrayList<>(); // <Integer> type argument
        numb.add(1);
        numb.add(2);

        //<T> type parameter定义对象类型类
        GenericsBox66<String> box = new GenericsBox66<>(); //对象类型是String
        box.setItem("banana");
        String name66 = box.getItem();
        System.out.println(name66); //box里放了一个String类型的banana

        GenericsBox66<Integer> box2 = new GenericsBox66<>(); //对象类型是Integer
        box2.setItem(3);
        int num66=box2.getItem();
        System.out.println(num66); //box里放了一个Integer类型的数字3

        //<T, U> 多个泛型，字母U在T之后，所以用U；
        Product66<String,Double> product1 = new Product66<>("apple",3.55);
        System.out.println(product1.getItem()+", "+product1.getPrice()); //apple, 3.55
        Product66<String,Integer> product2 = new Product66<>("ticker",15);
        System.out.println(product2.getItem()+", "+product2.getPrice()); //ticker, 15
        Product66<Integer,Boolean> product3 = new Product66<>(1,true);
        System.out.println(product3.getItem()+", "+product3.getPrice()); //1, true

        // 67. HashMap<Key, Value> = A data structure that stores key-value pairs
        //     就是(python的字典)     Keys are unique, but Values can be duplicated
        //                          Does not maintain any order, but is memory efficient
        //                           HashMap<Key, Value>;
        HashMap<String,Double> map = new HashMap<>();
        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("orange",10000.00); //重复的key，会覆盖前面的key值；

        System.out.println(map.get("apple")); //0.5

        map.remove("apple"); //remove移除apple
        System.out.println(map); //{orange=0.75, banana=0.25}

        System.out.println(map.containsKey("banana")); //true

        System.out.println(map.containsValue(0.25)); //true

        System.out.println(map.size());//2

        System.out.println(map.keySet());//[orange, banana]

        for(String key:map.keySet()){
            System.out.println(key+" : $" +map.get(key));
            //orange : $10000.0
            //banana : $0.25
        }


        //Node.js 对于 JavaScript，就相当于 .NET（或 .NET Core）对于 C#, 都是让语言“能在本地环境中运行/构建项目”的运行平台或生态系统。
        //Next.js 是 TypeScript 的全栈框架;

        //68. Enums = (Enumerations) A special kind of class that (declare constants)
        //             represents a fixed set of constants.
        //             They improve code readability and are easy to maintain.
        //      Benefit: More efficient with switches when comparing Strings.
        //Enumes();

        //69. Threading = Allows a program to run multiple tasks simultaneously
        //                Helps improve performance with time-consuming operations
        //                (File Input/Output,network communications, or any background tasks)
        //How to create a Thread,用第二种方法new
        //Option 1. Extend the Thread class(simpler) -limited to single inheritance
        //Option 2✅. Implement the Runnable interface (better)
        //Threading();

        //70. Multithreading = Enables a program to run multiple threads concurrently
        //                     (Thread = A set of instructions that run independently)
        //                     Useful for background tasks or time-consuming operations
        //主要是 thread.join();夹在main主线程中间的其他线程，按顺序执行；
        //Multithreading();

        //71.JavaAlarmClock
        javaAlarmClock();



    }
    //方法名不加static需要new对象，才能调用
    void Three_input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age3 = scan.nextInt(); //读取int；
        Double height = scan.nextDouble(); //读取Double；
        scan.nextLine(); //先输入int后输入string，会有换行符导致第二个输入错误。需要新的换行符；先输入string后输入int没问题
        System.out.print("Enter your name: ");
        String name3 = scan.nextLine(); //只接受string所有内容，包括空格；输入hello world -> hello world;
        //String name3 = scan.next(); //只接受String的第一个单词，第一个空格处截止，不读string取空格； 输入hello world ->hello;
        System.out.println("Hellow " + name3+", You are "+age3+" years old. You are" + height + "cm");
        scan.close();
    }
    //方法名加static直接能调用,省略类名Mian；
    static void For_MadLibsGame(){

    }
    static void Five_ShoppingCart(){
        Scanner scanner5 = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        System.out.print("What item would you want to buy?: ");
        item = scanner5.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner5.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner5.nextInt();
        total = price * quantity;
        System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency+total);
        scanner5.close();
    }
    static void Forteen_Substring(){
        String email;
        String username;
        String domain;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);
        }else{
            System.out.println("Emails must contian @");
        }




    }
    static void Converter(){
        Scanner scanner = new Scanner(System.in);
        //Weight conversion program pesudocode
        //1.Declare variables;
        double weight;
        double newWeight; //存储转换后的值
        int choice;
        //2.Welcome message;
        System.out.println("Weight Conversion Program");
        //3.Prompt for user choice;
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        //4.Option 1 convert lbs to kgs;  1kgs = 1lbs / 2.20462
        if(choice==1){
            System.out.print("Enter the weight in lbs ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("The newWeight in kgs is: %.2f",newWeight);
        }else if(choice==2){ //5.Option 2 convert kgs to lbs; 1lbs = 1kbs * 2.20462
            System.out.print("Enter the weight in kgs ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The newWeight in lbs is: %.2f",newWeight);
        }else{  //6.slse print not a valid choice;
            System.out.println("That was not a valid choice!");
        }
        scanner.close();
    }
    static void temperatureConvertor(){
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit; //用string而不是char，是因为string有toUpperCase的方法，需要将用户输入的小写字母转为大写字母去判断；
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        //scanner.nextLine(); //取消上个输入的换行符；
        System.out.print("Convert to Celsius or Fahrenheit>(C or F): ");
        unit = scanner.next().toUpperCase(); //next()不读取空格，第一个空格处截止；nextLine()读取空格内容；
        //System.out.println(unit);
        //(condition)? true:false;
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9)+32;
        System.out.println(newTemp+"°"+unit);
        System.out.printf("%.1f°%s",newTemp,unit); //保留1位小数


        scanner.close();

    }
    static void calculator(){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation = true;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0); //next()读取字符串，charAt(0)读取第一个字符；

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> { //数字不能除以0
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.printf("%.2f %c %.2f is %.2f",num1,operator,num2,result);
        }

        scanner.close();

    }
    static void newUnserName(){
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length()<4||username.length()>12){
            System.out.println("username must be between 4-12 characters");
        }else if(username.contains(" ")||username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }else{
            System.out.println("Welcome " + username);
        }
    }
    static void whileLoop(){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isEmpty()){ //直到输入name后才会退出循环；
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
        scanner.close();

    }
    static void forLoop() throws InterruptedException{ //这里的throws InterruptedException是23课forloop的Thread sleep需要的；
        for(int i=0;i<5;i++){ //for(initialization, condition, update);
            System.out.print(i+".Pizza"+" ");
            Thread.sleep(500);//每间隔0.5s执行一次, 方法头main方法需要throws InterrupteException
        }
        System.out.println("I want 10 pizzas.");
    }
    static void doWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isEmpty());
        System.out.println("Hello "+name);
        scanner.close();
    }
    static void numberGussGame(){
        Random random = new Random(); //导入random库
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);    //生成1-11的随机整数
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10: ");

        do{ //do while loop 用户先输入，再判断；如果用while loop得给guess赋予初始值-1什么的，不然null与数字相比会报错；
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess<randomNumber){
                System.out.println("Too low, try again!");
            }else if( guess>randomNumber){
                System.out.println("Too high, try again!");
            }else{
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println(attempts+" times of attempts!");
            }
        }while(guess!= randomNumber);

        scanner.close();

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday to dear %s!\n",name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy birthday to you");
    }
    static int suqare(int num){
        return num*num;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
    static void bankingProgram(){
        //Java banking program for beginners

        //Declare variable;
        double balance = 10.99;             //显示余额
        boolean isRunning = true;   //保持程序运转
        int choice;                 //用户选项

        while(isRunning){
            //Display menu;
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            //Get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdrew(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choices");
            }
        }
        //showBalance();
        //deposit();
        //withdrew();

        //Exit message;
        System.out.println("Thanks you! Have a nice day!");
    }
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("Your Balance = $%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative!");
            return 0;
        }else{
            return amount;
        }

    }
    static double withdrew(double balance){

        double amount;

        System.out.print("Enter amount to be withdran: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficint Funds");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be negative!");
            return 0;
        }else{
            return amount;
        }
    }
    static void diceRoller(){
        //Java dice roller program


        //Declare Variables
        int numOfDice;
        int total = 0;

        //Get number of dice from the user 掷几个骰子；筛子的数值是the value of dice
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //check if number of dice > 0
        if(numOfDice > 0){
            //roll all the dice
            for(int i=0;i<numOfDice;i++){
                int roll =random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: "+roll);
                //get the total
                total = total + roll;
            }
            System.out.println("Total value of you dices is: "+total);
        }else{
            System.out.println("Number of dice must be greater than 0.");
        }

        //display ascII of dice
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default -> System.out.println("Invalid roll");

        }
    }
    static void DynamicPolymorphism(){
        //Animal_51 animal51;
        System.out.print("Would you like a dog or a cat? ( 1 = dog, 2 = cat):");
        int choice = scanner.nextInt();

        if(choice ==1 ){
            Animal_51 animal51 = new Dog();
            animal51.speak();
        }else if(choice ==2 ){
            Animal_51 animal51 = new Cat();
            animal51.speak();
        }
    }
    static void foodYouLike(){
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); //作用：clear input buffer because of there's going to be a new line character

        for(int i=1;i<=numOfFood;i++){
            System.out.print("Enter food #" + i+": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);


    }
    static void divideException57(){
        try{
            System.out.println(1/0);//数字不能除以0，程序会报错，错误是ArithmeticException类型
        }catch (ArithmeticException e){
            System.out.println(e);  //java.lang.ArithmeticException: / by zero
            System.out.println("You can't divide by zero!");
        }
    }
    static void inputMissException57(){
       try{ //Scanner scanner = new Scanner();这个代码最好写在try()括号中，这样就会自动执行scanner.close()程序；不用在finally写了；
           //实现接口AutoClosrable interface的方法都可放在try()括号中，执行自动关闭的方法。
           System.out.print("Enter a number: "); // 如果用户没有输入number类型程序会报错；InputMismatchException类型
           int number = scanner.nextInt();
           System.out.println(number);
       }catch (InputMismatchException e){  //输入不合要求的int或steing就报错，需要导入import java.util.InputMismatchException
           System.out.println(e); //java.util.InputMismatchException
           System.out.println("That wasn't a number!");
       }
       catch(Exception e){ //也可以直接写这个，不够具体而已；
           System.out.println("Something went wrong!");
       }
       finally{ //always execute  try里打开的文件，无论是否遇到exception，都在finally中关闭
           scanner.close();
           System.out.println("This always executes.");
       }

    }
    static void FileWriter58(){
        //Mac桌面路径名：
        String fileDeskPath = "/Users/xiaolong/Desktop/fileWriter58.txt";
        //根目录路径名不用写；
        String filePatch ="filewriter58.txt";
        //写入内容：
        String textContent= """
                我是谢龙，要努力奋斗；
                求上得中；
                求中得下；
                求下而不得；
                """;
        //写在try()括号中，scanner的资源才会自动调用.close()，filewriter才能调用.flush()提交的方法；否则就得得在finally中手动写；
        //实现接口AutoClosrable interface的方法都可放在try()括号中，执行自动关闭的方法。
        try( FileWriter writer = new FileWriter(filePatch)){  //输入文件名
            writer.write(textContent);
            //writer.flush(); //writer不写在try()的括号中，就得配合此flush提交代码写；writer写在try()中，自动执行flush，此行可以不写；
            System.out.println("File has been written."); //txt文件会在source file的位置，根目录；
        }catch (FileNotFoundException e){ //针对路径错的情况报错；
            System.out.println("Could not locate file location");
        }
        catch (IOException e){  //写入文件路径错了就会报错，但是不具体
            System.out.println("Could not write file.");
        }finally {
            //此处不能像scanner.close()那样写 writer.flush();机制不一样；
        }
    }
    static void BufferedReader59(){
        String filePatch = "/Users/xiaolong/Documents/Long_Learning_JAVA/LongJava/filewriter58.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePatch))){
            System.out.println("reader: "+reader); //java.io.BufferedReader@cc34f4d
            //reader.readLine();一行一行读,读一句，下面的方法就逐次往下进行；
            //System.out.println(reader.readLine()); //我是谢龙，要努力奋斗；
            //System.out.println(reader.readLine()); //求上得中；
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            //FileReader(filePatch)找不到文件报此错
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }catch (IOException e){
            System.out.println("Could not write file.");
        }
    }
    static void playAudio(){

        //文件中在LongJava根目录，就直接写名字即可；
        String filePath = "Bah Dop Bop - Casa Rosa's Tulum Vibes.wav";
        File file = new File(filePath); //创建file对象，传入音乐路径

        //accessing files can be unpredictable, 得用try catch block
        //实现接口AutoClosrable interface的方法都可放在try()括号中，执行自动关闭的方法，比如AudioInputStream和Scanner。
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Scanner scanner = new Scanner(System.in)){
            //Clip对象就像Sound Player：load an audio file and then play, pause, stop, reset the audio;
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream); //打开音乐
            //System.out.println("No problem detected"); //测试执行到这一步是否找得到音乐文件
            //clip.start(); // 播放音乐

            String response = "";
            while(!response.equals("Q")){
                System.out.println("Play the Music!");
                System.out.println("P=Play");
                System.out.println("S=stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" ->clip.start();
                    case "S" ->clip.stop();
                    case "R" ->clip.setMicrosecondPosition(0);
                    case "Q" ->clip.close();
                    default -> System.out.println("Invald choice");

                }
            }

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
            System.out.println("Bye!");
        }
    }
    static void hangManGame() {
        //Java hangman game

        //①第一部分，读取文件里的内容
        String filePath = "words61.txt";
        ArrayList<String> words = new ArrayList<>();

        //读取words61.txt里面的内容
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim()); //trim是去除String后面的空格
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file");

        }
        catch(IOException e){
            System.out.println("something went wrong!");

        }
        //搜集并打印出words61.txt的内容
        //System.out.println(words);
        Random random = new Random();

        String word = words.get(random.nextInt(0,words.size())); //左闭右开

        //②第二部分，用读取到的内容做hangman游戏
        //String word = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i =0;i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Welcome to Java hanman!");
        System.out.println("***********************");

        while(wrongGuesses<6){

            System.out.print(displayHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for(char c:wordState){
                System.out.print(c+" ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0); //scannrt.next()接受的是String,必须得用charAt()方法截取某一个字符给char guess；

            //scan.next()接收char与String的区别
            //String a = "long";
            //char b = a.charAt(0); //截取String某个字符给b；
            //a.equals("long");//true char没有.equal的方法

            //System.out.println( word.indexOf("z")); //z在2的位置；只打印重复字母的首个字母；

            if(word.indexOf(guess)>=0){
                System.out.println("Correct guess!");
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i)==guess){
                        wordState.set(i,guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(displayHangmanArt(wrongGuesses));
                    System.out.println("You Win!");
                    System.out.println("The word was: "+word);
                    break;
                }



            }else{
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }

        }

        if(wrongGuesses>=6){
            System.out.print(displayHangmanArt(wrongGuesses));
            System.out.println("Game over!");
            System.out.println("The word was: "+word);

        }




        scanner.close();

    }
    static String displayHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                        
                    
                    
                    """;
            case 1 -> """
                        💀
                    
                    
                    """;
            case 2 -> """
                        💀
                        🦺
                    
                    """;
            case 3 -> """
                        💀
                      🪓🦺
                    
                    """;
            case 4 -> """
                        💀
                      🪓🦺🪠
                    
                    """;
            case 5 -> """
                        💀
                      🪓🦺🪠
                       🗡
                    """;
            case 6 -> """
                        💀
                      🪓🦺🪠
                       🗡🦵
                    """;
            default -> "";

        };
    }
    static void dateTime(){
        //LocalDate, LocalTime, LocaDateTime, UTC timestamp
        //返回当前日期，下面写法是静态工厂方法，静态方法return一个new对象；
        LocalDate date = LocalDate.now(); //调的不是new构造方法，而是LocalDate的静态党发
        System.out.println(date); //2025-04-11
        //返回当前时间
        LocalTime time = LocalTime.now();
        System.out.println(time);//16:50:41.081353
        //返回当前日期和时间
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); //2025-04-11T16:51:33.930545
        //返回UTC时间
        Instant instant = Instant.now();
        System.out.println(instant); //2025-04-11T23:52:43.241229Z

        //Custom format 返回当前标准时间
        LocalDateTime datatimeformat = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY HH:mm:ss");
        String newDateTime = datatimeformat.format(formatter);
        System.out.println(newDateTime); //04-11-2025 16:56:24

        //返回自定义时刻
        LocalDate date2 = LocalDate.of(2025,12,25);
        System.out.println(date2); //2025-12-25

        //比较时间早晚
        LocalDateTime date3 = LocalDateTime.of(2025,12,25,12,0,0);
        System.out.println(date3); //2025-12-25T12:00
        LocalDateTime date4 = LocalDateTime.of(2026,1,1,0,0,0);
        System.out.println(date4); //2026-01-01T00:00

        if(date3.isBefore(date4)){
            System.out.println(date2+" is earlier than " +date2);
        }else if(date3.isAfter(date4)){
            System.out.println(date2+" is later than " +date2);
        }else if(date3.isEqual(date3)){ //isEqual可以用来做闹钟
            System.out.println(date2+" is equal to " +date2);
        }

    }
    static void timerTask(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3; //执行次数限制

            @Override
            public void run() {
                System.out.println("Hello!");
                count --;
                if(count<=0){  //执行次数小于了0，就取消timer
                    System.out.println("Task Complete");
                    timer.cancel();
                }
            }
        };
        //timer.schedule(task,1000); //1秒钟之后开始执行task，执行1次；
        timer.schedule(task,0,1000);//0秒之后开始执行task，每隔1秒，执行1次
    }
    static void countDownTimer(){
        //java countdown timer program

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of secoonds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();

        TimerTask task = new TimerTask(){

            int count =response;

            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Happy new year!");
                    timer.cancel();
                }

            }
        };

        //timer.schedule(task,0);
        //timer.schedule(task,0,1000);//每个1秒执行，会受任务执行时常影响，下次执行延迟到“任务结束 + 间隔”；（适用于普通定时，闹钟倒计时UI显示，节奏稳定）
        timer.scheduleAtFixedRate(task,0,1000);//每个1秒执行，不会受某个任务执行时常影响，就是每隔1秒就执行，会赶进度，比如第二任务正在执行，第三个任务就得马上执行，导致跳过第二个任务，任务不会重叠；（适用于毫秒级，感器定时，精度疯狂）
        scanner.close();
    }
    static void Enumes(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scan.nextLine().toUpperCase();

        //Enum68 day1 = Enum68.SUNDAY;

        //System.out.println(day1); //SUNDAY
        //System.out.println(day1.getDayNumber()); //1

        try{
            Enum68 day2 = Enum68.valueOf(response);
            //Enums is More efficient with switches
            switch (day2){
                case MONDAY,
                     TUESDAY,
                     WEDNESAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");

        }
        scan.close();

    }
    static void Threading(){
        //并发等待两个事件
        //主线程：接受用户输入（Scanner.nextLine()）
        //次线程：5 秒倒计时
        //如果 5 秒过去还没输入 → 输出 "Time is up"
        //如果输入了 → 打印名字并退出
        //谁先完成，就通知另一方终止操作
        //这个设计本质上是“并发控制”，而不是简单的循环控制。
        //而 for/while 是顺序执行,同步进行，无法胜任这种需求。 一旦你在循环中调用 scanner.nextLine()，程序就停在那儿不动了，啥都不干了
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name");

        //two tasks bellow run simultaneously
        //①new创建separate(second) threading 负责倒计时(running in the background)
        MyRunnable myRunnable = new MyRunnable();
        Thread thread= new Thread(myRunnable);
        thread.setDaemon(true); //只要主进程main运行结束，则代表其他进程的damon threads就会结束（停止倒计时），整个程序结束；
        thread.start(); //线程开始执行

        //②主程序执行main threading 负责用户输入
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
        scanner.close();
    }
    static void Multithreading(){
        //①new两个线程
        //MyRunnable70 myRunnable = new MyRunnable70();这句可以不用写；
        Thread thread1 = new Thread(new MyRunnable70("PING"));
        Thread thread2 = new Thread(new MyRunnable70("PONG"));
        //②主线程开始
        System.out.println("Game Start!");

        //③次线程开始
        thread1.start();
        thread2.start();

        //④将次线程纳入主线程顺序，执行main线程 打印game start-》执行次线程1和2，执行完后，最后执行main线程 打印game over；
        try{
          thread1.join();
          thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        //④上面执行完，最后执行主线程，程序结束
        System.out.println("Game Over!");
    }
    static void  javaAlarmClock(){
        //Java alarm clock
        Scanner scan = new Scanner(System.in);
        //定义时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //定义闹钟
        LocalTime alarmTime=null;
        //定义闹钟格式
        String filePath = "Bah Dop Bop - Casa Rosa's Tulum Vibes.wav";

        //①用户输入闹钟时间，如果闹钟时间alarmTime一直为空，就一直循环
        while(alarmTime==null){
            //如果用户输入的不是正确的闹钟时间alarmTime格式，就报错
            try{
                //获取用户输入的闹钟
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scan.nextLine();

                //将用户输入的闹钟转为标准时间格式，赋值给闹钟alarmTime
                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for "+alarmTime);
            }catch(DateTimeParseException e){
                System.out.println("Invalid format. Please us HH:MM:SS");
            }
        }
        //②执行闹钟AlarmClock线程
        //初始化alarmCLock71线程,准备好AlarmClock71 构造函数（用户设定的时间，闹铃文件，用户输入），new的时候自动执行内部的方法
        AlarmClock71 alarmClock71 = new AlarmClock71(alarmTime,filePath,scan);
        //执行alarmThread线程
        Thread alarmThread = new Thread(alarmClock71);
        alarmThread.start();


    //scan.close();
    }
}
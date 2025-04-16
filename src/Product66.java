

//66. Generics泛型类<T> = A concept where you can write a class, interface, or method
//泛型作用：存任何类型的数据，但又想类型安全；用法：定义类的时候用<T>，new的时候得给出具体的类型<string>；关键字：<T> ； 语法：List<String>、class Box<T>
//普通类，只能存内部定义的类型；
//普通类：如果你只要一把小刀，用专用的就好；
//泛型：但如果你要写一把能切苹果、削土豆、切面包的万能刀，泛型就是你最好的选择。
//<T> 是类型形参，实际用的时候由具体的类型实参决定它到底是什么。
//                  that is compatible with different data types.
//                  <T> type parameter (placeholder that gets replaced with a real type)
//                  <String> type argument (specifies the type)
//<T>和<E>本质没有区别，都是类型形参，只是语义不同、为了让人更好读懂代码。Type（通用类型）；	Element（集合中的元素）

//<T, U> 多个泛型，字母U在T之后，所以用U；
public class Product66<T, U> { //

    T item;  //可储存stirng，char，integer，Boolean等等类型的名字，一把能切苹果、削土豆、切面包的万能刀，
    U price; //可储存stirng，char，integer，Boolean等等类型的名字，一把能切苹果、削土豆、切面包的万能刀，

    Product66(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }
    public U getPrice(){
        return this.price;
    }
}

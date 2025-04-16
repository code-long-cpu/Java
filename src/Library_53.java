
//53.Aggregation(b对象外部new引入A对象) = Represents a "has-a" relationship between objects.
//                  One object(library) contains another object(book) as part of its structure,
//                  but the contained object/s(book和library) can exist independently.
//library object 包含 bool object；book 可以独立存在；

public class Library_53 {

    String name;
    int year;
    Book[] books; //Aggregation， Library包含存储Book类声明的实例数组

    Library_53(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books; //Aggregation 此处传入已有的books对象
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        //Aggregation，library实例调用book对象方法
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}

//Aggregation，Book对象是Book外部new的，然后传入到Library属性中而已，所以Book对象自己可以独立存在，不依赖于library对象的生命周期；
class Book{
    String title;
    int pages;

    Book(String title,int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages+ " pages)";
    }
}

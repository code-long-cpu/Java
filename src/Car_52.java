//52. Encapsulation (getter & setter) protect object data and add rules for accessing or modifying them.
//Getters = methods that make a field readable.
//Setters = methods that make a field writeable.

public class Car_52 {
    //private修饰符只有在本类中才能访问和修改
    private final String model; //final is an extra security
    private String color;
    private int price;

    Car_52(String model,String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //Getter methods - Readable
    String getModel(){
        return this.model;
    }
    String getColorl(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }
    String getPriceDollar(){
        return "$"+this.price;
    }

    //Setter methods - Writeable
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        //可以设置修改条件
       if(price<0){
           System.out.println("Price can't be less than zero.");
       }else{
           this.price = price;
       }
    }


}

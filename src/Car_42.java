public class Car_42 {
    String model;
    String color;

    Car_42(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        //after assiging values to your attributes using a Constructor;
        //You can use them within methods or change them;
        System.out.println("You drive the "+this.color+" "+this.model);
    }
}

//43. static = Makes a variable or method belong to the class
//             rather than to any specific  object
//             Commonly used for utility methods or shared resources
public class Friend_static_43 {
    static int numberOfFriends; //类属性，非object属性；
    String name; //object属性，非属性；
     Friend_static_43(String name){  //objectf方法，非类方法
         this.name = name;
         numberOfFriends++;
     }
     static void numberOfFriends(){
         System.out.println("You have "+numberOfFriends+" total friends.");
     }
}

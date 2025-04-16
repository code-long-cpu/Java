//41. overloaded constructor = Allow a class to have multiple constructors (like overloaded methods)
//                             with different parameter lists.
//                             Enable objects to be initialized in various ways.

public class User_41 {

    String username;
    String email;
    int age;

    User_41(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User_41(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 31;
    }
    User_41(String username, String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    User_41(){   //可以赋予默认值，以下代码注释掉结果就是null 0 null
        //this.username = "Guest";
        //this.email = "Not provided";
        //this.age = 0;
    }

}


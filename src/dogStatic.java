public class dogStatic {

    String name;
    int age;

    dogStatic(String name, int age){
        this.name = name;
        this.age= age;
    }

    static void speak(){
        System.out.println("The dog can speak");
    }

    static dogStatic happyDog(String name, int age){
        return new dogStatic(name,age);
    }
    static dogStatic sadDog(String name, int age){
        return new dogStatic(name,age);
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }


}

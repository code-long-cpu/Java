import java.lang.reflect.Array;
import java.util.Arrays; //sort array;
import java.util.Scanner;


public class array_31 {

    static Scanner scanner = new Scanner(System.in);

    //31.arrays
    static void array(){
        String[] fruits = {"apple","orange","banana","coconut"};
        System.out.println(fruits[0]); //apple
        System.out.println(fruits[1]); //orange

        //修改数组
        fruits[1]="pineapple";
        System.out.println(fruits[1]); // pineapple

        //数组长度
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits); //4

        //sort array in asending order; 需要import java.util.Arrays;
        Arrays.sort(fruits);

        //fill 填充数组
        //Arrays.fill(fruits,"pair"); //pair pair pair pair

        //forloop遍历数组
        for(int i=0; i<fruits.length;i++){
            System.out.print(fruits[i]+" "); //apple banana coconut pineapple
        }
        System.out.println();

        //enhanced forloop
        for(String fruit : fruits){
            System.out.print(fruit+" "); //apple banana coconut pineapple
        }
        System.out.println();

    }
    //32.inputArray ①先声明数组长度，②在给数组赋值
    static void inputArray(){
        //①declare and instantiante the lenght of an array
        String[] foods = new String[3];

        //②fill in the value
        foods[0]="pizza";
        foods[1]="taco";
        foods[2]="hamburger";

        for(String food : foods){
            System.out.print(food+" "); //pizza taco hamburger
        }
        System.out.println();
    }
    //32_2. handleEnterArray
    static void handleEnterArray(){
        //①declare an array
        String[] foods;
        int size;

        System.out.print("What number of food do you wanr?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0;i<foods.length;i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food:foods){
            System.out.print(food+" ");
        }
        System.out.println();
    }

    //33.search an int array
    static void searchIntArray(){
        int[] numbers = {1,4,2,6,9,3,5};
        int target = 3;
        boolean isFound = false;

        for(int i = 0 ;i<numbers.length;i++){
            if(target==numbers[i]){
                System.out.println("Element found at index: "+i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not fond in the array.");
        }
    }
    //33-2. search a string array;得用array[i].euqals(target);才行
    static void searchStrArray(){
        String[] fruits = {"apple","orange","banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruits to search for: ");
        target = scanner.nextLine();

        for(int i=0; i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: "+i);
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println(target+" not found in the array.");
        }
    }
    //34.varargs = allow a method to accept a varying number of arguments instead of using overloaded methods
    //java will pack the arguments into an array;
    static int varargsAdd(int...numbers){
        int sum = 0;

        if(numbers.length==0){
            return 0;
        }
        for(int number:numbers){
            sum += number;
        }
        return sum;
    }

    //35.2D array = multiple array, useful for storing a matrix of data;
    static void MultipleArray(){
        /* 第一种定义2D数组的方式
        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meals = {"chicken","prok","beef","fish"};
        String[][] groceries ={fruits,vegetables,meals};
         */
        // 第二种，直接定义即可
        String[][] groceries ={{"apple","orange","banana"},
                                {"potato","onion","carrot"},
                                {"chicken","prok","beef","fish"}};
        //修改2D array的数值
        groceries[0][0]="pineapple";
        groceries[1][0]="celery";
        //打印2D数组；
        for(String[]foods:groceries){
            for(String food:foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }
        //手机拨号键
        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row: telephone){
            for (char number:row){
                System.out.print(number+" ");
            }
            System.out.println();
        }

    }




}

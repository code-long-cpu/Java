//68. Enums = (Enumerations) A special kind of class that (declare constants)
//             represents a fixed set of constants.
//             They improve code readability and are easy to maintain.
//      Benefit: More efficient with switches when comparing Strings.

public enum Enum68 {

    //①定义常量constants,括号里给配对的值();
    SUNDAY(1),MONDAY(2),TUESDAY(4),WEDNESAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private final int dayNumber;

    //②定义enum的构造函数
    Enum68(int dayNumber){
        this.dayNumber = dayNumber;

    }
    public int getDayNumber(){
        return this.dayNumber;
    }
}

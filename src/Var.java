import javax.swing.*;

public class Var {
    /*Standard Code Variables*/
    public static String MyName = "Hithaysha";
    public static int NameLength = MyName.length();
    public static int MaxNameLength = 16;
    public static int NumberOne = 12;
    public static int NumberTwo = 13;
    public static int total = MathsUtils.addInt(NumberOne,NumberTwo);
    public static int CharactersRemaining = MathsUtils.subInt(MaxNameLength,NameLength);
    public static int FriendCount = 12;
    public static int ClassStudentCount = 36;
    public static double DoubleFriendCount = 1.2;
    public static double DoubleClassStudentCount = 36.9;
    public static int NonFriendCount = MathsUtils.subInt(ClassStudentCount, FriendCount);
    public static double DoubleNonFriendCount = MathsUtils.subDouble(DoubleClassStudentCount, DoubleFriendCount);

    /*Print Code Variables*/
    public static String PeopleDatabaseRun =
            "The amount of People you know is " + Var.FriendCount + "\n" +
            "The amount of People In the Class is " + Var.ClassStudentCount + "\n" +
            "The amount of People you don't know is " + Var.NonFriendCount;
    public static String DoublesPeopleDatabaseRun =
            "The amount of People you know is " + Var.DoubleFriendCount + "\n" +
                    "The amount of People In the Class is " + Var.DoubleClassStudentCount + "\n" +
                    "The amount of People you don't know is " + Var.DoubleNonFriendCount;
    public static String AdditionCode =
            NumberOne + " + " + NumberTwo + " = " + total;
    public static String NameInfo =
            "Your name is " + MyName + " which Contains " + NameLength + " characters." + "\n" +
            "The Maximum Name Length is " + MaxNameLength + " characters and you have " + CharactersRemaining + " characters Remaining";
}

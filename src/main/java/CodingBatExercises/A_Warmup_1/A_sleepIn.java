package CodingBatExercises.A_Warmup_1;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) -> true
sleepIn(true, false) -> false
sleepIn(false, true) -> true

 */

public class A_sleepIn {

    public static void main(String[] args) {
        A_sleepIn sleepInClass = new A_sleepIn();

        System.out.println(sleepInClass.sleepIn(false,false));
        System.out.println(sleepInClass.sleepIn(true,false));
        System.out.println(sleepInClass.sleepIn(false,true));

    }


    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

}



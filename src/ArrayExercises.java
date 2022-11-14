import java.util.Arrays;

public class ArrayExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newArray = new Person[people.length+1];
        System.arraycopy(people, 0, newArray, 0, people.length);
        newArray[people.length] = person;
        return newArray;
    }

    public static void main(String[] args) {
        Person[] stooges = new Person[3];
        stooges[0] = new Person("Larry");
        stooges[1] = new Person("Curly");
        stooges[2] = new Person("Moe");
        for (int i = 0; i < stooges.length; i ++) {
            System.out.println(stooges[i].getName());
        }
        Person[] fourStooges = addPerson(stooges, new Person("Shemp"));
        for (int i = 0; i < fourStooges.length; i ++) {
            System.out.println(fourStooges[i].getName());
        }

    }
}

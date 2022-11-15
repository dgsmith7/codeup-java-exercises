import java.util.Arrays;

public class SideEffectsOfArrays {
    public static void main(String[] args) {
        int[] myArrayOne = new int[5];
        int[] myArrayTwo = myArrayOne;  // copied with assignment operator - same address on heap
        int[] myArrayThree = myArrayOne.clone();  // copied with clone - makes new address on heap
        myArrayTwo[0] = 7;  // assign in Two
        System.out.println(myArrayOne[0]);  // changed in One and Two
        System.out.println("address of myArrayOne: " + myArrayOne);
        System.out.println("address of myArrayTwo: " + myArrayTwo);
        System.out.println("address of myArrayThree: " + myArrayThree);
    }
}

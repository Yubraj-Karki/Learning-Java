
// public class Main {
// public static void main(String[] args) {

// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

// System.out.println(typeofcars);

// }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// JAVA METHOD
// public class Main {
//     // JAVA METHOD
//     static void myMethod(String fname, int age) {
//         // code to be executed
//         System.out.println("Hi, my name is " + fname + " and I am " + age + " years old.");
//     }

//     // EXECUTING THE METHOD
//     public static void main(String[] args) {
//         // PASSING ARGUMENTS TO THE METHOD
//         myMethod("Joseph", 30);
//     }

// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// VOID
public class Main {
    // Void keyword is omitted so the method should return some value
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(10, 12);
        System.out.println(z);
    }

}


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
// // JAVA METHOD
// static void myMethod(String fname, int age) {
// // code to be executed
// System.out.println("Hi, my name is " + fname + " and I am " + age + " years
// old.");
// }

// // EXECUTING THE METHOD
// public static void main(String[] args) {
// // PASSING ARGUMENTS TO THE METHOD
// myMethod("Joseph", 30);
// }

// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// VOID
// public class Main {
// // Void keyword is omitted so the method should return some value
// static int myMethod(int x, int y) {
// return x + y;
// }

// public static void main(String[] args) {
// int z = myMethod(10, 12);
// System.out.println(z);
// }

// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// IF ELSE INSIDE METHODS
// public class Main {
// static void verifyAuthority(String name, int age) {
// if (age > 18)
// System.out.println("Hi, " + name + ", you have this right");
// else
// System.out.println("Hi, " + name + ", you don't have a right for this.");

// }

// public static void main(String[] args) {
// verifyAuthority("John", 17);
// verifyAuthority("Anna", 20);
// }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// JAVA SCOPE
// public class Main {
// public static void main(String[] args) {
// // X cannot be accessed here
// int x = 10;

// System.out.println(x);
// }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// JAVA RECURSION
// public class Main {
// public static void main(String[] args) {
// int result = sum(10);
// System.out.println(result);

// }

// public static int sum(int k) {
// if (k > 0) {
// return k + sum(k - 1);
// } else {
// return 0;
// }
// }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Creating class and it's objects
// class Main {
// int x = 20;

// public static void main(String[] args) {
// Main myObj = new Main();

// System.out.println(myObj.x);
// }
// }

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Creating static and public methods
public class Main {

    // Static method
    static void sayMyName(String name) {
        System.out.println("You are " + name);
    }

    // Public method
    public void sayHisName(String name) {
        System.out.println("He is " + name);
    }

    public static void main(String[] args) {

        // Static method can be accessed without creating an object of the class
        sayMyName("Heisenberg");

        // Public method cannot be accessed without creating an object of the class Main

        Main myObj = new Main(); // Create and obj of Main

        myObj.sayHisName("Jessie Pinkman"); // Call the public method on the object
    }
}

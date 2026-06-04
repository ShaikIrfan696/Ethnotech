class Demo {
    // method with variable number of arguments
    // the arguments are treated as an array inside the method
    void display(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // calling the method with different number of arguments
        // can pass any number of integers to the display method
        Demo d = new Demo();
        d.display(1, 2, 3);
        d.display(10, 20);
        d.display(5);
    }
}
System.out.print (num + * ");
i
Q A System.out.printIn();|
Run | Debug
public static void main(String[] args) {
//calling the method with different number of arguments
//can pass any number of integers to the display method
demo d = new demo();
d.display(...numbers: 1, 2, 3);
d.display(...numbers: 10, 20);
d.display(...numbers: 5);
}
i;
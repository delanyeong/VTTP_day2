package myapp2.core;



public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //instantiate the array
        String [] todos = new String[3];

        //assign some values to the array
        todos[0] = "learn java";
        todos[1] = "learn python";
        todos[2] = "learn django";

        System.out.printf("Index: %d value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d value = %s\n", 1, todos[1]);
        System.out.printf("Index: %d value = %s\n", 2, todos[2]);

        //Every array has a property called length
        System.out.printf("Size of array: %d\n", todos.length);

        //Size of args
        System.out.printf("Size of array: %d\n", args.length);
        System.out.printf("Size of array: %d\n",0, args[0]);
        System.out.printf("Size of array: %d\n",0, args[1]);



    }
}
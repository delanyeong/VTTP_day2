package myapp2.core;

public class SumAll {
    
    public static void main (String [] args) {
        
        //for loop
        for (int i = 0; i < args.length; i++){
            
            int operand = 0;
            int result = 0;
            
            System.out.printf("%s\n", args[i]);

            operand = Integer.parseInt(args[i]);
            
            result += operand;
        }
    }
}

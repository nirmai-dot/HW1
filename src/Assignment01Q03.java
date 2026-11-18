public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 10; //Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        int first=1,second=1;
        int numOdd = 2;
        System.out.print(first + " " + second);
        for (int i = 2; i < x; i++) {
            int next = first+second;
            System.out.print(" " + next);
            if (next%2 == 1){
                numOdd++;
            }
            first = second;
            second = next;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

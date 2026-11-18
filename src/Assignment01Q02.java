public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        /// ...
        double j=1;
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i<num; i++){
            approxPi+=Math.pow(-1,i)*(4*(1/j));
            j+=2;
        }
        System.out.println(approxPi + " " + actualPi);
        
        /////////////////////////////////////////////
        
    }
}

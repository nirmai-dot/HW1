public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (int i=0; i<args.length; i++)
        {
            String cur = args[i];
            if (cur.charAt(0) % 5 == 0 ){
                System.out.println(cur.charAt(0));
            }
        }
    }
}

public class MoreAboutArrays {

    public static void main(String[] args) {
        //program arguments are used to call program and pass it some arguments
        //run -> edit configurations -> MoreAboutArrays -> program arguments
        System.out.println("args number: " + args.length);
        for (int i = 0; i < args.length; i++) {
            int myInt = Integer.valueOf(args[i]);
            System.out.println(myInt * myInt);
        }
    }

    //task: print squares of numbers passed as program agruments:
    //1 3 5 6
    //1
    //9
    //25
    //36

}

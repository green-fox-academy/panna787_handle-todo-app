public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            mainZeroArg();
        } else if(args[0].equals("l")){
            System.out.println("list");
        }
    }

    public static void mainZeroArg(){
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes an task\n" +
                " -c   Completes an task");
    }

}

import java.util.ArrayList;

public class ArgumentList {

    ArrayList<Argument> listOfArguments = new ArrayList<>();

    public void addNewArgument(Argument newArgument){
        listOfArguments.add(newArgument);
    }

    public void printPossibleArguments(){
        for (Argument arg: listOfArguments
             ) {
            System.out.println("-" + arg.name + "   " + arg.description);
        }
    }
}

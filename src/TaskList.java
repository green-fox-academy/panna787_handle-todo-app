import java.util.ArrayList;

public class TaskList {

    ArrayList<String> listOfTasks = new ArrayList<>();

    public void addTask(){



    }

    public void orintAllTask(){
        for (int i = 0; i < listOfTasks.size(); i++) {
            System.out.println((i + 1) + " - " + listOfTasks.get(i));
        }
    }
}

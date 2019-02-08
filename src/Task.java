public class Task {

    boolean completed;
    String description;

    public Task(String description){
        this.description = description;
        this.completed = false;
    }

    public void complete(){
        completed = true;
    }
}

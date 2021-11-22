import java.util.Random;

public class Task {
    Tasks_pit task_description;
    Reviews_pit task_review;

    @Override
    public String toString() {
        return "Task{" +
                "task_description=" + task_description +
                ", task_review=" + task_review +
                '}';
    }

    public Tasks_pit randomTask() {
        int pick = new Random().nextInt(Tasks_pit.values().length);
        return Tasks_pit.values()[pick];
    }
    public Reviews_pit randomReview() {
        int pick = new Random().nextInt(Reviews_pit.values().length);
        return Reviews_pit.values()[pick];
    }
    public Task(){

        task_description =randomTask();
        task_review = randomReview();
    }
}

import java.io.Serializable;
import java.util.Random;

public class Task implements Serializable
{


    TasksPit taskDescription;
    ReviewsPit taskReview;

    @Override
    public String toString() {
        return "Task{" +
                "taskDescription=" + taskDescription.rusVersion +
                ", taskReview=" + taskReview.rusVersion +
                '}';
    }

    public TasksPit randomTask() {
        int pick = new Random().nextInt(TasksPit.values().length);
        return TasksPit.values()[pick];
    }
    public ReviewsPit randomReview() {
        int pick = new Random().nextInt(ReviewsPit.values().length);
        return ReviewsPit.values()[pick];
    }
    public Task(){

        taskDescription = randomTask();
        taskReview = randomReview();
    }
}

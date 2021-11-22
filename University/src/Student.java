import java.util.Arrays;
import java.util.Random;

public class Student extends human
{
    double avg_score;
    Task[] tasks_list = new Task[10];
    Achievement[] achievements_list = new Achievement[10];
    public Student()
    {
        Random r = new Random();
        iD_number = r.nextInt(900)+100;
        avg_score = Math.random()*(5-3.5)+3.5;//Использовать при выводе System.out.printf("%.1f", i);
        amount_of_visits = 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID = " + iD_number +
                "Visits =" + amount_of_visits +
                "avg_score =" + avg_score +
                ", tasks_list =" + Arrays.toString(tasks_list) +
                ", achievements_list =" + Arrays.toString(achievements_list) +
                '}';
    }

    public void Task_assign(int i)
    {

            tasks_list[i] = new Task();

    }
    public void Achiev_assign(int i)
    {

            achievements_list[i] = new Achievement();

    }
}

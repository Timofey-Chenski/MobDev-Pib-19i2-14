import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class Student extends Human implements Serializable
{


    double avgScore;
    Task[] tasksList = new Task[5];
    Achievement[] achievementsList = new Achievement[5];

    public Student()
    {
        Random r = new Random();
        idNumber = r.nextInt(900)+100;
        avgScore = Math.random()*(5-3.5)+3.5;//Использовать при выводе System.out.printf("%.1f", i);
        amountOfVisits = 0;
    }

    @Override
    public String toString() {
        return  " Student{" +
                " id = " + idNumber +
                " visits =" + amountOfVisits +
                " avgScore =" + avgScore + "%n" +
                " tasksList =" + Arrays.toString(tasksList) + "%n" +
                " achievementsList =" + Arrays.toString(achievementsList) +
                "}" + "%n";
    }

    public void taskAssign(int i)
    {

        tasksList[i] = new Task();

    }
    public void achievAssign(int i)
    {

        achievementsList[i] = new Achievement();

    }
}

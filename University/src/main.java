import java.util.Random;

public class main {
    public static void student_init(Student[] student_list) {
        for (int i =0; i < 6; i++)
        {
            student_list[i] = new Student();
        }
    }
    public static void Scene1(Student[] Student_list)//Студенты 1,3,4 отсутствуют
    {
        int a=0;
        int b=2;
        int c=5;
        Random r = new Random();
        int i = r.nextInt(5);
        for (int day =0; day < 5; day++) {

            Student_list[a].amount_of_visits = +1;
            Student_list[b].amount_of_visits = +1;
            Student_list[c].amount_of_visits = +1;

            Student_list[a].Task_assign(day);
            Student_list[a].Achiev_assign(day);

            Student_list[b].Achiev_assign(day);

            Student_list[c].Task_assign(day);
        }
        System.out.printf(Student_list[a].toString()+" "+Student_list[b].toString()
                +" "+Student_list[c].toString());

    }
    public static void Scene2(Student[] Student_list)//Студенты 1,3,4 отсутствуют
    {
        int a=1;
        int b=3;
        int c=4;
        Random r = new Random();
        int i = r.nextInt(5);
        for (int day =1; day <= 5; day++) {

            Student_list[a].amount_of_visits = +1;
            Student_list[b].amount_of_visits = +1;
            Student_list[c].amount_of_visits = +1;

            Student_list[a].Task_assign(day);
            Student_list[a].Achiev_assign(day);

            Student_list[b].Achiev_assign(day);

            Student_list[c].Task_assign(day);
        }
        System.out.printf(Student_list[a].toString()+" "+Student_list[b].toString()
                +" "+Student_list[c].toString());

    }

    public static void main(String[] args) {
    Student[] Student_list = new Student[10];
    student_init(Student_list);
        Random r = new Random();
        int i = r.nextInt(1);
        switch (i) {
            case 0: Scene1(Student_list); break;
            case 1: Scene2(Student_list); break;
        }
    }



}

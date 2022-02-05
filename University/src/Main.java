import java.nio.file.*;
import java.util.Random;
import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Main
{
    public static void studentInit(Student[] studentList)
    {
        for (int i =0; i < 6; i++)
        {
            studentList[i] = new Student();
        }
    }

    public static void scene1(Student[] studentList)//Студенты 1,3,4 отсутствуют
    {
        int attendingStudent1=0;
        int attendingStudent2=2;
        int attendingStudent3=5;

        for (int day =0; day < 5; day++)
        {

            studentList[attendingStudent1].amountOfVisits++;
            studentList[attendingStudent2].amountOfVisits++;
            studentList[attendingStudent3].amountOfVisits++;

            studentList[attendingStudent1].taskAssign(day);
            studentList[attendingStudent1].achievAssign(day);

            studentList[attendingStudent2].achievAssign(day);

            studentList[attendingStudent3].taskAssign(day);
        }



        System.out.printf(studentList[attendingStudent1].toString()+" "+studentList[attendingStudent2].toString()
                +" "+studentList[attendingStudent3].toString());


    }
    public static void scene2(Student[] studentList)//Студенты 0,2,5 отсутствуют
    {
        int attendingStudent1=1;
        int attendingStudent2=3;
        int attendingStudent3=4;

        for (int day =1; day <= 5; day++) {

            studentList[attendingStudent1].setAmountOfVisits(+1);
            studentList[attendingStudent2].setAmountOfVisits(+1);
            studentList[attendingStudent3].setAmountOfVisits(+1);

            studentList[attendingStudent1].taskAssign(day);
            studentList[attendingStudent1].achievAssign(day);

            studentList[attendingStudent2].achievAssign(day);

            studentList[attendingStudent3].taskAssign(day);
        }
        System.out.printf(studentList[attendingStudent1].toString()+"%n"+studentList[attendingStudent2].toString()
                +"%n"+studentList[attendingStudent3].toString());

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        Student[] studentList = new Student[6];
        studentInit(studentList);
        Random r = new Random();


            try (FileInputStream fileInputStream1 = new FileInputStream("C:\\Student1.ser");
                 FileInputStream fileInputStream2 = new FileInputStream("C:\\Student2.ser");
                 FileInputStream fileInputStream3 = new FileInputStream("C:\\Student3.ser");)
            {

                ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
                ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
                ObjectInputStream objectInputStream3 = new ObjectInputStream(fileInputStream3);

                Student student1 = (Student) objectInputStream1.readObject();
                Student student2 = (Student) objectInputStream2.readObject();
                Student student3 = (Student) objectInputStream3.readObject();

                System.out.printf(student1 + "%n" + student2 + "%n" + student3);

                objectInputStream1.close();
                objectInputStream2.close();
                objectInputStream3.close();

                FileOutputStream outputStream1 = new FileOutputStream("C:\\Student1.ser");
                FileOutputStream outputStream2 = new FileOutputStream("C:\\Student2.ser");
                FileOutputStream outputStream3 = new FileOutputStream("C:\\Student3.ser");

                ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(outputStream1);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStream2);
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(outputStream3);

                int i = r.nextInt(1);
                switch (i) {
                    case 0:
                        scene1(studentList);
                        objectOutputStream1.writeObject(studentList[0]);
                        objectOutputStream2.writeObject(studentList[2]);
                        objectOutputStream3.writeObject(studentList[5]);

                        objectOutputStream1.close();
                        objectOutputStream2.close();
                        objectOutputStream3.close();
                        break;

                    case 1:
                        scene2(studentList);
                        objectOutputStream1.writeObject(studentList[1]);
                        objectOutputStream2.writeObject(studentList[3]);
                        objectOutputStream3.writeObject(studentList[4]);

                        objectOutputStream1.close();
                        objectOutputStream2.close();
                        objectOutputStream3.close();
                        break;
                }

            }
            catch (FileNotFoundException fnfe)
            { FileOutputStream outputStream1 = new FileOutputStream("A:\\Student1.ser");
                FileOutputStream outputStream2 = new FileOutputStream("A:\\Student2.ser");
                FileOutputStream outputStream3 = new FileOutputStream("A:\\Student3.ser");

                ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(outputStream1);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStream2);
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(outputStream3);

                int i = r.nextInt(1);
                switch (i)
                {
                    case 0:
                        scene1(studentList);
                        objectOutputStream1.writeObject(studentList[0]);
                        objectOutputStream2.writeObject(studentList[2]);
                        objectOutputStream3.writeObject(studentList[5]);

                        objectOutputStream1.close();
                        objectOutputStream2.close();
                        objectOutputStream3.close();
                        break;

                    case 1:
                        scene2(studentList);
                        objectOutputStream1.writeObject(studentList[1]);
                        objectOutputStream2.writeObject(studentList[3]);
                        objectOutputStream3.writeObject(studentList[4]);

                        objectOutputStream1.close();
                        objectOutputStream2.close();
                        objectOutputStream3.close();
                        break;
                }
            }
    }
}
package prac11;

// Задание 1
public class Student implements Comparable
{

    private int IDNum; // Номер студента
    private int GPA; // Итоговые балы

    public Student(int iDNum, int GPA)
    {
        this.IDNum = iDNum;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + IDNum +
                ", GPA=" + GPA +
                '}';
    }

    public int getIDNum() {
        return IDNum;
    }

    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object example) // example - объект, с которым я хочу сравнить текущий объект
    {
        if(!(example instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");

        // Сравнивание номера текущего студента со студентом, который поступил на вход
        // Соответственно, если номер текущего совпадает с тем, что дали - вернёт 0
        // В иных случаях либо положительное число, либо отрицательное, в зависимости от значений IDNum

        return this.IDNum - ((Student) example).IDNum;
    }

}

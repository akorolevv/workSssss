package prac17.ex2;

import java.util.ArrayList;

public class Starter
{
    public static void main(String[] args)
    {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Фамилия1", 30, 23, 17));
        s.add(new Student("Фамилия2", 228, 22, 18));
        s.add(new Student("Фамилия3", 1337, 11, 20));
        s.add(new Student("Фамилия4", 100, 11, 17));
        s.add(new Student("Фамилия5", 189, 9, 21));

        new LabClassUI(s);
    }

}

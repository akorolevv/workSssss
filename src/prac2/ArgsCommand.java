package prac2;

public class ArgsCommand
{
    public static void main(String[] args)
    {
        for (int i = 0;i < args.length; i++)
        {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}

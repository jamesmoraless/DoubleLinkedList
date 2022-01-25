package Q1BL3;

public class Student {

    private String firstName;
    private Double score;

    public Student(String firstName, Double score)
    {
        this.firstName = firstName;
        this.score = score;
    }

    public String toString()
    {
        return firstName+": "+score;
    }


    public static void header(String name, int studentNum)
    {
        String nm = name;
        int sN = studentNum;

        System.out.println("_______________________________________");
        System.out.println("|  "+ nm + " ********* " + sN+"  |");
        System.out.println("---------------------------------------\n");

    }

    public static void footer()
    {
        System.out.println("\nGoodbye from James :)");
    }
}

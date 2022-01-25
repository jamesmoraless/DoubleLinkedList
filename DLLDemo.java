package Q1BL3;

public class DLLDemo {
    public static void main(String[] args) {
        Student.header("James", 251136192);
        DoublyLinkedList<Student> jamesList = new DoublyLinkedList<>();

        Student s1 = new Student("Harry", 67.35);
        Student s2 = new Student("Luna", 87.5);
        Student s3 = new Student("Vincent", 60.5);
        Student s4 = new Student("Hermione", 89.2);

        jamesList.addLast(s1);
        jamesList.addLast(s2);
        jamesList.addLast(s3);

        System.out.println("Adding 3 student to the list.");
        System.out.println("The list Content: ");
        System.out.println(jamesList);//this calls the toString method

        jamesList.addBetween(s4, jamesList.findNode(s2), jamesList.findNode(s3));


        System.out.println("The list Content: ");
        System.out.println("Adding 4th student in between... ");
        System.out.println(jamesList);//this calls the toString method

        Student.footer();





    }
}

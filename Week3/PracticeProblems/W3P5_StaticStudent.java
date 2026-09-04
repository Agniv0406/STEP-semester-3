package Week3.PracticeProblems;

class Student {

    String name;
    int attendance;

    static String collegeName =
        "SRM Institute of Science and Technology";

    static int studentCount = 0;

    Student(
            String name,
            int attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    static void printCollegeInfo() {

        System.out.println(
            collegeName
        );

        System.out.println(
            "Students created: " +
            studentCount
        );
    }
}

public class W3P5_StaticStudent {

    public static void main(String[] args) {

        new Student(
            "Ravi",
            90
        );

        new Student(
            "Meera",
            95
        );

        Student.printCollegeInfo();
    }
}
package Week3.AssignmentProblems;

class StaticEmployee {

    String empName;
    double salary;

    static String companyName =
        "Bright Horizon Technologies";

    static int employeeCount = 0;

    StaticEmployee(
            String empName,
            double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(
            companyName
        );

        System.out.println(
            "Employees on record: " +
            employeeCount
        );
    }
}

public class W3A5_StaticEmployee {

    public static void main(String[] args) {

        new StaticEmployee(
            "A",
            40000
        );

        new StaticEmployee(
            "B",
            50000
        );

        new StaticEmployee(
            "C",
            60000
        );

        StaticEmployee.printCompanyInfo();
    }
}

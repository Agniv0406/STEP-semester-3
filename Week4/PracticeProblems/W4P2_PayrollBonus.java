package Week4.PracticeProblems;

class BonusEmployee {

    String empId;
    double salary;

    BonusEmployee(
            String empId,
            double salary) {

        this.empId = empId;
        this.salary = salary;
    }

    void raiseSalary(
            double salary) {

        this.salary += salary;
    }
}

public class W4P2_PayrollBonus {

    public static void main(String[] args) {

        BonusEmployee[] employees = {

            new BonusEmployee(
                "E-101",
                40000
            ),

            new BonusEmployee(
                "E-102",
                55000
            ),

            new BonusEmployee(
                "E-103",
                62000
            ),

            new BonusEmployee(
                "E-104",
                48000
            )
        };

        for (BonusEmployee employee : employees) {

            employee.raiseSalary(5000);

            System.out.println(
                employee.empId +
                " | Final Salary: Rs " +
                employee.salary
            );
        }
    }
}
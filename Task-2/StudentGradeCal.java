import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subjects : ");
        int NumsSubjects = sc.nextInt();
        if (NumsSubjects <= 0) {
            System.out.println("Invalid Number of Subjects! ");
            sc.close();
            return;
        }
        double TotalMarks = 0;
        for (int i = 1; i <= NumsSubjects; i++) {
            System.out.println("Enter Marks for Subject " + i + " (out of 100) : ");
            double Marks = sc.nextDouble();

            if (Marks < 0 || Marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                sc.close();
                return;
            }
            TotalMarks += Marks;
        }
        double AvgPercentage = TotalMarks / NumsSubjects;
        String Grade;

        if (AvgPercentage >= 90) {
            Grade = "A+";
        } else if (AvgPercentage >= 80) {
            Grade = "A";
        } else if (AvgPercentage >= 70) {
            Grade = "B";
        } else if (AvgPercentage >= 60) {
            Grade = "C";
        } else if (AvgPercentage >= 50) {
            Grade = "D";
        } else if (AvgPercentage >= 35) {
            Grade = "E";
        } else {
            Grade = "F";
        }

        System.out.println("\n====== Student Grade Calculator ======");
        System.out.println("# Total Marks : " + TotalMarks + " / " + (NumsSubjects * 100));
        System.out.printf("# Average Percentage : %.2f%%%n", AvgPercentage);
        System.out.println("# Grade :-> " + Grade + "\n");
        sc.close();
    }
}

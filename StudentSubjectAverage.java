import java.util.Scanner;
public class StudentSubjectAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][];       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new double[subjects];
            
            for (int j = 0; j < subjects; j++) {
                System.out.print("Marks: ");
                marks[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + " Average: " + (sum / marks[i].length));
        }
    }
}


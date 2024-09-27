import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    // Method to validate date format
    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // Method to read student details and store them in arrays
    public static void readingStudentDetails(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds, String[] dateOfBirths) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the details of student " + (i + 1) + ".");

            // Input student name
            String name;
            while (true) {
                System.out.print("Enter the name of student: ");
                name = s.nextLine();
                if (name.isEmpty() || !name.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid name! Please enter only alphabets.");
                } else {
                    studentNames[i] = name;
                    break;
                }
            }

            // Input student ID
            int studentId;
            while (true) {
                try {
                    System.out.print("Enter the ID: ");
                    studentId = s.nextInt();
                    if (studentId <= 0) {
                        System.out.println("ID must be a positive number.");
                    } else {
                        studentIds[i] = studentId;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    s.next();
                }
            }
            s.nextLine();

            // Input date of birth
            String dateOfBirth;
            while (true) {
                System.out.print("Enter the date of birth (dd/MM/yyyy): ");
                dateOfBirth = s.nextLine();
                if (isValidDate(dateOfBirth)) {
                    dateOfBirths[i] = dateOfBirth;
                    break;
                } else {
                    System.out.println("Invalid date format or invalid date! Please enter in dd/MM/yyyy format.");
                }
            }

            // Input marks for each subject
            for (int j = 0; j < 5; j++) {
                while (true) {
                    try {
                        System.out.print("Mark obtained in subject " + (j + 1) + " (0-100): ");
                        int mark = s.nextInt();
                        if (mark < 0 || mark > 100) {
                            System.out.println("Marks must be between 0 and 100.");
                        } else {
                            allSubjectMarks[i][j] = mark;
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        s.next();
                    }
                }
            }
            s.nextLine();

            // Write student details to a file
            try {
                BufferedWriter studentFileObject = new BufferedWriter(new FileWriter("student_records/Student" + i + ".txt"));
                studentFileObject.write("Name: " + studentNames[i] + "\n");
                studentFileObject.write("ID: " + studentIds[i] + "\n");
                studentFileObject.write("Date of Birth: " + dateOfBirths[i] + "\n");

                for (int j = 0; j < 5; j++) {
                    studentFileObject.write("Subject " + (j + 1) + " marks: " + allSubjectMarks[i][j] + "\n");
                }
                studentFileObject.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Method to create a mark sheet
    public static void creatingMarkSheet(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Mark_sheet.txt"));
            bw.write(String.format("%-15s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Maths", "English", "Physics", "Chemistry", "Biology"));

            for (int i = 0; i < numberOfStudents; i++) {
                bw.write(String.format("%-15s %-10d %-10d %-10d %-10d %-10d\n",
                        studentNames[i], allSubjectMarks[i][0], allSubjectMarks[i][1],
                        allSubjectMarks[i][2], allSubjectMarks[i][3], allSubjectMarks[i][4]));
            }

            bw.close();
            System.out.println("\nMark sheet created successfully.\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Method to rank students based on average score
    public static void studentRanking(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds, String[] dateOfBirths, float[] averageScore) {
        // Bubble sort based on average score
        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (averageScore[j] < averageScore[j + 1]) {
                    // Swap student IDs
                    int tempId = studentIds[j];
                    studentIds[j] = studentIds[j + 1];
                    studentIds[j + 1] = tempId;

                    // Swap names
                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;

                    // Swap date of birth
                    String tempDateOfBirth = dateOfBirths[j];
                    dateOfBirths[j] = dateOfBirths[j + 1];
                    dateOfBirths[j + 1] = tempDateOfBirth;

                    // Swap marks
                    int[] tempMarks = allSubjectMarks[j];
                    allSubjectMarks[j] = allSubjectMarks[j + 1];
                    allSubjectMarks[j + 1] = tempMarks;

                    // Swap average scores
                    float tempScore = averageScore[j];
                    averageScore[j] = averageScore[j + 1];
                    averageScore[j + 1] = tempScore;
                }
            }
        }

        System.out.println("\nRank list:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + ". " + studentNames[i] + " (ID: " + studentIds[i] + ")");
        }
    }

    // Method to compute and display student performance
    public static void computeStudentPerformance(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds, String[] dateOfBirths) {
        float[] totalScore = new float[numberOfStudents];
        float[] averageScore = new float[numberOfStudents];

        // Calculate total and average scores
        for (int i = 0; i < numberOfStudents; i++) {
            totalScore[i] = 0;
            for (int j = 0; j < 5; j++) {
                totalScore[i] += allSubjectMarks[i][j];
            }
            averageScore[i] = totalScore[i] / 5;
            System.out.println("Average score of student " + (i + 1) + ": " + averageScore[i]);
        }

        // Report Generation
        try{
            for (int i = 0; i < numberOfStudents; i++) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Student"+(i+1)+"_Report.txt"));
                bw.write("Name: "+studentNames[i]);
                bw.write("\nStudent ID: "+ studentIds[i]);
                bw.write("\nDate of Birth: "+ dateOfBirths[i]);
                bw.write("\nAverage Score: "+averageScore[i]);
                bw.write("\nStatus: "+((averageScore[i] >= 45)? "Pass": "Fail"));
                bw.close();
            }

        }catch (Exception e){
            System.out.println(e);
        }

        // Find toppers for each subject
        for (int i = 0; i < 5; i++) {
            int maxScore = 0;
            String topper = "";
            for (int j = 0; j < numberOfStudents; j++) {
                if (allSubjectMarks[j][i] > maxScore) {
                    maxScore = allSubjectMarks[j][i];
                    topper = studentNames[j];
                }
            }
            System.out.println("Highest score in subject " + (i + 1) + ": " + maxScore + " by " + topper);
        }

        // Call the student ranking method
        studentRanking(numberOfStudents, studentNames, allSubjectMarks, studentIds, dateOfBirths, averageScore);
    }

    // Method to sort students by ID
    public static void sortStudentsById(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds, String[] dateOfBirths) {
        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (studentIds[j] > studentIds[j + 1]) {
                    // Swap student IDs
                    int tempId = studentIds[j];
                    studentIds[j] = studentIds[j + 1];
                    studentIds[j + 1] = tempId;

                    // Swap names
                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;

                    // Swap date of birth
                    String tempDateOfBirth = dateOfBirths[j];
                    dateOfBirths[j] = dateOfBirths[j + 1];
                    dateOfBirths[j + 1] = tempDateOfBirth;

                    // Swap marks
                    int[] tempMarks = allSubjectMarks[j];
                    allSubjectMarks[j] = allSubjectMarks[j + 1];
                    allSubjectMarks[j + 1] = tempMarks;
                }
            }
        }
    }
    public static void searchStudent(int numberOfStudents, String[] studentNames, int[][] allSubjectMarks, int[] studentIds, String[] dateOfBirths){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id to search student: ");
        int id = s.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            if(id == studentIds[i]){
                System.out.print("Student found at "+i+);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String directoryPath = "student_records";
        File directory = new File(directoryPath);

        // Create directory if not exists
        if (!directory.exists()) {
            directory.mkdir();
        } else {
            System.out.println("Directory already exists");
        }

        // Initialize arrays for student details
        int numberOfStudents = 2;
        String[] studentNames = new String[numberOfStudents];
        int[][] allSubjectMarks = new int[numberOfStudents][5];
        int[] studentIds = new int[numberOfStudents];
        String[] dateOfBirths = new String[numberOfStudents];

        readingStudentDetails(numberOfStudents, studentNames, allSubjectMarks, studentIds, dateOfBirths);
        creatingMarkSheet(numberOfStudents, studentNames, allSubjectMarks, studentIds);

        do{
            int option;
            System.out.print("\nChoose from");
            System.out.print("\n1. Compute Student Performance\t2.Sort By StudentId\t3.Search By id\t4.Search By Name\t6.Exit\n");
            option = s.nextInt();

            switch (option){
                case 1: computeStudentPerformance(numberOfStudents, studentNames, allSubjectMarks, studentIds, dateOfBirths);
                    break;
                case 2: sortStudentsById(numberOfStudents, studentNames, allSubjectMarks, studentIds, dateOfBirths);
                    break;
                case 3: searchStudent(numberOfStudents, studentNames, allSubjectMarks, studentIds, dateOfBirths);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: exit(0);
            }
        }while(true);
    }
}



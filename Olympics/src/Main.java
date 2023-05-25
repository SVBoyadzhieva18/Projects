import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Olympiad olympiad = new Olympiad();
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Add a pupil");
            System.out.println("3. Show all data");
            System.out.println("4. Show student data by university and points");
            System.out.println("5. Get pupils by city");
            System.out.println("6. Remove pupil by grade");
            System.out.println("7. Remove student by university");
            System.out.println("8. Get participants by points");
            System.out.println("9. Exit");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student EGN: ");
                    String egn = sc.nextLine();
                    System.out.print("Enter student university: ");
                    String university = sc.nextLine();
                    System.out.print("Enter student faculty: ");
                    String specialty = sc.nextLine();
                    System.out.print("Enter student points: ");
                    int points = sc.nextInt();
                    sc.nextLine();
                    olympiad.addStudent(name, egn, university, null, specialty, points);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter pupil name: ");
                    name = sc.nextLine();
                    System.out.print("Enter pupil EGN: ");
                    egn = sc.nextLine();
                    System.out.print("Enter pupil school: ");
                    String school = sc.nextLine();
                    System.out.print("Enter pupil grade: ");
                    String grade = sc.nextLine();
                    System.out.print("Enter pupil points: ");
                    points = sc.nextInt();
                    sc.nextLine();
                    olympiad.addPupil(name, egn, school, grade, points);
                    System.out.println("Pupil added successfully.");
                    break;
                case 3:
                    olympiad.showData();
                    break;
                case 4:
                    System.out.print("Enter university: ");
                    university = sc.nextLine();
                    System.out.print("Enter points: ");
                    points = sc.nextInt();
                    sc.nextLine();
                    olympiad.getStudentsByUniversityAndPoints(university, points);
                    break;
                case 5:
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
                    List<Pupil> pupils = olympiad.getPupilsByCity(city);
                    for (Pupil pupil : pupils) {
                        System.out.println(pupil);
                    }
                    break;
                case 6:
                    System.out.print("Enter grade: ");
                    grade = sc.nextLine();
                    olympiad.removePupilByGrade(grade);
                    System.out.println("Pupil removed successfully.");
                    break;
                case 7:
                    System.out.print("Enter university: ");
                    university = sc.nextLine();
                    olympiad.removeStudentByUniversity(university);
                    System.out.println("Student removed successfully.");
                    break;
                case 8:
                    System.out.print("Enter points: ");
                    points = sc.nextInt();
                    sc.nextLine();
                    List<Object> participants = olympiad.getParticipantsByPoints(points);
                    for (Object participant : participants) {
                        System.out.println(participant);
                    }
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
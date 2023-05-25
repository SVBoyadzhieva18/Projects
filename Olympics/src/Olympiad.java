import java.util.ArrayList;
import java.util.List;

class Olympiad {
    List<Student> students = new ArrayList<>();
    List<Pupil> pupils = new ArrayList<Pupil>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    public void addParticipant(String name, String egn, String schoolOrUniversity, String gradeOrFaculty, String specialization, int points) {
        Object university = null;
        Object faculty = null;
        if (schoolOrUniversity != null && gradeOrFaculty != null) {
            Pupil pupil = new Pupil(name, egn, schoolOrUniversity, gradeOrFaculty, points);
            pupils.add(pupil);
        } else if (university != null && faculty != null && specialization != null) {
            Student student = new Student(name, egn, schoolOrUniversity, gradeOrFaculty, specialization, points);
            students.add(student);
        }
    }

    public void displayData() {
        for (Student student : students) {
            student.displayData();
        }
        for (Pupil pupil : pupils) {
            pupil.displayData();
        }
    }

    public void showAllData() {
        System.out.println("All Participants Data:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("EGN: " + student.getEgn());
            System.out.println("University: " + student.getUniversity());
            System.out.println("Faculty: " + student.getFaculty());
            System.out.println("Specialization: " + student.getSpecialization());
            System.out.println("Points: " + student.getPoints());
            System.out.println("----------------------------");
        }
        for (Pupil pupil : pupils) {
            System.out.println("Name: " + pupil.getName());
            System.out.println("EGN: " + pupil.getEgn());
            System.out.println("School: " + pupil.getSchool());
            System.out.println("Grade: " + pupil.getGrade());
            System.out.println("Points: " + pupil.getPoints());
            System.out.println("----------------------------");
        }
    }

    public void showStudentDataByUniversityAndPoints(String university, int points) {
        System.out.println("Student Data from " + university + " with more than " + points + " points:");
        for (Student student : students) {
            if (student.getUniversity().equals(university) && student.getPoints() > points) {
                System.out.println("Name: " + student.getName());
                System.out.println("EGN: " + student.getEgn());
                System.out.println("Faculty: " + student.getFaculty());
                System.out.println("Specialization: " + student.getSpecialization());
                System.out.println("Points: " + student.getPoints());
                System.out.println("----------------------------");
            }
        }
    }

    public List<Pupil> getPupilsByCity(String city) {
        List<Pupil> pupilsByCity = new ArrayList<Pupil>();
        for (Pupil pupil : pupils) {
            if (pupil.getCity().equals(city)) {
                pupilsByCity.add(pupil);
            }
        }
        return pupilsByCity;
    }

    public void removePupilByGrade(String grade) {
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getGrade().equals(grade)) {
                pupils.remove(i);
                i--;
            }
        }
    }

    public void removeStudentByUniversity(String university) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUniversity().equals(university)) {
                students.remove(i);
                i--;
            }
        }
    }

    public List<Object> getParticipantsByPoints(int points) {
        List<Object> participants = new ArrayList<>();
        for (Student student : students) {
            if (student.getPoints() > points) {
                participants.add(student);
            }
        }
        for (Pupil pupil : pupils) {
            if (pupil.getPoints()) {
                participants.add(pupil);
            }
        }
        return participants;
    }

    public void getStudentsByUniversityAndPoints(String university, int points) {
    }

    public void addPupil(String name, String egn, String school, String grade, int points) {
    }

    public void showData() {
    }

    public void addStudent(String name, String egn, String university, String faculty, String specialty, int points) {

    }
}

class Student {
    private String name;
    private String egn;
    private String university;
    private String faculty;
    private String specialization;
    private int points;

    public Student(String name, String egn, String university, String faculty, String specialization, int points) {
        this.name = name;
        this.egn = egn;
        this.university = university;
        this.faculty = faculty;
        this.specialization = specialization;
        this.points = points;
    }

    public Student(String name, String egn) {
        this.name = "";
        this.egn = "";
        this.university = university;
        this.faculty = faculty;
        this.specialization = specialization;
        this.points = points;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("EGN: " + egn);
        System.out.println("University: " + university);
        System.out.println("Faculty: " + faculty);
        System.out.println("Specialization: " + specialization);
        System.out.println("Points: " + points);
    }
}
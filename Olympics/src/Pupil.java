class Pupil {
    private String name;
    private String egn;
    private String school;
    private String grade;
    private int points;

    public Pupil(String name, String egn, String school, String grade, int points) {
        this.name = name;
        this.egn = egn;
        this.school = school;
        this.grade = grade;
        this.points = points;
    }

    public Pupil(String name, String egn) {
        this.name = name;
        this.egn = egn;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void displayData() {
    }

    public boolean getPoints() {
        return Boolean.parseBoolean(null);
    }

    public String getGrade() {
        return null;
    }

    public Object getCity() {
        return null;
    }

    public class pupil {
        private String name;
        private String egn;
        private String school;
        private String grade;
        private int points;

        public pupil(String name, String egn, String school, String grade, int points) {
            this.name = name;
            this.egn = egn;
            this.school = school;
            this.grade = grade;
            this.points = points;
        }

        public pupil(String name, String egn) {
            this.name = name;
            this.egn = egn;
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

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
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
            System.out.println("School: " + school);
            System.out.println("Grade: " + grade);
            System.out.println("Points: " + points);
        }
    }
}

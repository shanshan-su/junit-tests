import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double)sum / grades.size();
    }

    public void updateGrade(int i, int grade) {
        this.getGrades().add(i, grade);
    }

    public void deleteGrade(int grade) {
        ArrayList<Integer> grades = this.getGrades();
        this.getGrades().remove(grades.get(grades.indexOf(grade)));
    }
}

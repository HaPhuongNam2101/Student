import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double [] points;

    private static int idIncrement = 1;

    public Student(String name, String gender, double[] points) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.points = points;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", points=" + Arrays.toString(points) +
                '}';
    }
    public double getAverage() {
        double sum = 0;
        for (double point : points) {
            sum += point;
        }
        return sum / 3;
    }
}

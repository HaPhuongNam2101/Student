import java.util.ArrayList;


public class StudentManager {
    private Student[] listStudents;
    private int size;

    public StudentManager() {
        size = 0;
        listStudents = new Student[100];
    }
    public ArrayList<Student> getStudentsByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getName().contains(name.toLowerCase())) {
                students.add(listStudents[i]);
            }
        }
        return students;
    }
    public double getAverageId() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=listStudents[i].getAverage();
        }
        return sum/size;
    }
    public double getMaxAverage() {
        double max = listStudents[0].getAverage();
        for (int i = 0; i < size; i++) {
            if (listStudents[i].getAverage() > max) {
                max = listStudents[i].getAverage();
            }
        }
        return max;
    }
    public void addStudent(Student student) {
        this.listStudents[size] = student;
        this.size++;
    }
    public void removeStudent(int id) {
        int index = search(id);
        for (int i = index; i < size; i++) {
            listStudents[i] = listStudents[i + 1];
        }
        size--;
    }
    public void editStudent(int id, Student newstudent) {
        int index = search(id);
        listStudents[index] = newstudent;
    }
    public int search(int id){
        for(int i = 0; i < size; i++){
            if(id == listStudents[i].getId()){
                return i;
            }
        }
        return -1;
    }
    public Student searchStudent(int id) {
        for (Student student : listStudents) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public Student[] getListStudents() {
        return listStudents;
    }
    public int getSize() {
        return size;
    }


}

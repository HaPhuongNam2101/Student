public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double[] point1 = {8,5,9};
        Student student = new Student("Linh", "Nữ", point1);
        studentManager.addStudent(student);
        double[] point2 = {7,10,9};
        Student student2 = new Student("Hưng", "Nam", point2);
        studentManager.addStudent(student2);
        double[] point3 = {5,7,10};
        Student student3 = new Student("Như", "Nữ", point3);
        studentManager.addStudent(student3);

        System.out.println("Danh sách sinh viên: ");
        for (int i = 0; i < studentManager.getSize(); i++) {
            System.out.println(studentManager.getListStudents()[i]);
        }
        System.out.println("Sinh viên cần tìm: ");
        System.out.println(studentManager.searchStudent(1));

        studentManager.removeStudent(2);
        System.out.println("Danh sách sinh viên sau khi xóa: ");
        for (int i = 0; i < studentManager.getSize(); i++) {
            System.out.println(studentManager.getListStudents()[i]);
        }

        double[] point4 = {6,5,9};
        Student student4 = new Student("Khoa", "Nam", point4);
        studentManager.editStudent(3,student4);
        System.out.println("Danh sách sinh viên sau sửa: ");
        for (int i = 0; i < studentManager.getSize(); i++) {
            System.out.println(studentManager.getListStudents()[i]);
        }
        System.out.println("Điểm trung bình của lớp là: " + studentManager.getAverageId());
        System.out.println("Điểm trung bình lớn nhất là: " + studentManager.getMaxAverage());
        System.out.println("Danh sách sinh viên có chữ n:");
        for (Student student1 : studentManager.getStudentsByName("n")){
            System.out.println(student1);
        }
    }


}

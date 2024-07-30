public class Main {
    public static void main(String[] args) {

        Student student = new Student("TEJAS", "COG50", "O");

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student, studentView);

        studentController.updateView();

        studentController.setStudentName("TEJASWIN D");
        studentController.setStudentId("COG149");
        studentController.setStudentGrade("A+");

        studentController.updateView();
    }
}
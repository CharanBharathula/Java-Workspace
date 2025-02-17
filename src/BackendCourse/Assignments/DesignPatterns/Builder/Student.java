package BackendCourse.Assignments.DesignPatterns.Builder;


/**
 * Student class with Builder pattern
 * A ;a
 */
public class Student {
    int id;
    String name;
    String email;
    String phone;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.phone = studentBuilder.phone;
    }

    static class StudentBuilder{
        int id;
        String name;
        String email;
        String phone;

        private StudentBuilder(){
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public static StudentBuilder newStudentBuilder(){
        return new StudentBuilder();
    }

    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = Student.newStudentBuilder();
        studentBuilder.setId(1);
        studentBuilder.setName("John Doe");
        studentBuilder.setEmail("john@gmail.com");
        studentBuilder.setPhone("1234567890");

        Student student = studentBuilder.build();

        /*
            or we can create in single statement as below
            Student student = Student.newStudentBuilder().setId(1).setName("John Doe").setEmail("john@gmail.com").setPhone("1234567890").build();
        * */

        System.out.println("Student ID: " + student.id);
    }
}

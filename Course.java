public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrolments;
    boolean isFull;

   

    {
        maxCapacity++;
    }
    String[] enrolledStudents ;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }
//
//    Course(String courseName) {
//        this("Cs", 0);
//    }

    static void setmaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrolments] = studentName;
        enrolments++;

    }
    void unenrollments(String studentName){
        System.out.println("student is removed");
        enrolments--;
    }

}

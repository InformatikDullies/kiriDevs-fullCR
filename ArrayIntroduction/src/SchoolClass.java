public class SchoolClass {
    @SuppressWarnings("FieldMayBeFinal")
    private String[] students;

    /**
     * The constructor for the SchoolClass class.
     * Defines a class with multiple students,
     * based on the given amount.
     *
     * @param numberOfStudents The number of students in the class
     */
    public SchoolClass(int numberOfStudents) {
        this.students = new String[numberOfStudents];
    }

    /**
     * Adds a student to the list of students in the class at the give position
     *
     * @param studentName The name of the student to save
     * @param number      The (1-based) position of the student on the list.
     */
    public void addStudent(String studentName, int number) {
        // List numbers should be 1-based, indices are 0-based
        int index = number - 1;

        // Write student name to array
        this.students[index] = studentName;
    }

    /**
     * Print the list of all the students after filling all the slots completely.
     *
     * @return true when the list was successfully printed, false when not all students where entered yet.
     */
    public boolean printStudentList() {
        // Check if list is printable: Only if all students are filled
        for (String student : this.students) {
            if (student == null) { return false; }
        }

        // No number is null, we are clear
        int number = 1;
        for (String student: this.students) {
            System.out.println(number + ".: " + student);
            number++;
        }
        return true;
    }
}

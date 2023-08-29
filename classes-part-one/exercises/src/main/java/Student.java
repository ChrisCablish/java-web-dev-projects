public class Student (){
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;


        public Student(String name, int studentID, int numberOfCredits, double gpa) {

        }


        // Drop your getters and setters below for the Student class.
        //get name
        public String getName() {
                return this.name
        }
        //set name
        public void setName(String name) {
                this.name = name;
        }

        //get student ID
        public int getStudentId() {
                return this.studentId;
        }

        //set student ID
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        //get num of credits

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        //set num of Credits
        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }



        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}

package lld.PassByValue;


public class Main {
    public static void main(String[] args) {
        /*
         * Demonstrating JAVA's pass by value 
         * 1) updateAge was successful since its a simple assignment operation and 
         *    nothing is being done to the address of memory. We are only accessing it. 
         * 2) using createNewStudentAndUpdate , doesn't work as expected. A new student object is created in memory
         *    but assigning it to student doesnt' do anything to the s1 object. Which means we are not passing the ref.
         *    The new student object created in createNewStudentAndUpdate is only seen within that scope. 
         */
        Student s1= new Student(27, "ishan");
        System.out.println("DEBUG");
        updateAge(s1);
        System.out.println("DEBUG");
        createNewStudentAndUpdate(s1);
        System.out.println("DEBUG");
        
    }

    private static void updateAge(Student student) { // this is pass by value; the value is address of Student object
        student.age = 30;
    }

    private static void createNewStudentAndUpdate(Student student) { // this is pass by value; the value is address of Student object
        student = new Student(31, "name changed");
    }


}
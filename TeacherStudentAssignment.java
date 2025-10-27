class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("--- Student Information ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}

class Teacher extends Person {
    private String department;
    private Course[] courses; // aggregation: Teacher has Courses

    public Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }

    public void displayTeacher() {
        System.out.println("--- Teacher Information ---");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses Handled:");
        for (Course c : courses) {
            System.out.println("    " + c.toString());
        }
    }
}

public class TeacherStudentAssignment {
    public static void main(String[] args) {
        // 1. Example Output for Student
        System.out.println("1. Displaying Student Information");
        Student s = new Student("Ana Santos", 19, "Female", "S1023");
        s.displayStudent();
        System.out.println();

        // 2. Example Output for Student
        System.out.println("2. Displaying Teacher Information");
        Course c1 = new Course("CS101", "Programming Fundamentals");
        Course c2 = new Course("CS102", "Object-Oriented Programming");
        Course[] teacherCourses = { c1, c2 };
        Teacher t = new Teacher("Mr. Dela Cruz", 45, "Male", "Computer Studies", teacherCourses);
        t.displayTeacher();
        System.out.println();

        // 3. Example Output for Course
        System.out.println("3. Displaying the course");
        c1.displayCourse();
    }
}

// Submitted by: Porteza, Moris L. (BSCS-2D)

// AI Model: GPT-5 (ChatGPT)

// Transaction ID: https://chatgpt.com/share/68ff6de8-5b28-8013-989c-42c3a579ae2b

// Text style generated using: https://boldtext.online/
// Text art sourced from: https://emojicombos.com/coffee-text-art
// Line art sourced from: https://emojicombos.com/border

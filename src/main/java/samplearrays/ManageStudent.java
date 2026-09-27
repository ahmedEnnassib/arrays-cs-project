package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student s : students){
            if(s.getAge() > oldest.getAge()){
                oldest = s;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;
        for(Student s : students){
            if(s.getAge() >= 18){count++;}
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sum = 0;
        for(Student s : students){
            sum += s.getGrade();
        }
        return (double) sum / students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s : students){
            if(s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for(int i = 0 ; i < students.length - 1 ; i++){
            for(int j = 0 ; j < students.length - 1 - i ; j++){
                if(students[j].getGrade() < students[j+1].getGrade()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s : students){
            if(s.getGrade() >= 15){
                System.out.println(s.getName() + " ,");
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s : students){
            if(s.getId() == id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i = 0 ; i < students.length ; i++){
            for(int j = 0 ; j < students.length ; j++){
                if(j!= i && students[i].getName().equals(students[j].getName())){
                    return true;
                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] updatedStudents = new Student[students.length + 1];
        for(int i = 0 ; i < students.length;i++){
            updatedStudents[i] = students[i];
        }
        updatedStudents[students.length] = newStudent;
        return updatedStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = {
                new Student(1,"Ahmed"),
                new Student(2,"Anass",19),
                new Student(3,"Hicham",20,16),
                new Student(4,"Samir",21,20),
                new Student(5,"Ahmed",18,10)
        };

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("The oldest student is : " + findOldest(arr));

        // 3) Count adults
        System.out.println("The number of adults is : " + countAdults(arr));

        // 4) Average grade
        System.out.println("The average grade of students is : " + averageGrade(arr));

        // 5) Find by name
        System.out.println("Looking for Ahmed in the list of students :" + findStudentByName(arr,"Ahmed"));

        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function

        System.out.println("\nUpdated id=4? " + updateGrade(arr,4,13));
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        System.out.println("is there any duplicates ? " + hasDuplicateNames(arr));
        // 10) Append new student
        Student[] newArray = appendStudent(arr,new Student(6,"jawad"));
        sortByGradeDesc(newArray);
        System.out.println("The updated array of students :");
        for (Student s : newArray) System.out.println(s);

        System.out.println();
        System.out.println("===let's build the 2D array representation of classrooms ===");
        Student[][] School = {
                {
                    new Student(1,"Ahmed",20,19),
                    new Student(2,"Anass",19,17),
                    new Student(3,"Adam",19,14)
                },{
                    new Student(4,"Mohammed",20,15),
                    new Student(5,"Samir",19,19),
                    new Student(6,"Amine",21,20)
                }
        };
        for(int i = 0 ; i < School.length ; i++){
            System.out.println("--Students of classroom " + (i+1) + " : ");
            for(int j = 0 ; j < School[0].length ; j++){
                System.out.println(School[i][j] + " ,");
            }
        }

        sortByGradeDesc(School[0]);
        System.out.println("The top student of the first classroom is : " + School[0][0]);
        sortByGradeDesc(School[1]);
        System.out.println("The top student of the Second classroom is : " + School[1][0]);
    }
}


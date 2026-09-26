package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourses = new int[registeredCourses.length +  1];
        for(int i = 0 ; i < registeredCourses.length ; i++){
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length ] = 2210;
        System.out.print("The list of updated courses : ");
        for(int i = 0 ; i < updatedCourses.length ; i++){
            System.out.print(updatedCourses[i] + " ");
        }
        System.out.println();
        System.out.println("Checking if the course 2210 exists : ");
        boolean found = false;
        for(int i = 0 ; i < updatedCourses.length ; i++){
            if(updatedCourses[i] == 2210){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

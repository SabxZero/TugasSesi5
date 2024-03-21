public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
    }

    public boolean addCourse(String course) {
        if (numCourses >= MAX_COURSES || course == null)
            return false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course))
                return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                found = true;
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                break;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + getName() + ", address=" + getAddress() + "]";
    }
}

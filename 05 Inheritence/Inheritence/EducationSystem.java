class Course {
    String courseName;
    int duration;


    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }


    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Lectures: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;


    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }


    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee After Discount: $" + getFinalFee());
    }
}

public class EducationSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Introduction to Programming", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development Bootcamp", 12, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Machine Learning", 10, "Coursera", true, 500, 20);

        System.out.println("\nBasic Course Details:");
        basicCourse.displayCourseDetails();

        System.out.println("\nOnline Course Details:");
        onlineCourse.displayCourseDetails();

        System.out.println("\nPaid Online Course Details:");
        paidCourse.displayCourseDetails();
    }
}

package entities;

public class Course {
    private int id;
    private String courseName;
    private double coursePrice;

    public Course(){
        super();
    }

    public Course(int id, String courseName, double coursePrice){
        this.setId(id);
        this.setCourseName(courseName);
        this.setPrice(coursePrice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return coursePrice;
    }

    public void setPrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}

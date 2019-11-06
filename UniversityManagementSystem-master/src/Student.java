public class Student
{
    private String stdName;
    private int stdAge;

    public Student() {
    }

    public Student(String stdName, int stdAge) {
        this.stdName = stdName;
        this.stdAge = stdAge;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }


}

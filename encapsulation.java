package Java_code_from_zero_to_master;

 class Encapsulation {
    private String stdname;
    private int age;
    private long rollno;
    private String course;

    // Constructor
    public Encapsulation(String name, int age, long rollno, String course){
        this.stdname = name;
        this.age = age;
        this.rollno = rollno;
        this.course = course;
    }

    // Getter
    public String getStdname(){
        return stdname;
    }

    // Setter
    public void setStdname(String name){
        this.stdname = name;
    }

    // Optional: You can add getters/setters for other fields as well
    public int getAge() {
        return age;
    }

    public long getRollno() {
        return rollno;
    }

    public String getCourse() {
        return course;
    }
}

package Practice2;

public class Student {
    private String name;
    private int id;
    private int year_of_study;

    public Student(String name, int id, int year_of_study) {
        this.name = name;
        this.id = id;
        this.year_of_study = year_of_study;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear_of_study() {
        return year_of_study;
    }

}
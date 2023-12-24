package models;

public class Students {
    String name;
    int age, grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    int[] marks ;


    public void Result(String name, int age, int []marks, int grade){
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        System.out.println("Result");
        System.out.println("SN\tSubject\tMarks");
        System.out.println("1.\tMaths\t"+marks[0]);
        System.out.println("2.\tEnglish\t"+marks[1]);
        System.out.println("3.\tNepali\t"+marks[2]);

        System.out.println("Total Marks:\t"+ (marks[0]+ marks[1]+ marks[2]));
    }

}
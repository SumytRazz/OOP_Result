import models.Students;

public class Main {
    public static void main(String[] args) {

        Students std1 = new Students();

        std1.setName("Sumit Raj Thakur");
        std1.setAge(18);
        std1.setGrade(12);
        int[] std1_marks = {40, 60, 63};
        std1.setMarks(std1_marks);

        Students std2 = new Students();

        std2.setName("Ram Shrestha");
        std2.setAge(17);
        std2.setGrade(12);
        int[] std2_marks ={50,70,45};
        std2.setMarks(std2_marks);

        Students std3 = new Students();

        std3.setName("Shyam Kumar");
        std3.setAge(17);
        std3.setGrade(12);
        int[] std3_marks ={40,60,50};
        std3.setMarks(std3_marks);

        std1.Result(std1.getName(), std1.getAge(), std1.getMarks(),std1.getGrade());
        std2.Result(std2.getName(), std2.getAge(), std2.getMarks(),std2.getGrade());
        std3.Result(std3.getName(), std3.getAge(), std3.getMarks(),std3.getGrade());
    }
}
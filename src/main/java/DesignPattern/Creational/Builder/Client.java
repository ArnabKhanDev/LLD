package DesignPattern.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        UserExam.UserExamBuilder builder = new UserExam.UserExamBuilder();
        UserExam userExam = builder.setSubject("Math")
                .setMarks(100)
                .build();

        System.out.println(userExam);
    }

}

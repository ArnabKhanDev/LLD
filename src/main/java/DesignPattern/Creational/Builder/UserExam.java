package DesignPattern.Creational.Builder;

public class UserExam {
    private String subject;
    private int marks;

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "UserExam{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }

    private UserExam(UserExamBuilder builder)
    {
        this.subject = builder.subject;
        this.marks = builder.marks;
    }


    public static class UserExamBuilder{
        private String subject;
        private int marks = 98;

        public UserExamBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public UserExamBuilder setMarks(int marks) {
            this.marks = marks;
            return this;
        }

        public UserExam build()
        {
            return new UserExam(this);
        }
    }
}

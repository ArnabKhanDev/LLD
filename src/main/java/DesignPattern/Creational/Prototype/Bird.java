package DesignPattern.Creational.Prototype;

public class Bird implements Cloneable<Bird> {
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bird(){

    }

    public Bird(Bird old){
        this.name = old.name;
        this.color = old.color;
    }


    @Override
    public Bird clone() {
        /*
        This only works for parent class

        Bird bird = new Bird();
        bird.name = this.name;
        bird.color = this.color;
        return bird;

         */

        return new Bird(this);
    }
}

package DesignPattern.Creational.Prototype;

public class Sparraow extends Bird{
    private String sound = "bole jo koyel";

    public void setSound(String sound)
    {
        this.sound = sound;
    }
    public Sparraow(){

    }

    public Sparraow(Sparraow old)
    {
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Bird clone() {
        return new Sparraow(this);
    }
}

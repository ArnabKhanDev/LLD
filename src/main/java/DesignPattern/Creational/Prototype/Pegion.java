package DesignPattern.Creational.Prototype;

public class Pegion extends Bird{
    private int legSize = 4;

    public void setLegSize(int legSize){
        this.legSize = legSize;
    }

    public Pegion(){

    }

    /** copy constructor to set the value of parents attribite **/
    public Pegion(Pegion old)
    {
        super(old);
        this.legSize = old.legSize;
    }


    @Override
    public Bird clone() {

        /*
        This won't work because parents attributes are not copied

        Pegion pegion = new Pegion();
        pegion.legSize = this.legSize*;
         */

        return new Pegion(this);
    }
}

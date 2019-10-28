public class Circle {
    private boolean on;
    private int yVal;

    public boolean returnOnOrOff(){
        return on;
    }

    public int returnYVal(){
        return yVal;
    }

    public void setState(){
        on = !on;
    }

    public void setY(int yVal){
        this.yVal = yVal;
    }

}

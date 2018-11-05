public class MoveablePoint extends Point{
    private float xSpeed = 2;
    private float ySpeed = 2;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }

    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + getxSpeed() + "," + getySpeed() + ")";
    }

    public MoveablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}

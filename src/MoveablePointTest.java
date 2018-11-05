public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setxSpeed(9);
        moveablePoint.setySpeed(8);
        System.out.println(moveablePoint);
        for (float array:moveablePoint.getSpeed()){
            System.out.println(array);
        }

        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2,2,3,3);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}

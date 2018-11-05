public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        for (float array: point.getXY()){
            System.out.println(array);
        }
    }
}

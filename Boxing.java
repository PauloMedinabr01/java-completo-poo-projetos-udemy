public class Boxing {
    public static void main(String[] args) {

        int x = 20;
        Object obj = x; // Integer obj = x;
        int y = (int) obj * 2; // int y = obj * 2;

        System.out.println(obj);
        System.out.println(x);
        System.out.println(y);

    }
}
public class ForEach {
    public static void main(String[] args) throws Exception {

        String[] vect = new String[] { "Esdra", "Paulo", "Julia" };

        for (int i = 0; i < vect.length; i++) {
            System.out.println("------------");
        }

        // for each
        for (String obj : vect) {
            System.out.println(obj);
        }
    }

}

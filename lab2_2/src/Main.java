public class Main {
    public static void main(String[] args) {

            try{
                System.out.println("0");
                throw new RuntimeException("Неперевірена помилка");

            } catch (Exception e) {
                System.out.println("2" + e);
            }
            System.out.println("3");


    }
}
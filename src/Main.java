public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMassIndex = service.calculate (1.65f, 48.5f);
        System.out.println(bodyMassIndex);
    }
}
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.75;
        int weightInKg = 80;
        int index = service.calculate(weightInKg, heightInMeters); // должно получиться 26
        System.out.println(index);
    }
}
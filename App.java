public class App {
    public static void main(String[] args) throws Exception {
        Car porsche = new Car();
        Car toyota = new Car();

        porsche.setModel("Carrera");
        System.out.println("model is " + porsche.getModel());
    }
}

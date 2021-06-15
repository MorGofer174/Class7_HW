public class FactoryTest {
    public static void main(String[] args){
        CarFactory car = new CarFactory();

        Drivable fiat = CarFactory.getCar("Fiat");
        fiat.drive();

        Drivable bmw = CarFactory.getCar("BMW");
        bmw.drive();

        Drivable porche = CarFactory.getCar("Porche");
        porche.drive();

    }
}

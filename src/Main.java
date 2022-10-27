package oop.part2;


public class HomeworkOOP2 {

    public static void main(String[] args){
        Human vladimir = new Human ("Vladimir", "Kazan", 2001, null)
        System.out.println(vladimir);

        Flower rose = new Flower( null, "Netherlands", 35,59f, -1);
        Flower hypsophila = new Flower("Hypsophila", "Turkey", 19.5f, 10);
        Flower pion = new Flower("Pion", "UK", 69.9f, 10);
        Flower chryzantema = new Flower("Chryzantema", "Turkey", 5.0f, 10);

        System.out.println(rose);
        System.out.println(hypsophila);
        Bouquet bouquet = new Bouquet( new Flower[] {rose,rose, pion, hupsophila, chryzantema);
        System.out.println("Bouquet cost:" + bouquet.getCost());
        System.out.println("Bouquet lifespan:" + bouquet.getLifeSpan());

    }
    Car car = new (brand: "Кia", model:"Sportage",
    engineVolume: 2.4f, color: "Red",
    manufacturingYear: 2018, manufactureCountry: "South Korea",
    gearBox: "Automatic", bodyType: "Sedan", regNumber: "A001MH177",
    placesCount: 5, winterTires: true,
            new Car.Key(remoteEngineStart: true, keylessAccess: true),
            new Car.Insurance(LocalDate.now().plusMonths(monthsToAdd: 3),
    cost: 1000.0f, number:"123456789"));

   if(!car.getInsurance().isInsuranceValid()) {
        System.out.println("Страховка просрочена);
    }
}
}
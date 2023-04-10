package JavaR2.interfaceCat;

public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();

        Jaguar jaguar = new Jaguar();
        DomesticCat catty = new DomesticCat();
        Lion lion = new Lion();

        aibolit.healthCat(jaguar);
        aibolit.healthCat(catty);
        aibolit.healthCat(lion);
    }
}

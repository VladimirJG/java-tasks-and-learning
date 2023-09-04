package test.topjava;

/*
задача- сделать амфибию, которую можно подавать в методы drive и flow

 */
public class LifeCodingTwo {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Amfibian amfibian = new Amfibian();
        drive(amfibian);
        flow(amfibian);
        drive(car);
        flow(boat);
    }

    static void drive(Car car) {
        car.drive();
    }

    static void drive(Amfibian amfibian) {
        amfibian.drive();
    }

    static void flow(Amfibian amfibian) {
        amfibian.flow();
    }

    static void flow(Boat boat) {
        boat.flow();
    }

    static class Car implements CarIn {
        @Override
        public void drive() {
            System.out.println("Many code: car drive");
        }
    }

    static class Boat implements FlowIn {
        @Override
        public void flow() {
            System.out.println("Many code: boat flow");
        }
    }

    interface CarIn {
        void drive();
    }

    interface FlowIn {
        void flow();
    }

    static class Amfibian implements CarIn, FlowIn {

        @Override
        public void drive() {
            System.out.println("Amfibian drive");
        }

        @Override
        public void flow() {
            System.out.println("Amfibian flow");
        }
    }
}




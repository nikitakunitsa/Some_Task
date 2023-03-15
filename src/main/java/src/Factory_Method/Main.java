package src.Factory_Method;
/*Реализован патерн абстрактная фабрика*/

interface Production {
    void release();
}

class Car implements Production {

    @Override
    public void release() {
        System.out.println("Выпуск лекого автомобиля ");
    }
}

class Track implements Production {
    @Override
    public void release() {
        System.out.println("Выпуск грузового автомобиля");
    }
}

interface Shop {
    Production create();
}

class CarsShop implements Shop {
    @Override
    public Production create() {
        return new Car();
    }
}

class TrackShop implements Shop {
    @Override
    public Production create() {
        return new Track();
    }
}

public class Main {
    public static void main(String[] args) {
        Shop creator = new CarsShop();
        Production car = creator.create();
        creator = new TrackShop();
        Production truck = creator.create();
        car.release();
        truck.release();
    }
}


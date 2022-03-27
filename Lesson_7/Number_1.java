package homework.Lesson_7;

import java.util.Scanner;

public class Number_1 {
        public static void main(String[] args) throws IOException {
        Passenger passenger = new Passenger();
        Cargo cargo = new Cargo();
        CivilAircraft civilAircraft = new CivilAircraft();
        WarPlane warPlane = new WarPlane();
        try {
            passenger.displayInfo();
            passenger.infoPassenger();
            cargo.displayInfo();
            cargo.infoCargo();
            civilAircraft.displayInfo();
            civilAircraft.infoCivilAircraft();
            warPlane.isCountRocket();
            warPlane.displayInfo();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

abstract class Transport {

    int power = 560;  // мощность(лошадиная сила)
    int maxSpeed = 220; // максимальная скорость(км/ч)
    int weight = 2300;  // масса, кг
    String brand = "BMW";  //марка

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public Transport() {
        this.power = getPower();
        this.maxSpeed = getMaxSpeed();
        this.weight =  getWeight();
        this.brand = getBrand();
    }


    double isPower() {
        double paramPower =getPower()* 0.74;
        return paramPower;
    };

    abstract void displayInfo();
}

// наземный
abstract class GroundTransport extends Transport {
    int countWheel = 4;  // кол-во колес
    double consumption = 12.3; // расход топлива (л/100км)

    public int getCountWheel() {
        return countWheel;
    }
    public double getConsumption() {
        return consumption;
    }

    public GroundTransport() {
        super();
        this.consumption = getConsumption();
        this.countWheel = getCountWheel();
    }

    void displayInfo() {
    }

}

class Passenger extends GroundTransport {

    String type = "Седан"; //Тип кузова
    int countPassengers = 4; //Кол-во пассажиров

    public String getType() {
        return type;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Passenger() {
        super();
        this.type = getType();
        this.countPassengers = getCountPassengers();
    }

    void displayInfo() {
        System.out.printf("1. Автомобиль марки %s, тип кузова %s, кол-во пассажиров %d ,%d колеса, мощность %d лошадиных сил,\n" +
                "максимальная скорость %d км/ч, мощность в киловатах %.2f кв/час, масса %d кг и расход топлива %.2f (л/100км)\n", brand, type, countPassengers, countWheel, power, maxSpeed, isPower(), weight, consumption);
        System.out.println();
    }

    double num;

    double inputInfo() {
        System.out.println("Введите кол-во часов в пути");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        // System.out.println("Часы "+ num);
        return this.num = num;
    }

    double distance;

    double getDistance() {
        // System.out.println("Часы (distance) "+ num);
        distance = maxSpeed * num;
        //  System.out.println("Расстояние " +distance);
        return this.distance = distance;
    }

    double countFuel;

    private double countFuel() {
        countFuel = consumption * distance / 100;
        return this.countFuel = countFuel;
    }

    void infoPassenger() {
        System.out.printf("За время %.2f ч, автомобиль %s\n" +
                "двигаясь с максимальной скоростью %d км/ч\n" +
                "проедет %.2f км и израсходует %.2f литров топлива.\n", inputInfo(), brand, maxSpeed, getDistance(), countFuel());
        System.out.println();
    }
}

class Cargo extends GroundTransport {
    int capacity = 70;//Грузоподъёмность(т)

    public int getCapacity() {
        return capacity;
    }

    public Cargo() {
        super();
        super.weight = 3450;
        super.maxSpeed = 140;
        super.brand = "Mercedes-Benz";
        this.capacity = getCapacity();
    }

    void displayInfo() {
        System.out.printf("2. Грузовой автомобиль марки %s, %d колеса, мощность %d лошадиных сил,\n" +
                "мощность в киловатах %.2f кв/час, максимальная скорость %d км/ч, масса %d кг, расход топлива %.2f (л/100км)\n" +
                "и грузоподъемность %d тонн\n", brand, countWheel, power, isPower(),maxSpeed, weight, consumption, capacity);
        System.out.println();
    }

    double countCargo;

    double inputInfo() {
        System.out.println("Введите кол-во груза для загрузки грузовика");
        Scanner in = new Scanner(System.in);
        double countCargo = in.nextDouble();
        return this.countCargo = countCargo;
    }

    void infoCargo() {
        if (inputInfo() <= capacity) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");
        System.out.println();
    }

}

//воздушный
class AirTransport extends Transport {
    double wingspan = 31.4; // размах крыльев, м
    int minLength = 2000; //минимальная длина взлётно-посадочной полосы для взлёта, м

    public double getWingspan() {
        return wingspan;
    }

    public int getMinLength() {
        return minLength;
    }

    public AirTransport() {
        super();
        this.minLength = getMinLength();
        this.wingspan = getWingspan();
    }

    void displayInfo() {
    }
}

// гражданский самолет
class CivilAircraft extends AirTransport {
    int countPax = 180;
    boolean businessClass = true;

    public int getCountPax() {
        return countPax;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public CivilAircraft() {
        super();
        super.brand = "Airbus A320";
        super.maxSpeed = 890;
        super.weight = 66000;
        this.countPax = getCountPax();
        this.businessClass = getBusinessClass();
    }

    String isBusinessClass () {
        System.out.println("3. Введите наличие бизнес-класса в самолете (true/false)");
        Scanner in = new Scanner(System.in);
        boolean businessClass = in.nextBoolean();

            if (businessClass) {
                return "с бизнес-классом";
            } else {
                return "без бизнес-класса";
            }
    }

    void displayInfo() {
        System.out.printf("\nГражданский самолет марки %s, мощность %d лошадиных сил,\n" +
                "мощность в киловатах %.2f кв/час, максимальная скорость %d км/ч, масса %d кг, размах крыльев %.2f,\n" +
                "минимальная длина взлётно-посадочной полосы для взлёта %d м,\n" +
                "вместимостью %d пассажиров %s", brand, power, isPower(),maxSpeed, weight, wingspan, minLength, countPax, isBusinessClass());
        System.out.println();
    }

    int count;
    void infoCivilAircraft() {
        System.out.println("\nВведите кол-во пассажиров");
        Scanner in = new Scanner(System.in);
        double count = in.nextInt();
        if (count <= countPax) {
            System.out.println("Самолет загружен");
        } else System.out.println("Вам нужен самолет побольше");
        System.out.println();
    }
}

//военный самолет
class WarPlane extends AirTransport {

    boolean catapult;
    int countRocket;

    public boolean getCatapult() {
        return catapult;
    }

    public int getCountRocket() {
        return countRocket;
    }

    public WarPlane() {
        super();
        super.brand = "МиГ-31БСМ";
        super.maxSpeed = 3100;
        super.wingspan = 1.3;
        super.weight = 21820;
        super.minLength=800;
        this.catapult = getCatapult();
        this.countRocket = getCountRocket();
    }

    String isCatapult() {
        System.out.println("Введите наличие системы катапультирования (true/false)");
        Scanner in = new Scanner(System.in);
        boolean catapult = in.nextBoolean();

        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
            return "c системой катапультирования";
        } else {
            System.out.println("У вас нет такой системы");
            return "без системы катапультирования";
        }
    }

    void isCountRocket() {
        System.out.println("4. Введите кол-во ракет");
        Scanner in = new Scanner(System.in);
        int countRocket = in.nextInt();

        if (countRocket > 0)
            System.out.println("Ракета пошла...");
        else
            System.out.println("Боеприпасы отсутствуют");

    }

    void displayInfo() {

        System.out.printf("\nВоенный самолет марки %s, мощность %d лошадиных сил,\n" +
                "мощность в киловатах %.2f кв/час, максимальная скорость %d км/ч, масса %d кг, размах крыльев %.2f,\n" +
                "минимальная длина взлётно-посадочной полосы для взлёта %d м\n" +
                "%s и кол-вом ракет %d", brand, power, isPower(),maxSpeed, weight, wingspan, minLength, isCatapult(), getCountRocket());
        System.out.println();
    }
    }

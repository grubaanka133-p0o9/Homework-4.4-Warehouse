public class Warehouse {
    public static void main(String[] args) {
        Device device1 = new Device("QE65Q7FAM", "Samsung", "TV", 9499.99); //code, producer, type, price
        Device device2 = new Device("P9 Lite", "Huawei", "Smatyphone"); //code, producer, type
        Device device3 = new Device("Playstation 4", "Sony", "Smatyphone", 1899.99); //code, producer, type, price

        String allDevices = device1.getInfo(device1) + "\n" + device2.getInfo(device2) + "\n" + device3.getInfo(device3);
        System.out.println(allDevices);
    }
}


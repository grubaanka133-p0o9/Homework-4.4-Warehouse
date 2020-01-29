public class Device {
    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;

    }
    public Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }
    public String getInfo(Device device){
        return "Kod: " + device.code + ", Producent: "+device.producer + ", Typ: " +device.type + ", Cena: " + device.price;
    }

}

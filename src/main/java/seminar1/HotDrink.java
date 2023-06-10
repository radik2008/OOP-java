package seminar1;

public class HotDrink extends Product{
    private double volume;
    private int temperature;

    public HotDrink(String kind, Double price, Long id, double volume, int temperature) {
        super(kind, price, id);
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(){
        this("Test", 99.0, 100L, 0,0);
    }

    @Override
    public String toString() {
        return super.toString() + " Объем " + getVolume() + " Температура " + getTemperature();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    private Writeble fileHandler;
    public void save(){
        fileHandler.write("....text.txt");
    }

    public void setFileHandler(Writeble fileHandler) {
        this.fileHandler = fileHandler;
    }
}

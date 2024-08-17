public class Computer {
    private String motherboard;
    private Processor processor;
    private int ram;

    private int hd;
    private String monitor;
    private String printer;

    public Computer(String motherboard, Processor processor, int ram) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "Computer [Motherboard: " + motherboard + ", " + processor +
                ", RAM: " + ram + "GB, HD: " + hd + "GB, Monitor: " + monitor +
                ", Printer: " + printer + "]";
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 8);
        Computer computer = new Computer("ASUS", processor, 16);
        computer.setHd(512);
        computer.setMonitor("Dell");
        computer.setPrinter("HP");

        System.out.println(computer);
    }
}
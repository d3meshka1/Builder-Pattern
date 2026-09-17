public class Computer{
    private final String cpu;
    private final String gpu;
    private final String ram;

    Computer(String cpu, String gpu, String ram){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer[cpu=" + cpu + ", ram=" + ram +
                ", gpu=" + gpu +"]";
    }



}
public class ComputerObjectBuilder implements ComputerBuilder{

    private String cpu;
    private String gpu;
    private String ram;


    public ComputerBuilder setCPU(String cpu){
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder setGPU(String gpu){
        this.gpu = gpu;
        return this;
    }
    public ComputerBuilder setRAM(String ram){
        this.ram = ram;
        return this;
    }

    public Computer getResult(){
        if(cpu == null || ram == null){
            throw new IllegalStateException("mistake");
        }
        return new Computer(cpu,gpu,ram);

    }
}

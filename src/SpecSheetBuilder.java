public class SpecSheetBuilder implements ComputerBuilder{
    private final StringBuilder sb = new StringBuilder("=== PC Spec Sheet ===\n");

    public SpecSheetBuilder setCPU(String cpu){
        sb.append("CPU: ").append(cpu).append("\n");
        return this;
    }
    public SpecSheetBuilder setGPU(String gpu){
        sb.append("GPU: ").append(gpu).append("\n");
        return this;
    }
    public SpecSheetBuilder setRAM(String ram){
        sb.append("RAM: ").append(ram).append("\n");
        return this;
    }

    public String getResult(){
        return sb.toString();
    }

}

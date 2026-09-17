public class ComputerDirector{
    public void makeGamingPC(ComputerBuilder builder){
        builder.setGPU("RTX 4080").setCPU("intel i9").setRAM("32 GB");
    }
    public void makeOfficePC(ComputerBuilder builder){
        builder.setGPU("Integrated").setCPU("intel i5").setRAM("16 GB");
    }

}
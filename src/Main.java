public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        ComputerObjectBuilder objBuilder = new ComputerObjectBuilder();
        director.makeGamingPC(objBuilder);
        Computer gamingPc = objBuilder.getResult();
        System.out.println(gamingPc);

        SpecSheetBuilder sheetBuilder = new SpecSheetBuilder();
        director.makeGamingPC(sheetBuilder);
        String specSheet = sheetBuilder.getResult();
        System.out.println(specSheet);

        ComputerObjectBuilder officeObjBuilder = new ComputerObjectBuilder();
        director.makeOfficePC(officeObjBuilder);
        System.out.println(officeObjBuilder.getResult());

        SpecSheetBuilder officeSheetBuilder = new SpecSheetBuilder();
        director.makeOfficePC(officeSheetBuilder);
        System.out.println(officeSheetBuilder.getResult());
    }
}
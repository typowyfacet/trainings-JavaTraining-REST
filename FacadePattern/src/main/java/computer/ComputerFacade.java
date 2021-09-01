package computer;

public class ComputerFacade {

    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public String startComputer(){
    cpu.freeze();
    String data = hardDrive.read();
    String address = memory.load(data);
    cpu.jump(address);
    cpu.execute();
    cpu.freeze();

    return "Computer works!";
    }
}

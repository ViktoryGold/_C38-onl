package Lesson_8.task_star_star;

public class PersonalComputer {
    private final PCBlock pcBlock;
    private final BaseBoard baseBoard;
    private final Processor processor;
    private final RAM ram;
    private final Cooler cooler;
    private final HDD hdd;
    private final VGA vga;
    private Object Unsafe;

    public PersonalComputer(PCBlock pcBlock, BaseBoard baseBoard, Processor processor,
                            RAM ram, Cooler cooler, HDD hdd, VGA vga){
        this.pcBlock = pcBlock;
        this.baseBoard = baseBoard;
        this.processor = processor;
        this.ram = ram;
        this.cooler = cooler;
        this.hdd = hdd;
        this.vga = vga;
    }

    @Override
    public String toString() {
        return "PC:\n" +
                "\tBlock:\n" + this.pcBlock + "\n" +
                "\tBaseBoard:\n" + this.baseBoard + "\n" +
                "\tProcessor:\n" + this.processor + "\n" +
                "\tRAM:\n" + this.ram + "\n" +
                "\tCooler:\n" + this.cooler + "\n" +
                "\tHDD:\n" + this.hdd + "\n" +
                "\tVGA:\n" + this.vga + "\n" +
                "\t" + this.getClass().getSimpleName() +
                "is being stored in a heap:\n" +
                "Способ №_1:" + "\n" + "\t\t" +
                System.identityHashCode(this) +
                "\nСпособ №_2:" + "\n" + "\t\t" +
                Integer.toHexString(hashCode()) +
                "\nСпособ №_3:" + "\n" + "\t\t" +
                getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this));
    }
}

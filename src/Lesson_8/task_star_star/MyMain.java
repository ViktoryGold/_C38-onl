package Lesson_8.task_star_star;

public class MyMain {
    public static void main(String[] args){
        composePC();
    }

    public static void composePC(){
        PersonalComputer myPC = new PersonalComputer(
                new PCBlock("JK Asus972", "Black", 10),
                new BaseBoard("KL-981T1", "Asus", 6),
                new Processor("i7", 8, 3.77),
                new RAM("Jh-1", "DDR5", 32),
                new Cooler("R-100", 220,156),
                new HDD("Seagate", "SSD", 1),
                new VGA("Omicron-9000", "HJ-1", 1000,
                        new String[]{"SLOT-1 EMPTY", "SLOT-2 EMPTY", "SLOT-3 INJECTED RAM 16GB"})
        );
        System.out.println(myPC);
        System.out.println("Способ №_4:\n(опасный)\n" + new AddressGetter());
        System.out.println("Способ №_5:\n(предпочтительный)\n" + new DebuggableClass());
    }
}

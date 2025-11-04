package Lesson_8.HW_task_1;

public class Rabbit extends Animal{

    @Override
    public void voice() {
        System.out.println("Кролик издаёт урчащие и шипящие звуки, " +
                "а ещё скрежещет зубами");
    }

    @Override
    public void eat(String food) {
        if (food == "Grass"){
            System.out.println("Кролик вегетарианец, это его любимое блюдо!");
        } else if (food == "Meat"){
            System.out.println("Мясо подойдёт только хищникам");
        } else {
            System.out.println("Разве что только понюхать можно будет");
        }
    }
}

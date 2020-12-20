package gun50.tasks.task2;

import day50.tasks.task2.food.*;

public class Kitchen {

    public void cook(Food food) {
        if(food instanceof Kebab) {
            Kebab kebab = (Kebab) food;
            kebab.marinade();
            kebab.grill();
            System.out.println("Kebab is ready");
        } else if(food instanceof Beshbarmak) {
            ((Beshbarmak) food).boil();
            System.out.println("Beshbarmak is ready");
        } else if(food instanceof KarniYarik) {
            KarniYarik karniYarik = (KarniYarik) food;
            karniYarik.fry();
            karniYarik.bake();
            System.out.println("KarniYarik is ready");
        } else if(food instanceof Maklube) {
            Maklube maklube = (Maklube) food;
            maklube.fry();
            maklube.design();
            maklube.boil();
            System.out.println("Maklube is ready");
        }

        food.print();
    }
}

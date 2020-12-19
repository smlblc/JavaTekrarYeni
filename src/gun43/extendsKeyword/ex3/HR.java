package gun43.extendsKeyword.ex3;

public class HR {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Daulet", 100_000, 1);
        System.out.println(employee1);


        SDET employee2 = new SDET("Fetih", 120_000, 1, 50_000);
        System.out.println(employee2);
    }
}

package gun43.extendsKeyword.ex3;

public class SDET extends Employee {
    private double bonus;

    public SDET(String name, double salary, double coef, double bonus) {
        super(name, salary, coef); //super=Parent(Employee) // super() in contructorini kullanacagimiz zaman ona oncelik veriyoruz.
        this.bonus = bonus; // this=Child(DSET)

    }

    @Override
    public double calculateSalary() {
        return salary * coef + bonus;
    }


}

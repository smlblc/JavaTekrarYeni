package gun32.nonAccessModifier.finalModifier;

public class Registration {

    public void register(Person person) {
        System.out.println("Name1: " + person.name);
        person.name = "Max";
        System.out.println("Name2: " + person.name);

        System.out.println("Fingerprint code1: " + person.fingerprintCode);
        // after making 'fingerprintCode' final, you can't change it
        //person.fingerprintCode = 0004;
        System.out.println("Fingerprint code2: " + person.fingerprintCode);
    }


    public static void main(String[] args) {
        Registration reg = new Registration();

        Person person1 = new Person("John", 010234);
        reg.register(person1);
    }

}

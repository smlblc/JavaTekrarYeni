package gun32.nonAccessModifier.finalModifier;

public class Person {
    public String name;
    public final int fingerprintCode;

    public Person(String name, int fingerprint) {
        this.name = name;
        this.fingerprintCode = fingerprint;
    }
}

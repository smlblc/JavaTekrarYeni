package gun30.tasks.task1;

public class Bank {
    String name;
    int serial;
    boolean trustworthiness;

    // First
    public Bank() {
        name = "Unknown";
    }

    // Second
    public Bank(String name, int serial) {
        this.name = name;
        this.serial = serial;
    }

    // Third
    public Bank(String name, int serial, boolean trustworthiness) {
        this(name, serial); // 2. contractor`a refer ediyor. Bank(name,serial)
        this.trustworthiness = trustworthiness;
    }

    // Four, please, don't do it like this -- Bu sekilde YAPMAYALIM.
    public Bank(int serial) {
        this("Bank four", serial, false);
    }

    public static Bank nonTrustworthyBank(String name, int serial) {
        return new Bank(name, serial);
    }

    public String toString() {
        return "\n---------------------------" +
                "\nName: " + this.name +
                "\nSerial: " + this.serial +
                "\nTrustworthiness: " + this.trustworthiness +
                "\n---------------------------"
                ;

    }
}

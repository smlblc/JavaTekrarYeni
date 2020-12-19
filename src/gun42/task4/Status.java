package gun42.task4;

public enum Status {
    ACTIVE(10), INACTIVE(2), PRAYLIST(100);
    private int number;

    Status(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

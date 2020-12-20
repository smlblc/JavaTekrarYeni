package gun51.tasks.task1.device.utils;

public enum Career {
    T_MOBILE("T Mobile"), VERIZON("Verizon"), AT_T("AT&T"),
    SPRINT("Sprint"), UNLOCKED("Unlocked");


    private String name;

    Career(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

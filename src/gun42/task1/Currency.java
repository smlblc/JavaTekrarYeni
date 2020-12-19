package gun42.task1;

public enum Currency {
    USD("$"), EUR("€");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {

        return symbol;
    }

}

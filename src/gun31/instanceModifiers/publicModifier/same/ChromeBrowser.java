package gun31.instanceModifiers.publicModifier.same;

public class ChromeBrowser {

    public static void main(String[] args) {
        SearchEngine google = new SearchEngine("Google");
        System.out.println("search engine1: " + google);

        google.name = "Alphabet";
        System.out.println("search engine2: " + google);
    }
}

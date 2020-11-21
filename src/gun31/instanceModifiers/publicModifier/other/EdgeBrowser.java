package gun31.instanceModifiers.publicModifier.other;

import gun31.instanceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {

    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine("Bink");
        System.out.println("search engine1: " + searchEngine);

        searchEngine.name = "Microsoft";
        System.out.println("search engine2: " + searchEngine);
    }
}

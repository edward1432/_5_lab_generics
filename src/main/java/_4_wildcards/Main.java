package _4_wildcards;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Grandpa> grandpas = List.of(
                new Grandpa("Chistopher"),
                new Grandpa("Theodore"),
                new Grandpa("Rudolph")
        );

        List<Father> fathers = List.of(
                new Father("Max"),
                new Father("Chistopher"),
                new Father("Andrew")
        );

        List<Child> children = List.of(
                new Child("Henry"),
                new Child("Owen"),
                new Child("Noah")
        );

        List<String> names = List.of("Max", "Rudolph");

        WildcardsExample wildEx = new WildcardsExample();
        //      we can pass all 3 lists from the same hierarchy
        wildEx.printNames_allFamily(grandpas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);
        //      but not, e.g. a list of Strings (compiler error)
        //      wildEx.printNames_allFamily(names);

        //      we can pass only 2 lists from the same hierarchy
        //      compiler error
        //      wildEx.printNames_fathersAndChildrenOnly(grampas);
        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);

        //      compiler error
        //      wildEx.printNames_grampasAndFathersOnly(children);
        wildEx.printNames_grandpasAndFathersOnly(grandpas);
        wildEx.printNames_grandpasAndFathersOnly(fathers);
    }
}

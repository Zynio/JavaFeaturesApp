package helpers;

public class CustomSetKey {

    public String name;

    public CustomSetKey(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((CustomSetKey) o).name);
    }

    @Override
    public int hashCode() {
        //tutaj definuje sie inwidualny hash ktory ma byc unikalny dla kazdego obiektu,
        // jezeli taki samhashcode bedza mialy te same obiekty to kolekcia Set
        // uzna ze to ten sam obiekt i go nadpisze.
        return name.hashCode();
    }
}

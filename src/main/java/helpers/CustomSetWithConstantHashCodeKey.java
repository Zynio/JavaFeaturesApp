package helpers;

public class CustomSetWithConstantHashCodeKey extends CustomSetKey {

    public CustomSetWithConstantHashCodeKey(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 6;
    }
}

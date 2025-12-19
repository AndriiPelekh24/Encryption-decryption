package encryptdecrypt.types;

public enum ENCRYPTION_TYPE {
    SHIFT("shift"),
    UNICODE("unicode");

    private final String value;

    ENCRYPTION_TYPE(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ENCRYPTION_TYPE fromString(String text) {
        for (ENCRYPTION_TYPE type : ENCRYPTION_TYPE.values()) {
            if (type.value.equalsIgnoreCase(text)) {
                return type;
            }
        }
        return SHIFT;
    }

    @Override
    public String toString() {
        return value;
    }
}
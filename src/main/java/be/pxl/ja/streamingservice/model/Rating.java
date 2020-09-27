package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private int age;

    Rating() {}

    Rating(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

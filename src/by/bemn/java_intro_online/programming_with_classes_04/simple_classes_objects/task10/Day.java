package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task10;

public enum Day {
    MONDAY ("Mon"),
    TUESDAY ("Tue"),
    WEDNESDAY ("Wed"),
    THURSDAY ("Thu"),
    FRIDAY ("Fri"),
    SATURDAY ("Sat"),
    SUNDAY ("Sun");

    private String name;
    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

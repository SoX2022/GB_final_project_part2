package project;

public class Classes {
    private static long classId;
    protected long id;
    protected String className;

    static {
        classId = 1L;
    }

    protected Classes (String name) {
        this.id = classId++;
        this.className = name;
    }
}

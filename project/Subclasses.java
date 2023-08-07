package project;

public class Subclasses {
    private static long subclassId;
    protected long id;
    protected long classId;
    protected String subclassName;

    static {
        subclassId = 1L;
    }

    protected Subclasses (long classId, String name) {
        this.id = subclassId++;
        this.classId = classId;
        this.subclassName = name;
    }
}

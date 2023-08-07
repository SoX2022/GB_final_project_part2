package project;

public class Commands {
    private static long commandId;
    protected long id;
    protected String commandName;

    static {
        commandId = 1L;
    }

    protected Commands (String name) {
        this.id = commandId++;
        this.commandName = name;
    }
}

public class Event extends Task {
<<<<<<< HEAD
    protected String from;
    protected String to;
    private static String LINE = "-----------------------------------------\n";
=======
    protected DateTime start;
    protected DateTime end;
>>>>>>> branch-Level-8
    public Event(String description, String from, String to) {
        super(description);
        start = new DateTime(from);
        end = new DateTime(to);
    }

    public static Event eventParse(String input) {
        int indexFrom = input.indexOf("/from");
        int indexTo = input.indexOf("/to");
        if (input.length() < 1) {
            new PotatoException(LINE + "Bruh you wanna do air or something?\n" + LINE);
            return null;
        } else {
            return new Event(input.substring(0, indexFrom),
                    input.substring(indexFrom + 6, indexTo),
                    input.substring(indexTo + 4));
        }
    }

    public static Event eventSavedParse(String input) {
        int indexFrom = input.indexOf("from:");
        int indexTo = input.indexOf("to:");
        if (input.length() < 1) {
            new PotatoException(LINE + "Bruh you wanna do air or something?\n" + LINE);
            return null;
        } else {
            return new Event(input.substring(0, indexFrom),
                    input.substring(indexFrom + 6, indexTo),
                    input.substring(indexTo + 4));
        }
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + start.getDate() + "to: " + end.getDate() + ")";
    }
}

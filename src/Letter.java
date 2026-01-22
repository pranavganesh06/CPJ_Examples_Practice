public class Letter {
    private String from;
    private String to;
    private String body;

    // Constructor
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        body = "";
    }

    // Add a line to the body
    public void addLine(String line) {
        body += line + "\n";
    }

    // Return the full formatted letter
    public String getText() {
        return "Dear " + to + ":\n\n"
                + body + "\n"
                + "Sincerely,\n\n"
                + from;
    }
}

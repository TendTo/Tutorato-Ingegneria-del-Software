public class HardwareIssueHandler extends AbstractIssueHandler {
    @Override
    public void handleIssue(Issue issue) {
        if (300 <= issue.errorCode() && issue.errorCode() <= 399)
            System.out.println("Rilevato problema hardware!");
        else
            super.handleIssue(issue);
    }
}

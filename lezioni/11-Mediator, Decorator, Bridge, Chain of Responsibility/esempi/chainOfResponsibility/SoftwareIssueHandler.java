public class SoftwareIssueHandler extends AbstractIssueHandler {
    @Override
    public void handleIssue(Issue issue) {
        if (issue.errorDescription().contains("smart_edu"))
            System.out.println("Rilevato problema software!");
        else
            super.handleIssue(issue);
    }
}

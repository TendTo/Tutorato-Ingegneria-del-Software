public abstract class AbstractIssueHandler implements IssueHandler {
    protected IssueHandler successor;

    public void setSuccessor(IssueHandler successor) {
        this.successor = successor;
    }

    @Override
    public void handleIssue(Issue issue) {
        if (successor != null)
            successor.handleIssue(issue);
        else
            System.out.println("FAIL");
    }
}

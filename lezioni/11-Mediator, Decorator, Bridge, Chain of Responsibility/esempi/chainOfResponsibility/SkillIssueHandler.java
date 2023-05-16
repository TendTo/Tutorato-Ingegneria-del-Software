public class SkillIssueHandler extends AbstractIssueHandler {
    @Override
    public void handleIssue(Issue issue) {
        if (issue.skillLevel() < 100)
            System.out.println("Skill issue?");
        else
            super.handleIssue(issue);
    }
}

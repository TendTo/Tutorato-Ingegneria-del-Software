public class Main {
    public static void main(String[] args) {
        Issue issue = new Issue("Non mi funziona smart_edu", 340, 0);

        HardwareIssueHandler hardwareIssueHandler = new HardwareIssueHandler();
        SkillIssueHandler skillIssueHandler = new SkillIssueHandler();
        SoftwareIssueHandler softwareIssueHandler = new SoftwareIssueHandler();
        
        hardwareIssueHandler.setSuccessor(softwareIssueHandler);
        softwareIssueHandler.setSuccessor(skillIssueHandler);

        hardwareIssueHandler.handleIssue(issue);
    }
}

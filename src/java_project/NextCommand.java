package java_project;

public class NextCommand implements Command {
    private LogInScreen loginScreen;

    // Default constructor
    public NextCommand() {
        
    }

    // Parameterized constructor
    public NextCommand(LogInScreen loginScreen) {
        this.loginScreen = loginScreen;
    }

    @Override
    public void execute() {
        loginScreen.btnNextActionPerformed(null);
    }
}

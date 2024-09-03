package java_project;

public class LoginCommand implements Command {
    private LogInScreen loginScreen;

    // Default constructor
    public LoginCommand() {
        // You can initialize any necessary variables here
    }

    // Parameterized constructor
    public LoginCommand(LogInScreen loginScreen) {
        this.loginScreen = loginScreen;
    }

    @Override
    public void execute() {
        loginScreen.btnLoginActionPerformed(null);
    }
}

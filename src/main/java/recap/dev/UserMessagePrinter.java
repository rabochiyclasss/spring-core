package recap.dev;

public class UserMessagePrinter {

    private UserMessageService userMessageService;

    public UserMessagePrinter(UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        String message;

        message = userMessageService.createMessage(name);
        System.out.println(message);
    }
}

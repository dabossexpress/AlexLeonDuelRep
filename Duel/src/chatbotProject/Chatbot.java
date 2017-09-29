package chatbotProject;

public class Chatbot {
	private String userName; 
	private Topic alex;
	private boolean chatting;

	public Chatbot() {
		alex = new ChatbotAlex();
		userName = "unknown user";
		chatting = true;
	}
public void startTalking() {
	ChatbotMain.print("Welcome to our chatbot! What is your name?");
	userName = ChatbotMain.getInput();
	chatting = true;
	while(chatting) {
		ChatbotMain.print("What do you want to talk about?");
		String response = chatbotMain.getInput();
		if(alex.isTriggered(response)) {
			chatting = false;
			alex.startChatting(response);
		}else {
			ChatbotMain.print("I'm sorry. I don't understand.")
		}
	}
}

}
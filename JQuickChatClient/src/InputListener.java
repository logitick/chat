import java.io.BufferedReader;
import java.io.IOException;
import java.util.TimerTask;


public class InputListener extends TimerTask {
	private JQuickChatClient client;
	private JQuickChatClientController controller;
	public InputListener(JQuickChatClient client, JQuickChatClientController controller) {
		this.client = client;
		this.controller = controller;
	}
	@Override
	public void run() {
		BufferedReader input = client.getInput();
		String fromServer = null;
		try {
			fromServer = input.readLine();
			if (fromServer != null)
				controller.appendToView(fromServer);
			
		} catch (IOException e) {
			
		}
			
		
	}

}

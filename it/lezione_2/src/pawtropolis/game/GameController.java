package pawtropolis.game;

import pawtropolis.game.domain.Player;
import pawtropolis.map.domain.Room;
import pawtropolis.game.console.InputController;

public class GameController {

	private Room entry;
	private Player player;

	public GameController(Room entry, Player player) {
		this.entry = entry;
		this.player = player;
	}

	public void runGame() {
		Room currentRoom = entry;
		boolean gameEnded = false;

		while(!gameEnded) {
			String input;
			System.out.println("Where are you going to go?");
			System.out.print(">");
			input = InputController.readString();

			/*
			* Inserire qui la gestione degli altri comandi
			*/


			if (input.equals("exit")) {
				gameEnded = true;
			}
		}
	}
}

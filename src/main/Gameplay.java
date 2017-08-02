package main;

public class Gameplay {
	private boolean player;
	private boolean finished;
	private char[][] map;

	public Gameplay() {
		setPlayer(true);
		setFinished(false);
		initMap();
	}

	public void initMap() {
		map = new char[3][3];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = '0';
			}
		}
	}

	public boolean isOccuped(int x, int y) {
		if (map[x][y] != '0') {
			return true;
		}
		return false;
	}

	public void setValue(int x, int y) {
		if (player) {
			map[x][y] = 'O';
		} else {
			map[x][y] = 'X';
		}
	}

	public boolean checkMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] != '0') {
					if (i == 0 && j == 0) {
						if (map[0][0] == map[1][0] && map[1][0] == map[2][0]) {
							return true;
						}
						if (map[0][0] == map[0][1] && map[0][1] == map[0][2]) {
							return true;
						}
						if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) {
							return true;
						}
					}
					if (i == 0 && j == 1) {
						if (map[0][1] == map[1][1] && map[1][1] == map[2][1]) {
							return true;
						}
						if (map[0][0] == map[0][1] && map[0][1] == map[0][2]) {
							return true;
						}
					}
					if (i == 0 && j == 2) {
						if (map[0][0] == map[0][1] && map[0][1] == map[0][2]) {
							return true;
						}
						if (map[0][2] == map[1][2] && map[1][2] == map[2][2]) {
							return true;
						}
						if (map[0][2] == map[1][1] && map[1][1] == map[2][0]) {
							return true;
						}
					}
					if (i == 1 && j == 0) {
						if (map[0][0] == map[1][0] && map[1][0] == map[2][0]) {
							return true;
						}
						if (map[1][0] == map[1][1] && map[1][1] == map[1][2]) {
							return true;
						}
					}
					if (i == 1 && j == 1) {
						if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) {
							return true;
						}
						if (map[0][2] == map[1][1] && map[1][1] == map[2][0]) {
							return true;
						}
						if (map[0][1] == map[1][1] && map[1][1] == map[2][1]) {
							return true;
						}
						if (map[1][0] == map[1][1] && map[1][1] == map[1][2]) {
							return true;
						}
					}
					if (i == 1 && j == 2) {
						if (map[0][2] == map[1][2] && map[1][2] == map[2][2]) {
							return true;
						}
						if (map[1][0] == map[1][1] && map[1][1] == map[1][2]) {
							return true;
						}
					}
					if (i == 2 && j == 0) {
						if (map[0][0] == map[1][0] && map[1][0] == map[2][0]) {
							return true;
						}
						if (map[0][2] == map[1][1] && map[1][1] == map[2][0]) {
							return true;
						}
						if (map[2][0] == map[2][1] && map[2][1] == map[2][2]) {
							return true;
						}
					}
					if (i == 2 && j == 1) {
						if (map[0][1] == map[1][1] && map[1][1] == map[2][1]) {
							return true;
						}
						if (map[2][0] == map[2][1] && map[2][1] == map[2][2]) {
							return true;
						}
					}
					if (i == 2 && j == 2) {
						if (map[0][0] == map[1][1] && map[1][1] == map[2][2]) {
							return true;
						}
						if (map[0][2] == map[1][2] && map[1][2] == map[2][2]) {
							return true;
						}
						if (map[2][0] == map[2][1] && map[2][1] == map[2][2]) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean isPlayer() {
		return player;
	}

	public void setPlayer(boolean player) {
		this.player = player;
	}

	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}

package hotel;

public class Room {
	
	private boolean isUsing;
	
	public Room() {
		
	}

	public Room(boolean isUsing) {
		this.isUsing = isUsing;
	}

	public boolean isUsing() {
		return isUsing;
	}

	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}

}

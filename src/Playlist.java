import java.awt.Component;
import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlistArray = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	// ask tech dudes about which data structure would be best for this
	public void setPlaybackSpeed(float slowSpeed) {
		for (IComponent song: playlistArray) {
			song.setPlaybackSpeed(slowSpeed);
		}
	}
	

	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}

	public void play() {
		// TODO Auto-generated method stub
		for(IComponent allsongs: playlistArray) {
			allsongs.play();
		}
	}

	public void add(IComponent component) {
		// TODO Auto-generated method stub
		playlistArray.add(component);
	}
	public void remove(Playlist playlist) {
		
	}

	// Your code goes here!

}
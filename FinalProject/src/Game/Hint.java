/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;
import java.util.ArrayList;

public class Hint {
	private ArrayList<String> hints;
	private String returnedHint;
	
	public Hint() {
		hints = new ArrayList<String>();
		returnedHint = "";
	}
	
	public String pickRandomHint() {
		return null;
	}
	public ArrayList<String> getHints() {
		return hints;
	}
	public void setHints(ArrayList<String> hints) {
		this.hints = hints;
	}
	public String getReturnedHint() {
		return returnedHint;
	}

	public void setReturnedHint(String returnedHint) {
		this.returnedHint = returnedHint;
	}

	//list of 10+ hints
	
}

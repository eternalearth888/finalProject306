/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;


public class Game {
	private Launcher launcher; 
	private Target target;
	public Game() {
		launcher = new Launcher();
		target = new Target();
	}
	public Launcher getLauncher() {
		return launcher;
	}
	public void setLauncher(Launcher launcher) {
		this.launcher = launcher;
	}
	public Target getTarget() {
		return target;
	}
	public void setTarget(Target target) {
		this.target = target;
	}
}

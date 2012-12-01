/** Nicola Hetrick
 * Kira Combs
 * Maria Deslis
 * Anastasia Shpurik 
 */
package Game;

import javax.swing.JFrame;


public class Game {
	private Launcher launcher; 
	private Target target;
	private Scenery scenery;
	public Game() {
		launcher = new Launcher();
		target = new Target();
		scenery = new Scenery();
	}
	public void reset() {
		launcher.reset();
		target.reset();
	}
	public void launcherReset() {
		launcher.reset();
	}
	public Scenery getScenery() {
		return scenery;
	}
	public void setScenery(Scenery scenery) {
		this.scenery = scenery;
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

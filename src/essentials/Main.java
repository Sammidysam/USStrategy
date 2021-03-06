package essentials;

import java.io.File;

import org.lwjgl.LWJGLUtil;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;

import states.Secede;

public class Main implements Game {
	private static boolean fullscreen;
	private Drawer drawer = new Drawer();
	private Updater updater = new Updater();
	private Keyboard keyboard = new Keyboard();
	private Mouse mouse = new Mouse();
	public static void main(String[] args){
		System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
		System.setProperty("net.java.games.input.librarypath", System.getProperty("org.lwjgl.librarypath"));
		fullscreen = Option.getRawOption(0) != "" ? Boolean.parseBoolean(Option.getRawOption(0)) : false;
		System.out.println(fullscreen);
		try {
			AppGameContainer agc = new AppGameContainer(new Main());
			if(fullscreen)
				agc.setDisplayMode(agc.getScreenWidth(), agc.getScreenHeight(), true);
			else
				agc.setDisplayMode((int)(agc.getScreenWidth() * 0.8), (int)(agc.getScreenHeight() * 0.8), false);
			agc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	public boolean closeRequested() {
		return !fullscreen;
	}
	public String getTitle() {
		return "USStrategy";
	}
	public void init(GameContainer gc) throws SlickException {
		gc.setTargetFrameRate(60);
		gc.setMaximumLogicUpdateInterval(50);
		gc.getInput().addKeyListener((KeyListener) keyboard);
		gc.getInput().addMouseListener((MouseListener) mouse);
		Secede secede = new Secede();
		drawer.setSeceded(secede.getLeavingState().getName());
	}
	public void render(GameContainer gc, Graphics g) throws SlickException {
		drawer.draw(gc, g);
	}
	public void update(GameContainer gc, int j) throws SlickException {
		updater.update(gc, j);
		if(updater.getLag())
			drawer.setLag(true);
		else
			drawer.setLag(false);
	}
}

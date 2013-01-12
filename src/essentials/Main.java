package essentials;

import java.io.File;

import org.lwjgl.LWJGLUtil;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Main implements Game {
	public static boolean fullscreen = false;
	public boolean requestClose = false;
	public static void main(String[] args){
		System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
		System.setProperty("net.java.games.input.librarypath", System.getProperty("org.lwjgl.librarypath"));
		try {
			AppGameContainer agc = new AppGameContainer(new Main());
			if(fullscreen)
				agc.setDisplayMode(agc.getScreenWidth(), agc.getScreenHeight(), true);
			if(!fullscreen)
				agc.setDisplayMode((int)(agc.getScreenWidth() * 0.8), (int)(agc.getScreenHeight() * 0.8), false);
			agc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	public boolean closeRequested() {
		return !fullscreen;
//		for whatever reason true just lets pressing x = close.  Thus, while fullscreen = false it should be true so that you can press X on non-fullscreen
	}
	public String getTitle() {
		return "USStrategy";
	}
	public void init(GameContainer gc) throws SlickException {
		gc.setTargetFrameRate(60);
	}
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("WOrking", 0, 0);
	}
	public void update(GameContainer gc, int j) throws SlickException {
		Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_ESCAPE))
			gc.exit();
	}
}

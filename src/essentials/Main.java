package essentials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.lwjgl.LWJGLUtil;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Main implements Game {
	private static boolean fullscreen;
	private Drawer drawer = new Drawer();
	public static void main(String[] args){
		System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
		System.setProperty("net.java.games.input.librarypath", System.getProperty("org.lwjgl.librarypath"));
		try {
			Scanner scanner = new Scanner(new File(System.getProperty("user.dir"), "Options.ini"));
			scanner.nextLine();
			fullscreen = Boolean.parseBoolean(scanner.nextLine());
			System.out.println(fullscreen);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
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
	}
	public String getTitle() {
		return "USStrategy";
	}
	public void init(GameContainer gc) throws SlickException {
		gc.setTargetFrameRate(60);
		gc.setMaximumLogicUpdateInterval(50);
//		Minecraft updates 20 times per second, so let's do that here
	}
	public void render(GameContainer gc, Graphics g) throws SlickException {
		drawer.draw(gc, g);
	}
	public void update(GameContainer gc, int j) throws SlickException {
		Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_ESCAPE))
			gc.exit();
//		if(j > 18)
//			System.out.println("Can't keep up!");
	}
}

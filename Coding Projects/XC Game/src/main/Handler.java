package main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	LinkedList<GameObject> gameObjects = new LinkedList<GameObject>();
	
	public void render(Graphics g) {
		for(int i = 0; i < gameObjects.size(); i++) gameObjects.get(i).render(g);
	}

	public void add(GameObject gameObject) {
		gameObjects.add(gameObject);
	}
	
	public void remove(GameObject gameObject) {
		gameObjects.remove(gameObject);
	}
}

package com.tankgame.Screen;

import java.io.BufferedReader;
import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Map {

	public char map[][];
	
	public Map(int x, int y) {
		map = new char[x][y];
	}
	
	public boolean initMap(String map){
		FileHandle file = Gdx.files.internal("map/"+map);
		boolean thereIs = file.exists();
		if(thereIs)
			try {
				readStream(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return thereIs;
	}
	
	private void readStream(FileHandle file) throws IOException{
		BufferedReader br = new BufferedReader(file.reader());
		String line;
		int y=0;
		for(int i=0; i<8; i++)
			br.readLine();
		while((line = br.readLine())!=null){
			for(int x=0; x<line.length(); x++)
				map[x][y] = line.charAt(x);
			y++;
		}
		
	}	
}
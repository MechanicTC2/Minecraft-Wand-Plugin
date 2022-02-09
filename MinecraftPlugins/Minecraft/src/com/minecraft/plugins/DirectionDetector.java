package com.minecraft.plugins;

import org.bukkit.Location;

public class DirectionDetector extends OtherStuff {
	public String DirectionDectector(Location x1, Location x2) {
		String Direction = "";
        int x = (int)x2.getX()-(int)x1.getX();
        int y = (int)x2.getY()-(int)x1.getY();
        int z = (int)x2.getZ()-(int)x1.getZ();
        if (Math.abs(x) > Math.abs(y) && Math.abs(x) > Math.abs(z)) {
        	if (x < 0) {
                Direction = "East";
            }
            if (x > 0) {
                Direction = "West";
            }
        }
        else if(Math.abs(y) > Math.abs(z) && Math.abs(y) > Math.abs(x)) {
            if (y < 0) {
                Direction = "Down";
            }
            else if (y > 0) {
                Direction = "Up";
            }
        }
        else if (Math.abs(z) > Math.abs(y) && Math.abs(z) > Math.abs(x)) {
            if (z < 0) {
                Direction = "South";
            }
            else if (z > 0) {
                Direction = "North";
            }
        }
        return Direction;
    }
}

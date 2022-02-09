package com.nathan.fps;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

public class OtherStuff {
	
	HashMap <String, String> playerLives = new HashMap <String, String>();
	HashMap <String, String> playerInteracts = new HashMap <String, String>();
	HashMap <String, String> names = new HashMap<String, String>();
	ArrayList <String> playernames = new ArrayList<String>();
	String lives = "5";
	int interacts = 0;
	String coins = "100";
	String team = "";
	Boolean flash_drive = true;
	int ammo = 200;
	String targetfile = "";
	
	Location ArenaA = new Location(Bukkit.getWorld("world"), 1108, 70, 1019);
	Location ArenaB = new Location(Bukkit.getWorld("world"), 1097, 73, 1012);
	Location ArenaPortal = new Location(Bukkit.getWorld("world"), 476, 72, 364);
	Location ArenaPortal2 = new Location(Bukkit.getWorld("world"), 479, 75, 364);
	Location OutsideArenaPortal = new Location(Bukkit.getWorld("world"), 478, 72, 362);
	Location InsideArena = new Location(Bukkit.getWorld("world"), 1106, 70, 1014);
	Location ArenaReturnToSpawn = new Location (Bukkit.getWorld("world"), 1099, 69, 1017);
	
	Location ParkourA = new Location(Bukkit.getWorld("world"), 677, 65, 205);
	Location ParkourB = new Location(Bukkit.getWorld("world"), 688, 73, 215);
	Location ParkourPlatformA = new Location(Bukkit.getWorld("world"), 685, 66, 207);
	Location ParkourPlatformB = new Location(Bukkit.getWorld("world"), 685, 67, 207);
	Location ParkourPlatformC = new Location(Bukkit.getWorld("world"), 682, 67, 207);
	Location ParkourPlatformD = new Location(Bukkit.getWorld("world"), 682, 68, 207);
	Location ParkourPlatformE = new Location(Bukkit.getWorld("world"), 679, 68, 209);
	Location ParkourPlatformF = new Location(Bukkit.getWorld("world"), 679, 69, 209);
	Location ParkourPlatformG = new Location(Bukkit.getWorld("world"), 679, 69, 213);
	Location ParkourPlatformH = new Location(Bukkit.getWorld("world"), 679, 70, 213);
	Location ParkourPlatformFinishA = new Location(Bukkit.getWorld("world"), 683, 70, 213);
	Location ParkourPlatformFinishB = new Location(Bukkit.getWorld("world"), 683, 71, 213);
	Location ParkourReturnToSpawn = new Location(Bukkit.getWorld("world"), 684, 71, 213);
	Location ParkourPortal = new Location(Bukkit.getWorld("world"), 465, 63, 357);
	Location ParkourPortal2 = new Location(Bukkit.getWorld("world"), 465, 68, 360);
	Location InsideParkour = new Location(Bukkit.getWorld("world"), 686, 66, 207);
	Location OutsideParkourPortal = new Location(Bukkit.getWorld("world"), 467, 62, 358);
	Location Label = new Location(Bukkit.getWorld("world"), 465, 67, 359);
	
	Location World = new Location(Bukkit.getWorld("world"), -29999984, 0, -29999984);
	Location World2 = new Location(Bukkit.getWorld("world"), 29999984, 255, 29999984);
	
	Location Stairs1 = new Location(Bukkit.getWorld("world"), 471, 105, 771);
	Location Stairs2 = new Location(Bukkit.getWorld("world"), 471, 114, 753);
	Location StairsSurrounding1 = new Location(Bukkit.getWorld("world"), 474, 114, 757);
	Location StairsSurrounding2 = new Location(Bukkit.getWorld("world"), 468, 105, 771);
	Location StairsA = new Location(Bukkit.getWorld("world"), 472, 106, 757);
	Location StairsB = new Location(Bukkit.getWorld("world"), 473, 107, 771);
	Location StairsPlatformA = new Location(Bukkit.getWorld("world"), 472, 105, 770);
	Location StairsPlatformB = new Location(Bukkit.getWorld("world"), 473, 105, 769);
	
	Location LavaPit1 = new Location(Bukkit.getWorld("world"), 389, 91, 743);
	Location LavaPit2 = new Location(Bukkit.getWorld("world"), 380, 93, 733);
	Location Lava1 = new Location(Bukkit.getWorld("world"), 388, 92, 742);
	Location Lava2 = new Location(Bukkit.getWorld("world"), 381, 93, 734);
	Location ReturnToSpawnL1 = new Location(Bukkit.getWorld("world"), 391, 80, 738);
	Location ReturnToSpawnL2 = ReturnToSpawnL1;
	
	Location BoxHead1 = new Location(Bukkit.getWorld("world"), 90, 110, 765);
	Location BoxHead2 = new Location(Bukkit.getWorld("world"), 91, 111, 766);
	Location Reset1 = new Location(Bukkit.getWorld("world"), 112, 96, 771);
	Location Reset2 = new Location(Bukkit.getWorld("world"), 70, 120, 750);
	
	Location ArenaPlayer1 = new Location(Bukkit.getWorld("world"), 0, 200, 0);
	Location ArenaPlayer2 = new Location(Bukkit.getWorld("world"), 20, 210, 20);
	Location ArenaPlayer3 = new Location(Bukkit.getWorld("world"), 1, 201, 1);
	Location ArenaPlayer4 = new Location(Bukkit.getWorld("world"), 19, 209, 19);
	
	Cuboid ArenaPortalLocation = new Cuboid(ArenaPortal, ArenaPortal2);
	Cuboid ArenaLocation = new Cuboid(ArenaA, ArenaB);
	
	Cuboid ParkourLocation = new Cuboid(ParkourA, ParkourB);
	Cuboid ParkourPlatform1 = new Cuboid(ParkourPlatformA, ParkourPlatformB);
	Cuboid ParkourPlatform2 = new Cuboid(ParkourPlatformC, ParkourPlatformD);
	Cuboid ParkourPlatform3 = new Cuboid(ParkourPlatformE, ParkourPlatformF);
	Cuboid ParkourPlatform4 = new Cuboid(ParkourPlatformG, ParkourPlatformH);
	Cuboid ParkourPlatformFinish = new Cuboid(ParkourPlatformFinishA, ParkourPlatformFinishB);
	Cuboid ParkourPortalLocation = new Cuboid(ParkourPortal, ParkourPortal2);
	Cuboid Stairs = new Cuboid(Stairs1, Stairs2);
	Cuboid StairsSurrounding = new Cuboid(StairsSurrounding1, StairsSurrounding2);
	Cuboid StairsArea = new Cuboid(StairsA, StairsB);
	Cuboid StairsPlatform = new Cuboid(StairsPlatformA, StairsPlatformB);
	Cuboid WorldLoc = new Cuboid(World, World2);
	
	Cuboid LavaPit = new Cuboid(LavaPit1, LavaPit2);
	Cuboid Lava = new Cuboid(Lava1, Lava2);
	Cuboid ReturnToSpawnL = new Cuboid(ReturnToSpawnL1, ReturnToSpawnL2);
	
	Cuboid BoxHead = new Cuboid(BoxHead1, BoxHead2);
	Cuboid ResetBox = new Cuboid(Reset1, Reset2);
	
	Cuboid ArenaPlayer = new Cuboid(ArenaPlayer1, ArenaPlayer2);
	Cuboid ArenaInside = new Cuboid(ArenaPlayer3, ArenaPlayer4);
		
	public ItemStack createShortCircuit() {
		
		ItemStack item = new ItemStack(Material.SKELETON_SKULL);
		GameProfile profile = new GameProfile(UUID.randomUUID(),null);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Short Circuit");
		List <String> lore = new ArrayList<>();
		lore.add("�8Level 5 Robot Arm");
		lore.add("�1No reload necessary.");
		lore.add("�4Per shot: -5 ammo.");
		lore.add("�4 Uses metal for ammo.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 100, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		profile.getProperties().put("textures", new Property("textures","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTViZWM3NmQ2NWE4NjhhNWJlNTE3M2QzYjllMTc3NWI1NDA0NmY2MjAzNWMxNTUyNDQwZWRlOTk3M2E5MGUxIn19fQ="));
	       Field field;
	       try {
	           field = meta.getClass().getDeclaredField("profile");
	           field.setAccessible(true);
	           field.set(meta, profile);
	       } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException x) {
	           x.printStackTrace();

	       }
	       
		item.setItemMeta(meta);
		return item;
	}
	
	public ItemStack createMagicCompass() {
		
		ItemStack item = new ItemStack(Material.COMPASS);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Directional Compass");
		meta.addEnchant(Enchantment.DURABILITY, 100, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}
	
	public static String DirectionDectector(Location x1, Location x2) {
        
		String Direction = "";
        int x = (int)x2.getX()-(int)x1.getX();
        int y = (int)x2.getY()-(int)x1.getY();
        int z = (int)x2.getZ()-(int)x1.getZ();
        
        if (Math.abs(x) > Math.abs(y) && Math.abs(x) > Math.abs(z)) {
            
        	if (x < 0) {
                Direction = "South";
            }
        	
            if (x > 0) {
                Direction = "North";
            }
        }
        //UP AND DOWN
        else if(Math.abs(y) > Math.abs(z) && Math.abs(y) > Math.abs(x)) {
            if (y < 0) {
                Direction = "Down";
            }
            else if (y > 0) {
                Direction = "Up";
            }
        }
        //EAST AND WEST
        else if (Math.abs(z) > Math.abs(y) && Math.abs(z) > Math.abs(x)) {
            if (z < 0) {
                Direction = "West";
            }
            else if (z > 0) {
                Direction = "East";
            }
        }
        return Direction;
    }

	public static Cuboid create(Location x1, Location x2) {
		
		Cuboid name = new Cuboid(x1, x2);
		
		return name;
	}
	
	public static Location create( int x, int y, int z) {
		
		Location name = new Location(Bukkit.getWorld("world"), x, y, z);
		
		return name;
	}
	
	public static void printMap(Map map) {
	    Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + ", " + pair.getValue());
	        it.remove();
	    }
	}
	
	/*public static ItemStack create(Enchantment bruh) {
		ItemStack item = new ItemStack(Material.COMPASS);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("§6Overpowered Weapon");
		meta.addEnchant(bruh, 100, true);
		meta.addEnchant(bruh, 0, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}*/
	
	/*public static String printHashmap(Map h, String keyname, String valuename) {
		
		for (String s : h.keySet()) {
			String a = keyname + ": " + s + " " + valuename + ": "+ h.get(s);
			return a;
		}
	}*/
	
	public void createFile(String path) {
		
		try {
		      File txt = new File(path);
		      
		      if (txt.createNewFile()) {
		        System.out.println("File created: " + txt.getName());
		      } 
		      
		      else {
		        System.out.println("File already exists.");
		      }
		}
		
		catch (IOException e) {
		     System.out.println("An error occurred.");
		     e.printStackTrace();
		}
	}

	public void writeToFile(String targetFile, String txt) {
		
		try {
	    	  FileWriter filewriter = new FileWriter(targetFile, true);
	    	  
	    	  filewriter.write(txt + "\n");
	    	  
	    	  filewriter.close();
	      }
	      
	      catch (IOException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	      }
	}

	public void writeToFile(String targetFile, HashMap<String, String> hashmap) {
		
		try {
	    	  FileWriter filewriter = new FileWriter(targetFile, false);
	    	  
	    	  filewriter.write(hashmap + "\n");
	    	  
	    	  filewriter.close();
	      }
	      
	      catch (IOException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	      }
	}
	
	public void readFile(String targetFile) {
		
		try {
	    	  File file = new File(targetFile);
	    	  
	    	  Scanner reader = new Scanner(file);
	         
	    	  while (reader.hasNextLine()) {
	            
	    		  String data = reader.nextLine();
	    		  int splitter = data.indexOf("=");
	    		  
	    		  playerLives.put(data.substring(1, splitter), data.substring(splitter + 1, data.length() - 1));
	    		  
	    		  for (String key : playerLives.keySet()) {
	    			  
	    			  coins  = playerLives.get(key).substring(playerLives.get(key).indexOf(",") + 1, playerLives.get(key).indexOf(";"));
	    			  lives = playerLives.get(key).substring(0, playerLives.get(key).indexOf(","));
	    			  team = playerLives.get(key).substring(playerLives.get(key).indexOf(";") + 1);
				      System.out.println("Name: " + key + " | Lives: " + lives + " | Coins: " + coins + " | Team: " + team);
				      
				}
	          }
	    	  
	    	  reader.close();
	      }
	      
	      catch (IOException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	      }
	}
}
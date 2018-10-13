//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
               String meow=   JOptionPane.showInputDialog(null," How many Cats do u have?????");
		// 2. Convert their answer into an int
               int meow_int=Integer.parseInt(meow);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
               
      if (meow_int>=3) { 
    	  JOptionPane.showMessageDialog(null," U r a CRAZY CAT LADY !!!!!!!!" );
      }
      else if (meow_int>0) {
    	   playVideo("https://i.ytimg.com/an_webp/rNSnfXl1ZjU/mqdefault_6s.webp?du=3000&sqp=CLnLiN4F&rs=AOn4CLC0kdSasD0sO7N6EX3elJeNoDMxhw");
      }
      else {
         playVideo("https://i.ytimg.com/an_webp/W_juM14WHNQ/mqdefault_6s.webp?du=3000&sqp=CNjXiN4F&rs=AOn4CLDJN8FRPacSz15bA-TVlswf37k-Ew");    	  
      }
        		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
                 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.sound.sampled.AudioInputStream;
import java.applet.AudioClip;


public class Song 
{
	JFrame frame;
	JButton btn,btn2;
	
	String[] choics = { "win.wav","lost.wav" }; 
	
	URL file1 = getClass().getResource(choics[0]); 
	URL file2 = getClass().getResource(choics[1]); 
	
	AudioClip soundWin = java.applet.Applet.newAudioClip(file1);
	AudioClip soundLost = java.applet.Applet.newAudioClip(file2);
	
	public void winVoice()
	{
		
		   soundWin.play();
	  }
	public void lostVoice(){
		   soundLost.play();
	  }
	
	public Song() 
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		btn = new JButton("Play");
		btn2 = new JButton("Play2");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
				
				winVoice();
				
				
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				lostVoice();
				
			}
		});
		
		frame.add(btn);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new Song();
	}

}	

 
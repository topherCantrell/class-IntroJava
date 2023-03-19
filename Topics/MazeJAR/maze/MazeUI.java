package maze;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class renders a Maze as a Swing UI. Use the static factory method
 * to create a maze and a GUI window that draws it. Then just use the
 * Maze object.
 */
public class MazeUI extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    
    Maze maze;
    
    private List<BufferedImage> images = new ArrayList<BufferedImage>();
    
    /**
     * This static method creates a new new Maze object and a GUI to view it.
     * @return the Maze object
     */
    public static Maze getMazeWithGUI() {
    	JFrame jf = new JFrame("Maze");
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        Maze maze = new Maze();
                
        System.out.println(maze);
        try {
			 MazeUI mp = new MazeUI(maze);
			jf.setContentPane(mp);
	        jf.setVisible(true);
	        jf.pack();     
	        return maze;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
        
    }
        
    private MazeUI(Maze maze) throws IOException {
        super.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.WHITE);
        this.maze = maze;
        maze.uiUpdater = this;
        
        images.add(loadImage("blank.png")); 
        images.add(loadImage("wall.jpg")); 
        images.add(loadImage("Exit.jpg"));        
        images.add(loadImage("win.png")); 
        
        images.add(loadImage("up.png"));  
        images.add(loadImage("up-ccw.png"));
        images.add(loadImage("up-cw.png"));
        images.add(loadImage("up-move.png"));
        images.add(loadImage("up-block.png"));
        
        images.add(loadImage("right.png"));  
        images.add(loadImage("right-ccw.png"));
        images.add(loadImage("right-cw.png"));
        images.add(loadImage("right-move.png"));
        images.add(loadImage("right-block.png"));
        
        images.add(loadImage("down.png"));  
        images.add(loadImage("down-ccw.png"));
        images.add(loadImage("down-cw.png"));
        images.add(loadImage("down-move.png"));
        images.add(loadImage("down-block.png"));
        
        images.add(loadImage("left.png"));  
        images.add(loadImage("left-ccw.png"));
        images.add(loadImage("left-cw.png"));
        images.add(loadImage("left-move.png"));
        images.add(loadImage("left-block.png"));           
        
    }
    
    private BufferedImage loadImage(String name) throws IOException {
        //return ImageIO.read(new File("images/"+name));
        return ImageIO.read(ClassLoader.getSystemResource("images/"+name));
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		super.updateUI();		
	}        
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int x=0;x<10;++x) {
			for(int y=0;y<10;++y) {
			    int v = maze.cells[y][x];
				g.drawImage(images.get(v), x*50, y*50, null);
			}
		}
	}

}

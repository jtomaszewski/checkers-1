import javax.swing.JFrame;

public class CheckersWindow extends JFrame
{

	private static final long serialVersionUID = -6494085506802879161L;
	private final GamePanel gamePanel;

	public CheckersWindow()
	{
		gamePanel = new GamePanel(new Board());
		setContentPane(gamePanel);
		setResizable(false);
		pack();

	}

	
}

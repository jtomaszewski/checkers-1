import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.UIManager;

public class Main
{

	public static void main(String[] args)
	{

		CheckersWindow window = new CheckersWindow();

		window.addWindowListener(new WindowAdapter()
		{

			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		window.setVisible(true);

	}
}

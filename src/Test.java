
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 实现透明窗体
 * @author Administrator
 *
 */
public final class Test extends JFrame {

	JPanel jp;

	Image Background;
	Point p0;
	Point p1;

	public Test() {
		jp = new JPanel();
		this.getContentPane().add(jp);
		// 获取整个屏幕图像
		try {
			Robot r = new Robot();
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension dm = tk.getScreenSize();
			Background = r.createScreenCapture(new Rectangle(0, 0, (int) dm
					.getWidth(), (int) dm.getHeight()));

			System.out.println(Background);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setSize(600, 600);
//      this.setUndecorated(true); //这句要不注释掉，就啥都看不到了
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		p0 = this.getLocationOnScreen();
		System.out.println(p0);
		p1 = new Point(-p0.x, -p0.y);
		g.drawImage(Background, p1.x, p1.y, null);
		repaint();
	}

	public static void main(String[] args) {
		new Test();
	}
}
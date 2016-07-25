import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class info implements Serializable {
	private String title,annotation;
	private JLabel image;
	private ImageIcon icon;
	
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public JLabel getImage() {
		return image;
	}
	public void setImage(JLabel image) {
		this.image = image;
	}
}

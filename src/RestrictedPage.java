import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RestrictedPage extends JFrame {
    public RestrictedPage() {
        setTitle("Restricted Page");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.decode("#f0f0f0")); // Set background color

        // Load your image
        ImageIcon imageIcon = new ImageIcon("src/assets/istockphoto-1327597055-612x612.jpg");
        // Set image size
        Image scaledImage = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledIcon);

        JLabel titleLabel = new JLabel("Welcome to the restricted page!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(imageLabel, BorderLayout.CENTER); // Add image to the panel
        panel.add(titleLabel, BorderLayout.SOUTH); // Add title below the image

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RestrictedPage();
    }
}

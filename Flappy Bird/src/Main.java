import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int canvasWidth = 360;
        int canvasHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
//        frame.setVisible(true);
        frame.setSize(canvasWidth, canvasHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
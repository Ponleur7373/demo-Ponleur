import javax.swing.JFrame;

class Main extends JFrame{
    public Main(){
        setTitle("Example");
        setLayout(null);
        setSize(500,300);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
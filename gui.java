// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class gui extends JFrame {
   public gui() {
      this.setTitle("Example");
      this.setLayout(new BorderLayout());
      this.setSize(500, 300);
      this.setResizable(false);
      JButton var1 = new JButton("Enter Name ");
      this.add(var1, "Center");
      this.setVisible(true);
   }

   public static void main(String[] var0) {
      new gui();
   }
}

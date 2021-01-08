package Project1;
import java.awt.*;
import javax.swing.*;
public class SwingMe extends JFrame{
    public static void main(String[] args) {
        new SwingMe();
    }
    public SwingMe(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        this.setSize(400,400);
        this.setTitle("swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


//        this.setLocationRelativeTo(null);  // 중앙에 출력

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos,yPos);    //사용자 지정 위치

        // 텍스트 출력
        JPanel jp = new JPanel();
        JLabel lb1 = new JLabel("tell me");
        lb1.setText("new text");  // 텍스트 설정
        lb1.setToolTipText("nothing"); // 툴팁 생성
        jp.add(lb1);
        this.add(jp);

        JButton jb = new JButton("send");  //초기값
        jb.setBorderPainted(false);  // 테두리
        jb.setContentAreaFilled(false); //배경
        jb.setText("new button");   //텍스트 수정가능
        jb.setToolTipText(" button ");
        jp.add(jb);

        JTextField jt = new JTextField("Type here",15);
        jt.setColumns(10);   //크기 재설정
        jp.add(jt);

        JTextArea ja = new JTextArea(15,20);
        ja.setText("test area test area test area test area test area test area test area test area\n");
        ja.setLineWrap(true);  //줄바꿈. false일때는 옆으로 길어짐
        ja.setWrapStyleWord(true);
        int linecnt = ja.getLineCount();
        ja.append(" number of lines: "+linecnt);
        JScrollPane sp = new JScrollPane(ja,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jp.add(sp);

        this.setVisible(true);
        jt.requestFocus();   //입력창 텍스트 드래그상태
    }
}

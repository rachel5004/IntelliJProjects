/*
-실행시 현재 날짜에 해당하는 달력을 표시합니다.
-<, >, <<, >>을 클릭하여 월, 년 단위로 이동할 수 있습니다.
-Today버튼을 누르면 오늘로 이동합니다.
-날짜버튼을 클릭하면 해당 날짜에 메모를 기록할수 있습니다.
-메모글짜 밑에 D-Day가 표시됩니다.
-메모는 저장할 수 있습니다. MemoData 폴더를 생성하여 해당날짜의 YYYYMMDD.txt로 저장됩니다.
 (예 2015년 4월 22일 -> 20150422.txt)
- 오른쪽 윗부분에 현재 시간이 실시간으로 표시됩니다.

memo - sc.next()
 */


package Project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Calendar;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class CalenderMemo extends JFrame{
    static String[] weeks = {"일","월","화","수","목","금","토"};
    static int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        new CalenderMemo();
    }
    public CalenderMemo(){

        setTitle("메모 달력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);  // 중앙에 출력

        Container c = getContentPane();
        c.setLayout(new BorderLayout(5,5));
//        c.setBackground(Color.lightGray);

        Calender cal = new Calender();
        c.add(cal, BorderLayout.WEST);
        Memo m = new Memo();
        c.add(m, BorderLayout.EAST);


        setVisible(true);
    }
    class Calender extends JPanel{
        //today = jbutton
        //nowdate = jlabel
        // << , >> =jbutton
        // 년,월 = jlabel
        // week = jbutton(border area false)
        JPanel topPane = new JPanel();
        JButton[] bt = new JButton[35]; //today, 년월이동4, 요일날짜 35

        JButton today = new JButton("Today");
        JButton yrbf = new JButton("<<");
        JButton mbf = new JButton("<");
        JButton maf = new JButton(">");
        JButton yraf = new JButton(">>");

        JLabel nowdate = new JLabel("nowdate");

        JLabel yearlb = new JLabel("년");
        JLabel monthlb = new JLabel("월");

        // weeks

        JPanel centerPanel = new JPanel(new BorderLayout());
        JPanel weekPanel = new JPanel(new GridLayout(1,7));
        JPanel datePanel = new JPanel(new GridLayout(0,7));

        Calender now;
        int year, month, date;
        public Calender(){

            now = Calender.getInstance();



            for (int i=0;i<weeks.length;i++){
                bt[i] = new JButton(weeks[i]);
            }
            for (int i=0;i<11;i++) //~요일
                add(bt[i]);

            setLayout(new GridLayout(6,7));
            setBackground(Color.black);


        }




    }
    class Memo extends JPanel{
        //"memo", today jlabel
        //textarea
        //save del clear jbutt


    }
}

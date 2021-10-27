package minHong.chapter7.ex;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. 클래스 정의
// 2. 객체 생성
public class Ch7_51 {

	public static void main(String[] args) {
		Button b = new Button("Strart");
		b.addActionListener(new ActionListener() { // 클래스의 정의와 객체 생성을 동시에
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!");
			}
		});
	}

}

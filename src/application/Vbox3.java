package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class Vbox3 extends VBox {

	Label label1;
	Label label2;
	Label label3;
	Koma koma;

	public Vbox3(Koma koma) {
		this.setPadding(new javafx.geometry.Insets(10,10,10,10));
		this.setSpacing(10);
		this.koma = koma;

		label1=new Label(this.koma.getKamoku());
		label2=new Label(this.koma.getTeacher());
		label3=new Label(this.koma.getKyoushitu());
		
		label1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		label1.setAlignment(Pos.CENTER);
		label2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		label2.setAlignment(Pos.CENTER);
		label3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		label3.setAlignment(Pos.CENTER);
		
		this.getChildren().add(label1);
		this.getChildren().add(label2);
		this.getChildren().add(label3);


	}



}

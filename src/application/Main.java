package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

	Label label;
	Vbox3 vb3 ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setWidth(500);
		primaryStage.setHeight(350);

		label = new Label("ドラッグしてね");
		label.setPrefSize(100, 50);

		//枠線の設定
		label.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
		label.setAlignment(Pos.CENTER);

		Koma koma = new Koma(1,"高橋",22,"C言語",212,"ITシステム館212教室");

		vb3 = new Vbox3(koma);
//		vb.setPadding(new javafx.geometry.Insets(10,10,10,10));
//		vb.setSpacing(10);
//	    vb.getChildren().add(new Label("A"));
//	    vb.getChildren().add(new Label("B"));
//	    vb.getChildren().add(new Label("C"));


		//label.setOnMouseDragged( event -> buttonDragged(event) );
//	    vb3.setOnMouseDragged(event -> buttonDragged(event));

		AnchorPane root = new AnchorPane();
		AnchorPane.setTopAnchor(vb3, 20.0);
		AnchorPane.setLeftAnchor(vb3, 20.0);
		//root.getChildren().addAll(label);
		root.getChildren().addAll(vb3);

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

//	private void buttonDragged(MouseEvent event){
//
//		//取得した座標にアンカーを再設定する。
//		AnchorPane.setTopAnchor(vb3, event.getSceneY());
//		AnchorPane.setLeftAnchor(vb3, event.getSceneX());
//
//	}

	public static void main(String[] args) {
		launch();
	}

}


//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

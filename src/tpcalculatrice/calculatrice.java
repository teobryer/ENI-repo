//package tpcalculatrice;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class calculatrice extends Application {
//
//    public static void main(String[] args)  {
//      //  launch(args);
//        try {
//            Operation.addition(2000000000, 2000000000);
//        }
//        catch(DepassementCapaciteException e){
//            System.err.println(e.getMessage());
//        }
//
//
//
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("calc.fxml"));
//        primaryStage.setTitle("Ma Calculatrice");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }
//}

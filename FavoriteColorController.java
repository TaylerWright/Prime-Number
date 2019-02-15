//Name:tayler Wright
//Date:2-14-19
//Purpose : controller class for the favorite color GUI

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class FavoriteColorController {
   @FXML
   private Label Answerlabel;
   @FXML
   private ToggleGroup colorgroup;
   @FXML
   private RadioButton RedButton;
   @FXML
   private RadioButton BlueButton;
   @FXML
   private RadioButton GreenButton;
   @FXML
   private RadioButton PinkButton;
   @FXML
   private RadioButton YellowButton;
   @FXML
   private RadioButton BlackButton;

//event listeners


   public void RedListner(){
      if(RedButton.isSelected()){
         Answerlabel.setText("Red is the color of fire and blood");
      }
   }
   public void BlueListner(){
      if(BlueButton.isSelected()){
         Answerlabel.setText("Blue is the color of the sky and sea. It is often associated with depth and stability. ");
      }
   }
   public void GreenListner(){
      if(GreenButton.isSelected()){
         Answerlabel.setText("Green is the color of nature. It symbolizes growth, harmony, freshness, and fertility ");
      }
   }
   public void PinkListner(){
      if(PinkButton.isSelected()){
         Answerlabel.setText("Pink represents friendship, affection, harmony, inner peace, and approachability. ");
      }
   }
   public void BlackListner(){
      if(BlackButton.isSelected()){
         Answerlabel.setText("Black is associated with power, elegance, formality, death, evil, and mystery. ");
      }
   }
   public void yellowListner(){
      if(YellowButton.isSelected()){
         Answerlabel.setText("Yellow is the color of sunshine. It's associated with joy, happiness, intellect, and energy. ");
      }
   }
}
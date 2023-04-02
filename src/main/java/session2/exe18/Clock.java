package session2.exe18;
//Choose the options that meets the following specification:
//
//Create a well encapsulated class Clock with one instance variable model.
//
//The value of model should be accessible and modifiable outside Clock.
public class Clock {
    private String model;
    private String getModel(){
        return model;
    }
    private void setModel(String val){
        model=val;
    }

    public static void main(String[] args) {
        Clock clock=new Clock();
        clock.setModel("Tom");
        clock.getModel();
    }
}

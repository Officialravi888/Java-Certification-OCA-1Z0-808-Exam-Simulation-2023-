package org.example.exe46;

interface Test {
    public void setMargin();
    public void setOrientation();
}
abstract class Paper implements Test { //Line 7
    public void setMargin() {}
    //Line 9
}

class NewsPaper extends Paper { //Line 12
    public void setMargin() {}

    @Override
    public void setOrientation() {

    }
    //Line 14
}


package exe5.exe20;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Father {
}
class Son extends Father{

}
class GrandFather extends Father{

}
abstract class Super{
    abstract List<Father> get();
}
class Sub extends Super{
     ArrayList<Father> get() {return null;}
}
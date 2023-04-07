package exe5.exe21;

public class P {
    String computer(String str){
        return str+str+str;
    }
}
class Q extends P{
    String computer(String str){
        return super.computer(str.toLowerCase());
    }
}
class R extends Q{
    String computer(String str){
        return super.computer(str.repeat('o'));
    }
}

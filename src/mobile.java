import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class mobile {
    int pin;
    boolean status;
    String name;
    List<String> receive;
    List<String> output;

    mobile(int pin, boolean status, String name){
        this.name = name;
        this.pin = pin;
        this.status = status;
        this.receive = new ArrayList<>();
        this.output = new ArrayList<>();
    }
    public void SetPin(int Pin){
        pin = Pin;
    }
    public void TurnOff(){
        status = false;
    }
    public void TurnOn(){
        status = true;
    }
    public void getStatus(){
        if (status){
            System.out.println(name + " is on.");
            DecreasePin();
        }else {
            System.out.println(name + " is off.");
        }
    }
    public void DecreasePin(){
        pin--;
    }
    public void SendMess(mobile receivePhone, String infor){
        if (status) {
            output.add(infor);
            receivePhone.RecieveMess(infor);
            DecreasePin();
        }
    }
    public void RecieveMess(String infor){
        receive.add(infor);
        DecreasePin();
    }

    public void showSendMess(){
        System.out.println(output);
    }
    public void showRecieveMess(){
        System.out.println(receive);
    }

    public static void main(String[] args) {
        mobile Iphone = new mobile(100, true, "Iphone");
        mobile SamSung = new mobile(100, true, "Sam Sung");
        Iphone.getStatus();
        SamSung.getStatus();
        Iphone.SendMess(SamSung, "Dit cu nhan");
        Iphone.showSendMess();
        SamSung.showRecieveMess();
    }
}

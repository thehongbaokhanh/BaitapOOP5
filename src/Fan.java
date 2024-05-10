public class Fan {
    String speed;
    double radious;
    boolean on = false;
    String color;
    Fan(int speed, double radious, boolean on, String color){
        if (speed == 1){
            this.speed = "slow";
        } else if (speed == 2) {
            this.speed = "medium";
        } else {
            this.speed = "fast";
        }
        this.radious = radious;
        this.on = on;
        this.color = color;
    }

    public String activate() {
        if (on){
        return " The Fan is " + color +" and is speed is "+ speed +"; the radious is: " + radious + "; the fan is on." ;
        }else {
            return " The Fan is " + color +" and is speed is "+ speed +"; the radious is: " + radious + "; the fan is off." ;

        }
    }


    public static void main(String[] args) {
        Fan fan1 = new Fan(3,7, true,"yellow");
        System.out.println(fan1.activate());
        Fan fan2 = new Fan(3,5, false,"blue");
        System.out.println(fan2.activate());
    }

}

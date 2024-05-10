import java.util.Scanner;

public class hinhchunhat {
    int width, height;

    hinhchunhat(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void getArea(){
        System.out.println("Diện tích là: " + this.width * this.height);
    }

    public void getPerimet(){
        System.out.println("Chu vi là: " + (this.width + this.height) * 2 );
    }
    public void display(){
        for (int x = 1 ; x <= this.height; x++){
            for (int y = 1; y <= this.width; y++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập chiều dài: ");
        Scanner infor = new Scanner(System.in);
        int height = infor.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int width = infor.nextInt();
        hinhchunhat hinhchunhat = new hinhchunhat(width,height);
        hinhchunhat.getArea();
        hinhchunhat.getPerimet();
        hinhchunhat.display();
    }
}

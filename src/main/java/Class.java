public class Class {
    int h;
    int v;
    int l;
    int w = 2000;
    int maxW = 2700;
    int maxL;
    int maxS = 260;
    int s;
    String color;


    public  void addWeight(int w){
        this.w += w;
        System.out.println("New w " + this.w);

    }
    public void drive(int s){
        if (w <= maxW){
            this.s = s;

        }else {
            System.out.println("Cannot drive!");
        }
    }


    }


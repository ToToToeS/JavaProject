package Test;

public class NOD {
    public static int nod(int a, int b){
        if(a == 0) return b;
        return NOD.nod(b % a, a);
    }

    public static void main(String[] args){

    }
}

public class Main {
    public static void main(String args[]){
        System.out.println(intMax(10,6,11));
    }
    public static int intMax(int a,int b,int c){
        if(a>b){
            if (a<c){ // after inserting fault in the function
                return a;
            }
        }
       if(b>c){
            return b;
        }
        return c;
    }
}

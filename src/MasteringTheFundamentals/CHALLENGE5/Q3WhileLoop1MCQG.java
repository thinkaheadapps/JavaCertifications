package MasteringTheFundamentals.CHALLENGE5;

public class Q3WhileLoop1MCQG {

    public static void main(String[] args) {
        int i = 0;
        while(i < 4){
            if(i % 2 == 0){
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }
            i += 2;
        }
    }
}

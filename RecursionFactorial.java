public class RecursionFactorial {
        int fact(int n){
            if(n==0) return 1;
            return n*fact(n-1);
        }
        public static void main(String[] args) {
            RecursionFactorial ob=new RecursionFactorial();
            int res=ob.fact(4);
            System.out.println(res);
        }
        
    }
    

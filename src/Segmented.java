public class Segmented {
    public static void segmentedSieve(int l, int h){
        boolean[] prime = new boolean[h+1];
        for(int i=2; i<=h; i++){
            prime[i] = true;
        }

        for(int p = 2; p*p <= h; p++){
            int sm = (l/p)*p;
            if(sm < l){
                sm+=p;
            }
            for(int i=sm; i<= h; i+=p){
                prime[i] = false;
            }
        }

        for(int i = l; i <=h; i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        segmentedSieve(10,30);
    }
}

public class SieveMain {
    public static void simpleSieve(int limit){
        boolean[] prime = new boolean[limit+1];
        for(int i = 2; i <= limit; i++){
            prime[i]=true;
        }

        for(int p = 2; p*p <= limit; p++){
            if(prime[p]){
                for(int i = p*p; i <= limit; i+=p){
                    prime[i] = false;
                }
            }
        }

        for(int i=2; i<limit; i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        simpleSieve(30);
    }
}

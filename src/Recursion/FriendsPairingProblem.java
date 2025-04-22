package Recursion;

public class FriendsPairingProblem {
    public static int pairing(int n){
        if (n==1 || n==2) return n;

        // choice
        //single
        int fnm1 = pairing(n-1);

        //pair
        int fnm2 = pairing(n-2);
        int pairways = (n-1)*fnm2;

        return fnm1+ pairways;

        // beautiful indentation
//         return pairing(n-1) + (n-1)*pairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pairing(10));
    }
}

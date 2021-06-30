package Package;

public class FibSequence {
    public static void fibNumber(int fibNum){
        int prevNumber=0, currNumber=1, nextNumber=1;
        for(int i=0;i<fibNum-1;i++){
            prevNumber = currNumber;
            currNumber = nextNumber;
            nextNumber=prevNumber+currNumber;
        }
        System.out.println(nextNumber);
    }
    public static void main(String[] args) {
        fibNumber(18);
    }
}
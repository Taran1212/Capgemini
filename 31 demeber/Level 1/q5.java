public class q5 {
    public static void main(String[] args) {
        int pens = 14;
        
        int pensDistributed = pens%3;
        int pensRemaining = pens - (pensDistributed*3);

        System.out.println("The Pen Per Student is " + pensDistributed + " and the remaining pen not distributed is " + pensRemaining);
    }
}

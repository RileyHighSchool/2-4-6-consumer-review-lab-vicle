public class Main {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("Absolutely"));
        System.out.println(Review.sentimentVal("abandoned"));
        System.out.println(Review.sentimentVal("account"));


        System.out.println(Review.totalSentiment("simpleReview.txt"));
        

        
    
        }
}

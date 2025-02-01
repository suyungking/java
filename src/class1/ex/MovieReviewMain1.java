package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview mr = new MovieReview();
        mr.title = "극한직업" ;
        mr.review = "재미있어요!!";

        MovieReview mr1 = new MovieReview();
        mr1.title = "파묘" ;
        mr1.review = "무섭지만 재미있어요!!";


        System.out.println("영화 제목 : " + mr.title + " 영화 리뷰 : " + mr.review);
        System.out.println("영화 제목 : " + mr1.title + " 영화 리뷰 : " + mr1.review);
    }



}

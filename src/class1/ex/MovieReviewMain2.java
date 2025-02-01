package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview mr = new MovieReview();
        mr.title = "극한직업" ;
        mr.review = "재미있어요!!";

        MovieReview mr1 = new MovieReview();
        mr1.title = "파묘" ;
        mr1.review = "무섭지만 재미있어요!!";


        MovieReview[] mrl = new MovieReview[]{mr,mr1};

        for(MovieReview s : mrl){
            System.out.println("영화 제목 : " + s.title + " 영화 리뷰 : " + s.review);
        }
    }



}

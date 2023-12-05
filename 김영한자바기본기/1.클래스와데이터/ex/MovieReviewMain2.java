package ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 무프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        reviews[0]= inception;
        reviews[1] = aboutTime;

        for (MovieReview movieReview : reviews) {
            System.out.println("영화 제목 : " + movieReview.title + ", 리뷰: " + movieReview.review);
        }












    }


}

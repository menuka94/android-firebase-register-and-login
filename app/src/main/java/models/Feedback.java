package models;

import com.google.firebase.database.IgnoreExtraProperties;

import controllers.ReviewersController;

/**
 * Created by menuka on 3/17/17.
 */

@IgnoreExtraProperties()
public class Feedback {
    private String key;
    private String rating;
    private String comment;
    private String studentId;
    private String reviewer;
    private String date;

    public Feedback() {

    }

    public Feedback(String rating, String comment, String studentId, String reviewerId, String date) {
        this.rating = rating;
        this.comment = comment;
        this.studentId = studentId;
        this.reviewer = reviewerId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "key='" + key + '\'' +
                ", rating='" + rating + '\'' +
                ", comment='" + comment + '\'' +
                ", studentId='" + studentId + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getReviewer() {
        Reviewer reviewerById = ReviewersController.getReviewerById(this.reviewer);
        return reviewerById.getFirstName() + reviewerById.getLastName();
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}

package com.campusdual.redsoclal;

import java.util.Date;

public class Comments {
    private String comment;
    private Date commentDate;
    private String owner;

    public Comments(String comment, Date commentDate, String owner) {
        this.comment = comment;
        this.commentDate = commentDate;
        this.owner = owner;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

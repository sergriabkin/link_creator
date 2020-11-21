package com.riabkin.linkcreator;

public class Link {

    private String userLink;
    private String createdLink;

    public Link() {
    }

    public Link(String userLink, String createdLink) {
        this.userLink = userLink;
        this.createdLink = createdLink;
    }

    public String getUserLink() {
        return userLink;
    }

    public void setUserLink(String userLink) {
        this.userLink = userLink;
    }

    public String getCreatedLink() {
        return createdLink;
    }

    public void setCreatedLink(String createdLink) {
        this.createdLink = createdLink;
    }
}

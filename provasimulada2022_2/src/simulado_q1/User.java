package simulado_q1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String twitterId;
    private List<Tweet> tweets = new LinkedList<>();
    private Date verificationDate;
    
    public User(String twitterId, Date verificationDate) {
        this.twitterId = twitterId;
        this.verificationDate = verificationDate;
    }

    public String getTwitterId() {
        return twitterId;
    }
    public List<Tweet> getTweets() {
        return tweets;
    }
    public Date getVerificationDate() {
        return verificationDate;
    }
    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public int calculaTamanhoDosTweets() {
        int tamanhoTotal=0;
        for (Tweet t : tweets) {
            tamanhoTotal+=t.getTamanho();
        }
        return tamanhoTotal;
    }

    public void addTweet(String s) {
        Tweet t = new Tweet(s);
        tweets.add(t);
    }
}

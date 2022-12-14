package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class UserBase {
    private List<User> users = new LinkedList<>();

    public UserBase() {
    }

    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    public float calculaPorcentagemVerificados() {
        float qtdVerificados=0;
        for (User u : users) {
            if (u.getVerificationDate()!=null) {
                qtdVerificados++;
            }
        }
        return qtdVerificados/users.size();
    }

    public float calculaTamanhoMedioDosTweets() {
        float tamanhoTotalDosTweets=0;
        float qtdTotalDeTweets=0;
        for (User u : users) {
            tamanhoTotalDosTweets+=u.calculaTamanhoDosTweets();
            qtdTotalDeTweets+=u.getTweets().size();
        }
        if (tamanhoTotalDosTweets!=0)
            return tamanhoTotalDosTweets/qtdTotalDeTweets;
        return tamanhoTotalDosTweets;
    }

    public void addUser(User u) {
        users.add(u);
    }
}

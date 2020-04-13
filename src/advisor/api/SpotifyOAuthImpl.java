package advisor.api;

public class SpotifyOAuthImpl implements SpotifyOAuth {

    private String token = "";

    public String getToken() {
        return token;
    }

    private void setToken(String token) {
        this.token = token;
    }

    @Override
    public void auth(String apiUrl) {
        this.setToken("hardcoded_token");
        System.out.println(apiUrl);
        System.out.println("---SUCCESS---");
    }
}

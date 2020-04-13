package advisor.api;

public interface SpotifyOAuth {

    void auth(String apiUrl);
    String getToken();
}

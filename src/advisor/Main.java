package advisor;

import advisor.api.AdvisorApi;
import advisor.api.AdvisorApiImpl;
import advisor.api.SpotifyOAuth;
import advisor.api.SpotifyOAuthImpl;

import java.util.Scanner;

/**
 * https://developer.spotify.com/dashboard/applications
 */
public class Main {

    private static String apiUrl = "https://accounts.spotify.com/authorize?client_id=YOURCLIENT&redirect_uri=https://www.example.com&response_type=code";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String command = "";
        String param = "";

        AdvisorApi advisorApi = new AdvisorApiImpl();
        SpotifyOAuth oAuth = new SpotifyOAuthImpl();

        boolean keepAsking = true;
        while (keepAsking) {
            // System.out.print("> ");
            input = scanner.nextLine().toLowerCase().trim();

            if (input.indexOf(" ") > 0) {
                command = input.substring(0, input.indexOf(" "));
                param = input.substring(input.indexOf(" "));
            } else {
                command = input;
            }

            if (command.equals("exit")) {
                System.out.println("---GOODBYE!---");
                keepAsking = false;

            } else if (oAuth.getToken().equals("") && command.equals("auth")) {
                oAuth.auth(apiUrl);

            } else if (!oAuth.getToken().equals("")) {
                switch (command) {

                    case "auth":
                        oAuth.auth(apiUrl);

                    case "featured":
                        advisorApi.getFeatured();
                        break;

                    case "new":
                        advisorApi.getNew();

                    case "categories":
                        advisorApi.getCategories();
                        break;

                    case "playlists":
                        advisorApi.getPlaylists(param);
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("Please, provide access for application.");
            }
        }
    }
}

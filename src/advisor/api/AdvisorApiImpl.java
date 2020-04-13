package advisor.api;

public class AdvisorApiImpl implements AdvisorApi {

    private final String featured = "---FEATURED---\n" +
            "Mellow Morning\n" +
            "Wake Up and Smell the Coffee\n" +
            "Monday Motivation\n" +
            "Songs to Sing in the Shower";

    private final String newReleases = "---NEW RELEASES---\n" +
            "Mountains [Sia, Diplo, Labrinth]\n" +
            "Runaway [Lil Peep]\n" +
            "The Greatest Show [Panic! At The Disco]\n" +
            "All Out Life [Slipknot]";

    private final String categories = "---CATEGORIES---\n" +
            "Top Lists\n" +
            "Pop\n" +
            "Mood\n" +
            "Latin";

    private final String playlists = "---MOOD PLAYLISTS---\n" +
            "Walk Like A Badass  \n" +
            "Rage Beats  \n" +
            "Arab Mood Booster  \n" +
            "Sunday Stroll";

    @Override
    public void getFeatured() {
        System.out.println(featured);
    }

    @Override
    public void getNew() {
        System.out.println(newReleases);
    }

    @Override
    public void getCategories() {
        System.out.println(categories);
    }

    @Override
    public void getPlaylists(String c_name) {
        System.out.println(playlists);
    }
}

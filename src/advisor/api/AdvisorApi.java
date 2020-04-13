package advisor.api;

public interface AdvisorApi {

    void getFeatured();
    void getNew();
    void getCategories();
    void getPlaylists(String c_name);
}

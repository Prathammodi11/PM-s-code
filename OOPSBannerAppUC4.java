public class OOPSBannerApp {

    
    private String[] bannerLines;

    
    public OOPSBannerApp() {
        bannerLines = new String[] {
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     *",
            "*     * *     * *     * *      ",
            "*     * *     * ******   ***** ",
            "*     * *     * *              *",
            "*     * *     * *              *",
            " *****   *****  *        ***** "
        };
    }

    
    public void displayBanner() {
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

       
        OOPSBannerApp banner = new OOPSBannerApp();

       
        banner.displayBanner();
    }
}
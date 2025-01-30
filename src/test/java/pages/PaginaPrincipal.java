package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
   // private String sectionLink = "//header/nav/ul/li[2]/a";    // llamada al constructor padre
    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a FRT
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");

    }

    public void clickOnSectionNavigationBar(String section) {
        //remplazar el marcador de posicion sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
}

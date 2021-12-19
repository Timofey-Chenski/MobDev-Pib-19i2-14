public enum ReviewsPit {
    A("ОТЛИЧНО"),
    B ("ХОРОШО"),
    C ("УДОВЛЕТВОРИТЕЛЬНО"),
    D ("НЕУДОВЛЕТВОРИТЕЛЬНО");

    String rusVersion;

    ReviewsPit(String rusVersion) {
        this.rusVersion = rusVersion;
    }
}

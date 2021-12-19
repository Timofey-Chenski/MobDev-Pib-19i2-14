public enum AchievementsPit {
    PART_OF_THE_OLYMPIAD("Участник олимпиады"),
    WINNER_OF_THE_OLYMPIAD("Победитель олимпиады"),
    STUDENT_OF_THE_MONTH("Активист месяца"),
    PART_OF_THE_STUDENT_COUNCIL("Член профкома");

    String rusVersion;

    AchievementsPit(String rusVersion) {
        this.rusVersion = rusVersion;
    }
}

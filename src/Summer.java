public enum Summer {
    SUMMER("лето"), WINTER("зима"), SPRING("весна");
    private String translation;

    Summer(String translation) {
        this.translation = translation;

    }
    public void getTranslation(){
        System.out.println(SUMMER.translation);
    }

}

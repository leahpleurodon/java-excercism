import java.util.Arrays;

class Acronym {
    public String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String initials = "";

        for (int i = 0; i < phrase.split("\\W+").length; i++) {
            String initial = String.valueOf(
                Arrays.asList(phrase.split("\\W+")).get(i).charAt(0)
            );
            initials = initials + initial;
        }
        return initials.toUpperCase();
    }

}

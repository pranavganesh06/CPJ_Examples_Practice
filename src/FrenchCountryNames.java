public class FrenchCountryNames {

    public static String addFrenchArticleToCountry(String country) {

        // --- PLURAL COUNTRIES ---
        if (country.equals("Etats-Unis") || country.equals("Pays-Bas")) {
            return "les " + country;
        }

        // --- COUNTRIES THAT ARE MASCULINE EVEN WITH 'E' ---
        String[] masculineExceptions = {
                "Belize", "Cambodge", "Mexique", "Mozambique", "Zaire", "Zimbabwe"
        };

        for (String s : masculineExceptions) {
            if (country.equals(s)) {
                return "le " + country;
            }
        }

        // --- STARTS WITH A VOWEL → USE l' ---
        char first = Character.toLowerCase(country.charAt(0));
        if ("aeiouh".indexOf(first) != -1) {
            return "l'" + country;
        }

        // --- ENDS WITH 'e' → FEMININE ---
        if (country.endsWith("e")) {
            return "la " + country;
        }

        // --- OTHERWISE → MASCULINE ---
        return "le " + country;
    }
}

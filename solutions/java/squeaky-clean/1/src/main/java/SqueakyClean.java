class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {

            char c = identifier.charAt(i);

            if (c == ' ') {
                resultado.append('_');
            } else if (c == '-') {
                if (i + 1 < identifier.length()) {
                    resultado.append(
                        Character.toUpperCase(identifier.charAt(++i))
                    );
                }
            } else if (c == '4') {
                resultado.append('a');
            } else if (c == '3') {
                resultado.append('e');
            } else if (c == '0') {
                resultado.append('o');
            } else if (c == '1') {
                resultado.append('l');
            } else if (c == '7') {
                resultado.append('t');
            } else if (Character.isLetter(c)) {
                resultado.append(c);
            }

            // Los demás caracteres se ignoran.
        }

        return resultado.toString();
    }
}
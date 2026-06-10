package br.com.agencia.aeroportos;

public class AeroportoFactory {
    public static Aeroporto obterAeroporto(String codigoIATA) {
        try {
            // Os alunos usarão o código oficial de 3 letras do aeroporto (IATA) como comando
            String nomeClasse = switch (codigoIATA.toUpperCase()) {
                // América do Sul e Norte
                case "EZE" -> "BuenosAires";
                case "SCL" -> "Santiago";
                case "JFK" -> "NovaYork";
                case "MIA" -> "Miami";
                case "LAX" -> "LosAngeles";
                case "YUL" -> "Montreal";
                case "MEX" -> "CidadeDoMexico";
                case "LIM" -> "Lima";

                // Europa
                case "LHR" -> "Londres";
                case "CDG" -> "Paris";
                case "MAD" -> "Madrid";
                case "FRA" -> "Frankfurt";
                case "FCO" -> "Roma";
                case "BAR" -> "Barcelona";

                // Ásia e Oceania
                case "HND" -> "Toquio";
                case "PEK" -> "Pequim";
                case "ICN" -> "Seul";
                case "SIN" -> "Cingapura";
                case "SYD" -> "Sydney";
                case "AKL" -> "Auckland";
                case "LUA" -> "Lukla";

                // África e Oriente Médio
                case "DXB" -> "Dubai";
                case "CAI" -> "Cairo";
                case "CPT" -> "CidadeDoCabo";
                case "DOH" -> "Doha";
                case "IST" -> "Istambul";

                default -> null;
            };

            if (nomeClasse == null) return null;

            return (Aeroporto) Class.forName("br.com.agencia.aeroportos." + nomeClasse)
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (ClassNotFoundException e) {
            return null; // Retorna null se o aluno ainda não fez o merge da classe
        } catch (Exception e) {
            return null;
        }
    }
}

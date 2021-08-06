import java.util.stream.Collectors;

class RnaTranscription {

    private char mapDnaToRna(char dna) {
        switch (dna) {
            case 'G': return 'C';
            case 'C': return 'G';
            case 'T': return 'A';
            case 'A': return 'U';
            default:
                throw new IllegalArgumentException("Invalid DNA");
        }
    }

    String transcribe(String dnaStrand) {
        return dnaStrand.chars().mapToObj(c -> (char) c)
                .map(this::mapDnaToRna)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}

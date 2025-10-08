public class Main {
    public static void main(String[] args) throws Exception {
        String input = """
            let a = 42 + 5 - 8;
            let b = 56 + 8;
            let c = 8 / 4;
            print a + b + 6;        
                """;

        Parser p = new Parser (input.getBytes());
        p.parse();
    }

}
public class App {
    public static void main(String[] args) throws Exception {

        //From left to right, parenthesis are priority!
        System.out.println(1 + 2 + "Hello");
        System.out.println("Hi" + 1 + 2);
        System.out.println("Hey" + (1 + 2));
        System.out.println(4 + 2 + "Hey" + 3 + (1 + 2));
        
    }
}

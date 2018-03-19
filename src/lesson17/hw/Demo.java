package lesson17.hw;

public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String test = "Discover interesting projects and people to to to to populate your personal news feed.";
        String test1 = "у тебя такие строки принимало например hghhghfggthfghgh ?";

        System.out.println(solution.countWords(test));
        System.out.println(solution.countWords(" "));
        System.out.println(solution.countWords(null));
        System.out.println(solution.minWord(test1));
        System.out.println(solution.minWord(""));
        System.out.println(solution.minWord("     "));
        System.out.println(solution.minWord(" qwe"));
        System.out.println(solution.minWord(" qwe4"));
        System.out.println(solution.minWord(" qwe& "));
        System.out.println("Max words " + solution.maxWord(test1));
        System.out.println(solution.minWord(test));

        System.out.println(solution.mostCountedWord("qqq qqqq qqqq er ty qwerty"));
        System.out.println(solution.mostCountedWord(" qqq qqqq qqqq er ty qwerty qwer"));
        System.out.println(solution.mostCountedWord(" qqq qqqq qqqq er ty qwerty sppp"));
        System.out.println(solution.mostCountedWord(""));
        System.out.println(solution.mostCountedWord("      "));
        System.out.println(solution.mostCountedWord(null));
        System.out.println(solution.mostCountedWord(" qw    qw"));
        System.out.println(solution.mostCountedWord(" q@w   q@w"));
        System.out.println(solution.mostCountedWord(" q@w   qw"));

        System.out.println(solution.validate(""));
        System.out.println(solution.validate(null));
        System.out.println(solution.validate("http:// "));
        System.out.println(solution.validate("https://.ghjkfjjkylu.com.com"));

        System.out.println(solution.validate("http://www.qwerty.com"));
        System.out.println(solution.validate("http://qwerty.com"));

        System.out.println(solution.validate("http://www.ghjkfjjkylu.com.com"));
        System.out.println(solution.validate("http://www.ghjkfjjkylu.com.com"));
    }
}
public class C05_selfCheck {
  public static void main(String[] args) {

  }

  // 15. accept a character and check if its a vowel
  public static boolean isVowel(char letter) {
    // return "aeiouAEIOU".contains(String.valueOf(letter));
    letter = Character.toLowerCase(letter);
    return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
  }

  public static void testIsVowel() {
    IO.println("Is the letter 'v' a vowel? " + isVowel('v'));
    IO.println("Is the letter 'a' a vowel? " + isVowel('a'));
    IO.println("Is the letter 'E' a vowel? " + isVowel('E'));
  }

  // 16. check if number is prime
  public static boolean isPrime(int num) {
    boolean prime = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        prime = false;
      }
    }
    return prime;
  }

  public static void testIsPrime() {
    IO.println("Is 11 a prime? " + isPrime(11));
    IO.println("Is 22 a prime? " + isPrime(22));
  }

  // 17. check if string contains a specific letter
  public static boolean contains(String str, char ch) {
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        found = true;
      }
    }
    return found;
  }

  public static void testContains() {
    IO.println("Is 'i' in 'string'? " + contains("string", 'i'));
  }

  // 18. using boolean zen write an imporved startEndSame method
  public static boolean startEndSame(String str) {
    // if (str.charAt(0) == str.charAt(str.lenghth() - 1)) {
    //   return true;
    // } else {
    //   return false;
    // }
    return str.charAt(0) == str.charAt(str.length() - 1);
  }

  public static void testStartEndSame() {
    IO.println("First and Last letters same for 'label'? " + startEndSame("label"));
    IO.println("First and Last letters same for 'lover'? " + startEndSame("lover"));
  }

  // 19. using boolean zen write an improve hasPennies
  public static boolean hasPennies(int cents) {
    // boolean nickelsOnly = (cents % 5 == 0);
    // if (nickelsOnly == true) {
    //   return false;
    // } else {
    //   return true;
    // }
    return cents % 5 == 0;
  }

  public static void testHasPennies() {
    IO.println("Do I need pennies for 0.25? " + hasPennies(25));
    IO.println("Do I need pennies for 0.31? " + hasPennies(31));
  }


}

String s = "Hello World";

s.length()                    // 11
s.charAt(0)                   // 'H'
s.indexOf('o')                // 4 (first occurrence)
s.lastIndexOf('o')            // 7
s.substring(6)                // "World"
s.substring(0, 5)             // "Hello" (end exclusive)
s.toUpperCase()                // "HELLO WORLD"
s.toLowerCase()                // "hello world"
s.trim()                       // removes leading/trailing whitespace
s.strip()                      // like trim() but Unicode-aware (Java 11+)
s.replace('o', '0')            // "Hell0 W0rld"
s.replaceAll("o", "0")         // regex-based replace
s.split(" ")                   // ["Hello", "World"]
s.contains("World")            // true
s.startsWith("Hello")          // true
s.endsWith("ld")               // true
s.equals("hello world")        // false (case-sensitive)
s.equalsIgnoreCase("hello world") // true
s.compareTo("Hello")           // lexicographic comparison, returns int
s.isEmpty()                    // false
s.isBlank()                    // false (Java 11+, checks whitespace-only too)
s.toCharArray()                // char[] {'H','e','l','l','o',...}
String.valueOf(123)            // "123"
String.join("-", "a","b","c")  // "a-b-c"
s.repeat(2)                    // "Hello WorldHello World" (Java 11+)
s.chars()                      // IntStream of char codes


## STRING vs STRINGBUILDER vs STRINGBUFFER 

Feature                     String                           StringBuilder                StringBuffer
yes
Mutability                  Immutable                        Mutable                      Mutable
Thread-safeYes             yes (immutable → inherently safe)  No                          Yes (synchronized methods)
Performance                Slow for repeated modification     Fast                        Slower than StringBuilder (sync overhead)Introduced                 Java 1.0                           Java 5                      Java 1.0
Use case                   Fixed/rarely changing              textSingle-threaded          Multi-threaded string building
                                                              string building




## String Builder 

*** 
    it doesn't create a new string when we chnage in str or perforn any opr it is faster then string, sb is immutable
    but it not a thread safe (less secure than string and string buffer)
***

StringBuilder sb = new StringBuilder("hello");
sb.append(" world");        // "hello world"
sb.insert(0, ">> ");        // ">> hello world"
sb.reverse();                // reverses in place
sb.deleteCharAt(0);          // removes char at index
sb.delete(0, 2);             // removes range
sb.replace(0, 5, "HI");      // replaces range
sb.setCharAt(0, 'X');        // mutate a single char
sb.charAt(0);
sb.length();
sb.toString();                // convert back to String
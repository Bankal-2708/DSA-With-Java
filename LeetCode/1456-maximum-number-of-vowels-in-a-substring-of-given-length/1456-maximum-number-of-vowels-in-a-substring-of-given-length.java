class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vol = 0;
        int maxVol = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                vol += 1;
            }
        }
        maxVol = vol;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                vol--;
            }

            if (vowels.contains(s.charAt(i))) {
                vol++;
            }

            maxVol = Math.max(maxVol, vol);
        }

        return maxVol;
    }
}
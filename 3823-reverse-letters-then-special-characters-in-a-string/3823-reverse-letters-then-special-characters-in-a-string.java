class Solution {
    public String reverseByType(String s) {

        List<Character> letters = new ArrayList<>();
        List<Character> special = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) {
                letters.add(c);
            } else {
                special.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        int l = letters.size() - 1;
        int sp = special.size() - 1;

        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append(letters.get(l--));
            } else {
                sb.append(special.get(sp--));
            }
        }

        return sb.toString();
    }
}
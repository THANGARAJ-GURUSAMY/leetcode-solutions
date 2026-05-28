class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int index;
    }

    TrieNode root = new TrieNode();

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        int best = 0;

        for (int i = 1; i < wordsContainer.length; i++) {
            if (wordsContainer[i].length() < wordsContainer[best].length()) {
                best = i;
            }
        }

        root.index = best;

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i, wordsContainer);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    public void insert(String s, int idx, String[] wordsContainer) {

        TrieNode node = root;

        for (int i = s.length() - 1; i >= 0; i--) {

            int c = s.charAt(i) - 'a';

            if (node.child[c] == null) {
                node.child[c] = new TrieNode();
                node.child[c].index = idx;
            } else {

                int prev = node.child[c].index;

                if (wordsContainer[idx].length() < wordsContainer[prev].length()) {
                    node.child[c].index = idx;
                }
            }

            node = node.child[c];
        }
    }

    public int search(String s) {

        TrieNode node = root;

        for (int i = s.length() - 1; i >= 0; i--) {

            int c = s.charAt(i) - 'a';

            if (node.child[c] == null) {
                return node.index;
            }

            node = node.child[c];
        }

        return node.index;
    }
}
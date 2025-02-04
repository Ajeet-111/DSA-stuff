public class Trie{
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }
    class TrieNode{
        private TrieNode[] children;
        boolean isWord;

        TrieNode(){
            this.children = new TrieNode[26];//a-z
            this.isWord = false;
        }
    }

    public void insert(String word){
        if (word.isEmpty()) {
            throw new IllegalArgumentException("invalid input");
        }
        word.toLowerCase();

        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (curr.children[index] == null) { //to check if the element is pointing towards any node already.
                curr.children[index] = new TrieNode();
            } else{
                curr = curr.children[index];
            }
        }
        curr.isWord = true;
    }

    public boolean search(String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isWord;
    }

    public static void main(String[] args){
        Trie t = new Trie();
        t.insert("cat");
        t.insert("cab");
        t.insert("son");
        t.insert("so");
        System.out.println();
    }
}
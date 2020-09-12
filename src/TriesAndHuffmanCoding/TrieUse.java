package TriesAndHuffmanCoding;

public class TrieUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("yatin");
		t.add("ranga");
		System.out.println(t.search("yatin"));
		t.remove("yatin");
		System.out.println(t.search("yatin"));
	}

}

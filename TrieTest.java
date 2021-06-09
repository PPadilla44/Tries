package com.tries;

public class TrieTest {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        trie.insertWord("bye");

        trie.printAllKeys();

        System.out.println("\n-----TESTING isPrefixValid-----\n");

        System.out.println("SHOULD BE TRUE\t" + trie.isPrefixValid("ca"));
        System.out.println("SHOULD BE TRUE\t" + trie.isPrefixValid("t"));
        System.out.println("SHOULD BE FALSE\t" + trie.isPrefixValid("crav"));
        System.out.println("SHOULD BE FALSE\t" + trie.isPrefixValid("trying"));

        System.out.println("\n-----TESTING isWordValid-----\n");

        System.out.println("SHOULD BE TRUE\t" + trie.isWordValid("car"));
        System.out.println("SHOULD BE TRUE\t" + trie.isWordValid("bye"));
        System.out.println("SHOULD BE FALSE\t" + trie.isWordValid("carry"));
        System.out.println("SHOULD BE FALSE\t" + trie.isWordValid("by"));


    }

}

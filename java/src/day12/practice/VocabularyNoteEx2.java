package day12.practice;

public class VocabularyNoteEx2 {

	public static void main(String[] args) {
        Word wordList[] = {
        		new Word("abc"),
        		new Word("def","def is define"),
        		new Word("c", "c")
        };
        
        
        VocabularyNote1 note = new VocabularyNote1(wordList);
        //note.print();
        
        //1
        Word word = new Word("a", "a");
        note.insert(word);
        //note.print();
        
        //2
        note.insert("b", "b is b");
        //note.print();
        
        //note.delete("d");//No words found 출력
        note.delete("a");
        note.delete("c");
        
        //note.search("a");
        //note.search("b");
        
        note.insert("b","b");
        //note.print();
        
        note.updateMeaning("b", 2, "b");
        note.updateMeaning("b", 3, "b"); //Wrong number
        //note.print();
        
        note.updateTitle("b","B");
        note.updateTitle("b","B"); //No words found
        note.print();
	}
}
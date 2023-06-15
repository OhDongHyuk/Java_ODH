package day12.practice;

public class VocabularyNoteEx2 {

	public static void main(String[] args) {
        Word wordList[] = {
        		new Word("abc"),
        		new Word("def","def is define")
        };
        VocabularyNote1 note = new VocabularyNote1(wordList);
        note.print();
	}
}
package template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import template.commands.CommandPropertyPathUtils;

public class PropertyUtilsTest {
	@Test
	public void givenEmptyString_whenConvertToPropertyPaths_thenIsEmpty() {
		String input = "";
		String actual = convertToPropertyPaths(input);
		assertEquals("", actual);
	}

	@Test
	public void givenTwoWordsByPoint_whenConvertToPropertyPaths_thenSecondIsConvertedToGetter() {
		String input = "word1.word2";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1.getWord2()", actual);
	}
	
	@Test
	public void givenTwoTimesTwoWordsByPoint_whenConvertToPropertyPaths_thenBothAreRegardedSeparately() {
		String input = "word1.word2 XXX word3.word4";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1.getWord2() XXX word3.getWord4()", actual);
	}
	
	@Test
	public void givenSingleWord_whenConvertToPropertyPaths_thenKeepWordAsItIs() {
		String input = "word1";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1", actual);
	}
	
	@Test
	public void givenThreeTimesThreeWordsByDot_andSpacesAround_whenConvertToPropertyPaths_thenThreePropertyPathsAreReplaced() {
		String input = "   word1.word2.word3  word3.word4.word5 word1.word2.word3  ";
		String actual = convertToPropertyPaths(input);
		assertEquals("   word1.getWord2().getWord3()  word3.getWord4().getWord5() word1.getWord2().getWord3()  ", actual);
	}
	
	@Test
	public void givenWordWithIs_whenConvertToPropertyPaths_thenNoGetIsAdded() {
		String input = "word1.isWord2";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1.isWord2()", actual);
	}
	
	@Test
	public void givenWordWithStream_whenConvertToPropertyPaths_thenNoGetIsAdded() {
		String input = "word1.stream().filter(MyClass.class::isInstance)";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1.stream().filter(MyClass.class::isInstance)", actual);
	}
	
	@Test
	public void givenWordWithCollectors_whenConvertToPropertyPaths_thenNoGetIsAdded() {
		String input = "word1.stream().collect(Collectors.toList())";
		String actual = convertToPropertyPaths(input);
		assertEquals("word1.stream().collect(Collectors.toList())", actual);
	}
	
	private String convertToPropertyPaths(String s) {
		return CommandPropertyPathUtils.toPropertyGetters(s);
	}
}

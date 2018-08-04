package org.sonna.www.sonna;

import org.junit.Test;
import org.sonna.www.sonna.services.TextUtils;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class TextUtilsTest {


	@Test
	public void testSearchHighlight() {
		String text =  "besm ellah ";
		String textHighlighted = "besm <font color=\"red\">ellah</font> ";
		assertEquals(textHighlighted, TextUtils.highlight(text, "ellah"));
	}


	@Test
	public void testTrimTrailingHashes() {
		final String content = "some test message ##";
		final String content2 = "some test message ";
		assertEquals(content2, TextUtils.removeTrailingHashes(content));
	}

	@Test
	public void testReplacement() {

		final String content = "word1 word2 word3";
		final String content2 = "word1 |word2| word3";
		String newString = content.replaceAll("(word2)", "<$1>");
		assertEquals(newString, content2);

	}


}

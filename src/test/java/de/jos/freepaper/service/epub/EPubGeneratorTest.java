/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.service.epub;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author wuesand
 */
public class EPubGeneratorTest {

    public EPubGeneratorTest() {
    }

    @Test
    public void testGenerate() throws Exception {
        final List<StoryDto> stories = new ArrayList<>();
        stories.add(new StoryDto("der Titel 1", "<div>asdfasdfa sf sfd gsdf gsdf gsdfg sfd</div>", "spiegel.de", "www.spiegel.de/adfasdf/asdfasdfasdf"));
        stories.add(new StoryDto("der Titel 2", "<div>asa asfd asdf asdfasf asdf asd fdfasdfasdfasdfdfasdfasfd</div>", "focus.de", "www.focus.de/adfasdf/asdfasdfasdf"));

        final EPubGenerator generator = new EPubGenerator();
        generator.generate(stories, new FileOutputStream("/tmp/test.zip"));
    }

}

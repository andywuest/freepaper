package de.jos.freepaper.views;

import de.jos.freepaper.service.epub.StoryDto;
import io.dropwizard.views.View;

/**
 *
 * @author wuesand
 */
public class StoryView extends View {

    private final StoryDto story;

    public StoryView(StoryDto story) {
        super("story.ftl");
        this.story = story;
    }

    public StoryDto getStory() {
        return story;
    }

}

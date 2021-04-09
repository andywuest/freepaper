package de.jos.freepaper.views;

import de.jos.freepaper.service.epub.StoryDto;
import io.dropwizard.views.View;

/**
 *
 * @author wuesand
 */
public class StoryRemovalView extends View {

    private final StoryDto story;

    public StoryRemovalView(StoryDto story) {
        super("storyRemoval.ftl");
        this.story = story;
    }

    public StoryDto getStory() {
        return story;
    }

}

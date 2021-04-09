/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.views;

import de.jos.freepaper.service.epub.StoryDto;
import io.dropwizard.views.View;
import java.util.List;

/**
 *
 * @author wuesand
 */
public class StoriesView extends View {

    private final List<StoryDto> stories;

    public StoriesView(List<StoryDto> stories) {
        super("stories.ftl");
        this.stories = stories;
    }

    public List<StoryDto> getStories() {
        return stories;
    }

}

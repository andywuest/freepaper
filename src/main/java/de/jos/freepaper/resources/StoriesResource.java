/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.resources;

import de.jos.freepaper.Constants;
import de.jos.freepaper.service.epub.StoryDto;
import de.jos.freepaper.views.StoriesView;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author wuesand
 */
@Path("/stories")
@Produces(MediaType.TEXT_HTML)
public class StoriesResource {

    @GET
    public StoriesView getStories(@Context HttpServletRequest request) {
        final ServletContext servletContext = request.getServletContext();
        final List<StoryDto> stories = (List<StoryDto>) servletContext.getAttribute(Constants.APP_CONTEXT_STORIES);
        return new StoriesView(stories);
    }

}

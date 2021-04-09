/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jos.freepaper.service.epub;

/**
 *
 * @author wuesand
 */
public class EPubFileDto {

    private String directory = null;

    private String name = null;

    private boolean isTemplate = false;

    public EPubFileDto(String directory, String name, boolean isTemplate) {
        this.directory = directory;
        this.name = name;
        this.isTemplate = isTemplate;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

}

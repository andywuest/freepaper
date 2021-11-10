package de.jos.freepaper.service.epub;

/**
 * @author wuesand
 */
public class EPubFileDto {

    private final String directory;
    private final String name;
    private final boolean template;

    public EPubFileDto(String directory, String name, boolean template) {
        this.directory = directory;
        this.name = name;
        this.template = template;
    }

    public String getDirectory() {
        return directory;
    }

    public String getName() {
        return name;
    }

    public boolean isTemplate() {
        return template;
    }

}

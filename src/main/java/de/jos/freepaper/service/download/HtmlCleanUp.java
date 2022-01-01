package de.jos.freepaper.service.download;

public class HtmlCleanUp {

    public String removeAllEmptyTags(String source) {
        final String result = removeEmptyTags(source);
        if (source.length() != result.length()) {
            return removeAllEmptyTags(result);
        }
        return result;
    }

    public String removeEmptyTags(String source) {
        String result = source.replaceAll("<div>\\s*</div>", "");
        return result;
    }

    public String removeAllLinks(String source) {
        return source.replaceAll("</a>", "").replaceAll("<a>", "");
    }

}

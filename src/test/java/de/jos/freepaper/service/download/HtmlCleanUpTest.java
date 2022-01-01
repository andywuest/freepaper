package de.jos.freepaper.service.download;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HtmlCleanUpTest {

    @Test
    public void removeEmptyTags() {
        HtmlCleanUp cleanup = new HtmlCleanUp();
        assertThat(cleanup.removeEmptyTags("<div></div>")).isEqualTo("");
        assertThat(cleanup.removeEmptyTags("   <div></div>   ")).isEqualTo("      ");
        assertThat(cleanup.removeEmptyTags("\n<div></div>\t")).isEqualTo("\n\t");
    }

    @Test
    public void removeAllEmptyTags() {
        HtmlCleanUp cleanup = new HtmlCleanUp();
        assertThat(cleanup.removeAllEmptyTags("<div></div>")).isEqualTo("");
        assertThat(cleanup.removeAllEmptyTags("<div><div></div></div>")).isEqualTo("");
        assertThat(cleanup.removeAllEmptyTags("  <div><div>\n </div>\t</div>\t")).isEqualTo("  \t");
    }


}
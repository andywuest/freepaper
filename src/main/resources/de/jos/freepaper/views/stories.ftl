<#-- @ftlvariable name="story" type="de.jos.freepaper.service.epub.StoryDto" -->
<!DOCTYPE html>
<html>
<body>

<a href="/EPubDownloadServlet" target="_blank">Download</a>
<a href="">Delete all stories</a>

<ul>
  <#list stories as story>
    <li>${story.title} 
       <a href="/story/${story?index}" target="_blank">view</a>
       <a href="/storyRemoval/${story?index}" target="_blank">delete</a>
    </li>
  </#list>
</ul>

</body>
</html>

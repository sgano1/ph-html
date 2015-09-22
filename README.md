#ph-html

Java library to dynamically create HTML and JavaScript content using an XML tree. Base interface is `IHCNode` and start class for creation is `HCHtml`.

Contained subprojects are:
  * ph-html - IHC* interfaces, HTML attributes and elements
  * ph-html-jscode - a Java code model to build structured JS code
  * ph-html-jquery - an extension to ph-html-jscode to also support jQuery 

Versions <= 4.7.4 are compatible with ph-commons < 6.0.
Versions >= 5.0.0 are compatible with ph-commons >= 6.0.

#Maven usage
Add the following to your pom.xml to use this artifact:
```
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html</artifactId>
  <version>5.0.3</version>
</dependency>
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html-jscode</artifactId>
  <version>5.0.3</version>
</dependency>
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html-jquery</artifactId>
  <version>5.0.3</version>
</dependency>
```

---

On Twitter: <a href="https://twitter.com/philiphelger">Follow @philiphelger</a>

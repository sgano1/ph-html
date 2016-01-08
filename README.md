#ph-html

[![Build Status](https://travis-ci.org/phax/ph-html.svg?branch=master)](https://travis-ci.org/phax/ph-html)
﻿

Java library to dynamically create HTML and JavaScript content using an XML tree. Base interface is `IHCNode` and start class for creation is `HCHtml`.

Contained subprojects are:
  * ph-html - IHC* interfaces, HTML attributes and elements
  * ph-html-jscode - a Java code model to build structured JS code
  * ph-html-jquery - an extension to ph-html-jscode to also support jQuery 

Versions <= 4.7.4 are compatible with ph-commons < 6.0.
Versions >= 5.0.0 are compatible with ph-commons >= 6.0.
Versions >= 6 require JDK 8. Please note that Java 1.8.0_31 has problems compiling the sources. Please update to a later version of the compiler. 

#Maven usage
Add the following to your pom.xml to use this artifact:
```
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html</artifactId>
  <version>5.1.1</version>
</dependency>
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html-jscode</artifactId>
  <version>5.1.1</version>
</dependency>
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-html-jquery</artifactId>
  <version>5.1.1</version>
</dependency>
```

---

On Twitter: <a href="https://twitter.com/philiphelger">Follow @philiphelger</a>

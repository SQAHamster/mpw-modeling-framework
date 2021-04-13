# MPW Modeling Framework - Release Checklist

## New Release of Source Code

* replace pom.xml versions
* replace MANIFEST.MF versions
* replace plugin.xml versions
* commit with pattern: "Version X.Y.Z"
* create tag on master

## Updatesite

* wait until updatesite is built on GitHub
* switch to branch "mpw-updatesite"
* replace files from remote branch "mpw-updatesite-snapshot"
* commit with pattern "Updatesite: Version X.Y.Z"
* tag with pattern "X.Y.Z-updatesite"

## C++ Framework

* wait until C++ Framework is built on GitHub
* switch to branch "mpw-cpp-framework"
* replace files from remote branch "mpw-cpp-framework-snapshot"
* commit with pattern "C++ Framework: Version X.Y.Z"
* tag with pattern "X.Y.Z-cpp-framework"

## Set new SNAPSHOT Version

* replace pom.xml versions to next snapshot
* replace MANIFEST.MF versions to next snapshot
* replace plugin.xml versions to next snapshot
* commit with pattern: "Version X.Y.Z-SNAPSHOT"

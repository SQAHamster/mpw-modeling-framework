# MPW Modeling Framework - Release Checklist

## New Release of Source Code

* replace versions (adapt/run update-versions.kts)
* commit with pattern: "Version X.Y.Z"
* create tag on master

## Updatesite

* updatesite-tag will be handled by GitHub Actions automatically

## C++ Framework

* cpp-framework-tag will be handled by GitHub Actions automatically

## Set new SNAPSHOT Version

* replace pom.xml versions to next snapshot
* replace MANIFEST.MF versions to next snapshot
* replace plugin.xml, feature.xml versions to next snapshot
* commit with pattern: "Version X.Y.Z-SNAPSHOT"

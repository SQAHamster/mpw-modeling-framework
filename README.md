# poly-hamster-simulator
Polyglot hamstersimulation, which is based on a Model-Driven-Engineering approach to allow the support of multiple target languages like Java and C++.

## Java Version

The project is developed with JDK 14. Ensure that Eclipse has mapped a JavaSE-14.

Note: Eclipse can be started with a custom Java Runtime by specifying the `-vm` property in the `eclipse.ini` file

Example: 
```
-vm
<path-to-jdk>/bin
```

## Installed Eclipse Plugins

* Eclipse Modeling Tools - 2020-09
    * https://www.eclipse.org/downloads/packages/release/2020-09/r/eclipse-modeling-tools
* QVT Operational SDK - 3.10.2
    * Update site: https://download.eclipse.org/releases/latest
* OCL Examples and Editors SDK - 6.12.0
    * Update site: https://download.eclipse.org/releases/latest
* Xpand SDK	- 2.2.0
    * Update site: https://download.eclipse.org/releases/latest
* Xpand/Xtend Additional Support - 2.2.0
    * Update site: https://download.eclipse.org/modeling/m2t/xpand/updates/
* Xtext Complete SDK - 2.23.0
    * Update site: https://download.eclipse.org/releases/latest
    * if later downloading of ANTLR parser generator failed, also install `Xtext Antlr Runtime Feature` from http://download.itemis.com/updates/
* Henshin SDK (Incubation) - 1.7.0
    * Update site: http://download.eclipse.org/modeling/emft/henshin/updates/nightly
* C/C++ Development Tools - 10.1.0.202012020953
    * https://download.eclipse.org/tools/cdt/releases/10.1/

### Optional: Setup Maven

* m2e: Maven integration in Eclipse - 1.16.1
    * Update site: https://download.eclipse.org/releases/latest
* Tycho Project Configurators - 0.8.1
    * under Preferences / Maven / Discovery / Open Catalog, search for the Tycho Configurators and install them 

## Setup

Note: after checkout there are many errors due to ungenerated files. They shall disappear after the following steps.
Simply click "Proceed" when a dialog occurs due to errors.

* run QueryDsl workflow generation
    * `de.unistuttgart.iste.sqa.mpw.modeling.querydsl/src/de/unistuttgart/iste/sqa/mpw/modeling/querydsl/GenerateQueryDsl.mwe2`

* run genmodels for "generate model code"
    * `de.unistuttgart.iste.sqa.mpw.modeling.mpw/model/mpw.genmodel`
    * `de.unistuttgart.iste.sqa.mpw.modeling.transformations/model/transformations.genmodel`
    * `de.unistuttgart.iste.sqa.mpw.modeling.transformations/model/inputs/inputs.genmodel`

* run final generation
    * `de.unistuttgart.iste.sqa.mpw.modeling.generator/src/workflow/generator.mwe2`

* open target project in the IDE of choice
    * Java: by Maven: `de.unistuttgart.iste.sqa.mpw.hamstersimulator.java`

* run unit tests
    * Java: under `/core/src/test/java`

Note: Xpand / Xtend may still show some phantom errors in `de.unistuttgart.iste.sqa.mpw.modeling.generator/src/template` after successful generation. This errors can simply be ignored or removed by editing (e.g. inserting a dummy space character) the files marked with error and then save them.
      Currently I don't know why this errors occur and how to prevent them.

## Running QueryDSL editor

* right click on project `de.unistuttgart.iste.sqa.mpw.modeling.querydsl`
* run as Eclipse Application
    * note: ensure that in the run configuration the Java JDK 14 is used
* import project in the runtime eclipse workspace
    * browse to the development workspace
    * select the `de.unistuttgart.iste.sqa.mpw.modeling.queries` project
* double click on any `*.query` file, it shall be opened with syntax highlighting
    
# poly-hamster-simulator
Polyglot hamstersimulation, which is based on a Model-Driven-Engineering approach to allow the support of multiple target languages like Java and C++.

## Installed Eclipse Plugins

* Eclipse Modeling Tools
* QVT Operational SDK - 3.10.2
    * https://download.eclipse.org/releases/latest
* Xpand SDK	- 2.2.0
    * https://download.eclipse.org/releases/latest
* Xtext Complete SDK - 2.23.0
    * https://download.eclipse.org/releases/latest
* Henshin SDK (Incubation) - 1.7.0.202010191056
    * from http://download.eclipse.org/modeling/emft/henshin/updates/nightly
    
## Setup

* run genmodels for "generate model code"
    * `de.unistuttgart.iste.sqa.mpw.modeling.mpw/model/mpw.genmodel`
    * `de.unistuttgart.iste.sqa.mpw.modeling.transformations/model/transformations.genmodel`

* run QueryDsl workflow generation
    * `de.unistuttgart.iste.sqa.mpw.modeling.queries/src/de/unistuttgart/iste/sqa/mpw/modeling/queries/GenerateQueryDsl.mwe2`
    
* run final generation
    * `de.unistuttgart.iste.sqa.mpw.modeling.generator/src/workflow/generator.mwe2`

* open target project in the IDE of choice
    * Java by Maven: `de.unistuttgart.iste.sqa.mpw.hamstersimulator.java`
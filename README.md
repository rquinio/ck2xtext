# Ck2Xtext [![Build Status](https://travis-ci.org/rquinio/ck2xtext.svg)](https://travis-ci.org/rquinio/ck2xtext)

### An [Xtext](https://www.eclipse.org/Xtext/) grammar for Crusader Kings 2 [modding files](http://www.ckiiwiki.com/Modding).

From a [grammar file](ck2xtext/src/Ck2.xtext), the project generates:

- a bi-directional parser
- a Java bean model, based on the parsed AST
- an Eclipse plugin editor for CK2 files (with colorization, folding, outline, brackets matching, formatter, ...)

Due to the structure of CK2 scripts, the grammar is very generic:

- As files share the same extension (.txt), they have to be managed by a single editor plugin, due to Eclipse extension API not allowing to easily chose an editor based on the file path.
- As files have no distinctive root elements to indicate their type, it is not possible to describe the CK2 syntax in a single non-ambiguous grammar.

As such the error detection is minimal, and integrated documentation for scripting keywords or functions is inexistent.

### Users

To be able to use the plugin, the minimum requirements are: 

- Java 8
- Eclipse 4.4 (Luna)

The plugin is not hosted on a public update site yet, and so has to be built locally (see below).

### Developers

To build a clone of this project, the minimum requirements are: 

- [Maven](https://maven.apache.org) 3.5
- Java 8
- Eclipse with [Xtext plugin](https://www.eclipse.org/Xtext/download.html) 2.14

To build locally: 

- From Maven: *mvn install*
- From Eclipse: Run-as "MWE2 Workflow" on *ck2xtext/ck2xtext/src/GenerateCk2.mwe2* (grammar-only)

To test the editor:

- Run-as "Eclipse Application" on *ck2xtext.ui* project
- Via a local Eclipse update site generated by the build: *ck2xtext/ck2xtext.repository/target/repository/*
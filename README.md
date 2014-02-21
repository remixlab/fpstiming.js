FPSTiming.js
============

# Description

fps-based timing.

A sequential single-threaded timer on top of which Proscene animations 
and timing routines are built.

# Usage

# Hacking

## Initial setup (you don't need this!)

First (and only) time setup. This is just for documentation purposes. Please visit the next sections.

```sh
git clone https://github.com/remixlab/fpstiming.js.git
cd fpstiming.js
git remote add -f fpstiming https://github.com/remixlab/fpstiming_tree.git
git subtree add --prefix src/remixlab/fpstiming fpstiming master --squash
git remote add -f processing.js https://github.com/remixlab/processing.js_tree.git
git subtree add --prefix src/processing processing.js master --squash
```

## Read-only access setup

Use it as any other basic github repo, i.e.,:

```sh
# clone it:
git clone https://github.com/remixlab/fpstiming.js.git
cd fpstiming.js
# pull changes in:
# for pull requests simply refer to: https://help.github.com/articles/using-pull-requests
```

## Read-write access setup

Clone the repo and add the remotes (here we refer to them as ["subtrees"](http://blogs.atlassian.com/2013/05/alternatives-to-git-submodule-git-subtree/)):

```sh
git clone https://github.com/remixlab/fpstiming.js.git
cd fpstiming.js
git remote add -f fpstiming https://github.com/remixlab/fpstiming_tree.git
git remote add -f processing.js https://github.com/remixlab/processing.js_tree.git
```

Update from time to time:

```sh
#fetching command:
git fetch fpstiming master
git subtree pull --prefix src/remixlab/fpstiming fpstiming master --squash
```

To contribute back to upstream:

```sh
git push
```

To contribute to the fpstiming subtree

```sh
git subtree push --prefix=src/remixlab/fpstiming fpstiming master
```

To contribute to the processsing.js subtree

```sh
git subtree push --prefix=src/processing processing.js master
```


##  Compiling and export to Javascript  ##

**GWT**

You must have [Google Web Toolkit](http://www.gwtproject.org/) , either GWT SDK or Eclipse GWT plugin. You must be sure that the project is using GWT, select 
project properties -> Google -> Web Toolkit -> Use Google Web Toolkit, in Eclipse.

You must resolve the external jar library references, configuring the Libraries tab in the Java build path option on your Eclipse IDE.

Choosing  the external jar entry, you must select it on the local folder  
   

> fpstiming.js\lib\
    
**GWT XML**

All code to export must be in a Gwt Module, a module consists of the java packages and classes, and a gwt xml where are appointed the java packages to export.
The default xml is :

> fpstiming.js\src\remixlab\fpstiming.gwt.xml

For example the entry in the xml

    <source path="fpstiming"/>

refers to the java package

> fpstiming.js\src\remixlab\fpstiming

The xml must be located one folder up of the java packages.
The xml module can refer to others gwt modules, more info on [here](http://www.gwtproject.org/doc/latest/DevGuideOrganizingProjects.html#DevGuideModuleXml)

**Exporting**

Selecting the project by right-clicking and choosing Google > GWT Compile.



##  Run, modify and create examples  ##


You can see running the example running the html file in the war folder, to modify and create the examples you must have [ProcessingStub](https://github.com/remixlab/ProcessingStub) and  resolve references, (external jars).
 
you can go to the file
> fpstiming.js\examples\TestFPS\war\Animation2D.html

And run the example,  there is a wrapper of the sketch called a2d, 
 if you want modify the sketch or create new objects, you must do it in java and export to js.


On the file

> fpstiming.js\examples\TestFPS\src\main\client\Animation2D.java

you can modify the sketch, if you create a new method, you must add it to the abstract class ActionDrivenCallbackFacade  in the file

> fpstiming.js\examples\TestFPS\src\main\client\ExporterFacade.java

if you create new objects  for the sketch, it is not necessary to add the ExporterFacade.java, because the only thing that need to run is the ActionDrivenCallbackFacade


# Acknowledgements

Cesar Colorado for the js port.

# Author, core developer and maintainer

[Jean Pierre Charalambos](http://disi.unal.edu.co/profesores/pierre/), [National University of Colombia](http://www.unal.edu.co)

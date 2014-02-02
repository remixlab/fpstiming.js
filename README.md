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

# Acknowledgements

Cesar Colorado for the js port.

# Author, core developer and maintainer

[Jean Pierre Charalambos](http://disi.unal.edu.co/profesores/pierre/), [National University of Colombia](http://www.unal.edu.co)

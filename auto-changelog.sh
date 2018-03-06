#!/bin/sh

if [[ $(git tag -l "$APP_VERSION") != $APP_VERSION ]]; then
	echo "===================================================================SIIIIIIIIIIIIIIIIIIIII====================================================="
	cd ..
	git clone --depth=2 --branch=gh-pages https://github.com/$GIT_REPO.git repo
	cd repo
	mkdir changelogs
	cd changelogs
	auto-changelog -o CHANGELOG-$APP_VERSION.md -l false
	cd ..
	git add .
	git commit -m "Changelog v$APP_VERSION"
	git push "https://$GIT_KEY@github.com/$GIT_REPO.git"
	cd ..
	cd $GIT_REPO
fi

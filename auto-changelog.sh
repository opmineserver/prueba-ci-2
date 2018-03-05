#!/bin/sh

if [[ $(git tag -l "$APP_VERSION") != $APP_VERSION ]]; then
	echo "===================================================================SIIIIIIIIIIIIIIIIIIIII====================================================="
	git branch
	git checkout -b gh-pages
	git branch
	git fetch
	mkdir changelogs
	cd changelogs
	auto-changelog -o CHANGELOG-$APP_VERSION.md -l false
	cd ..
	git add .
	git commit -m "Changelog v$APP_VERSION"
	git push "https://$GIT_PASS@${GIT_REPO}" gh-pages
	git checkout master
	git tag -a v$APP_VERSION -m "v$APP_VERSION"
fi

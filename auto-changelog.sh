#!/bin/sh

if [[ $(git tag -l "$APP_VERSION") != $APP_VERSION ]]; then
	echo "===================================================================SIIIIIIIIIIIIIIIIIIIII====================================================="
	git fetch origin gh-pages
	git checkout -b gh-pages HEAD
	mkdir changelogs
	cd changelogs
	auto-changelog -o CHANGELOG-$APP_VERSION.md -l false
	cd ..
	git add .
	git commit -m "Changelog v$APP_VERSION"
	git push "https://$GIT_USER:$GIT_PASS@github.com/$GIT_REPO.git" gh-pages
	git checkout master
fi

#!/bin/sh

if [ $(git tag -l "$APP_VERSION") != $APP_VERSION ]; then
	echo "===================================================================SIIIIIIIIIIIIIIIIIIIII====================================================="
	git checkout gh-pages
	auto-changelog -o changelogs/CHANGELOG-$APP_VERSION.md -l false
	git add .
	git commit -m "Changelog v$APP_VERSION"
	git push "https://$GIT_PASS@${GIT_REPO}" gh-pages > /dev/null 2>&1
	git checkout master
	git tag -a v$APP_VERSION -m "v$APP_VERSION"
fi

echo "===================================================================NOOOOOOOOOOOOO====================================================="
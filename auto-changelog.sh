#!/bin/sh

if [ $(git tag -l "$APP_VERSION") ]; then
	git checkout gh-pages
	auto-changelog -o changelogs/CHANGELOG-$APP_VERSION.md -l false
	git push "https://$GIT_PASS@${GIT_REPO}" gh-pages > /dev/null 2>&1
	git tag -a v$APP_VERSION -F changelogs/CHANGELOG-$APP_VERSION.md
	git checkout master
fi
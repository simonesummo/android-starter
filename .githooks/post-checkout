#!/bin/sh

if [ "$3" != "1" ]; then
    exit 0
fi

BRANCH=$(git branch --show-current)

case "$BRANCH" in
    main|develop)
        exit 0
        ;;
esac

if echo "$BRANCH" | grep -Eq '^(feature|fix|hotfix)/[0-9]+-[a-z0-9-]+$'; then
    exit 0
fi

if echo "$BRANCH" | grep -Eq '^release/[0-9]+\.[0-9]+\.[0-9]+$'; then
    exit 0
fi

echo "❌ Invalid branch name: $BRANCH"
echo ""
echo "Expected formats:"
echo "<type>/<issue-number>-<short-description>"
echo "release/<version>"
echo ""
echo "Examples:"
echo "feature/12-add-login-screen"
echo "fix/24-fix-navigation-crash"
echo "release/1.0.0"

if [ -n "$(git status --porcelain)" ]; then
    STASH_NAME="invalid-branch-$BRANCH"

    echo ""
    echo "⚠️ Uncommitted changes detected."
    echo "Creating stash: $STASH_NAME"

    git stash push -u -m "$STASH_NAME"
fi

echo ""
echo "Switching back to previous branch..."
git checkout @{-1}

exit 1
#!/bin/sh

MAX_LENGTH=50
COMMIT_MSG_FILE=$1
COMMIT_MSG=$(cat "$COMMIT_MSG_FILE")
SUBJECT=$(head -n 1 "$COMMIT_MSG_FILE")

if [ ${#SUBJECT} -gt ${MAX_LENGTH} ]; then
    echo "❌ Commit subject is too long (${#SUBJECT}/${MAX_LENGTH} characters)"
    exit 1
fi

if echo "$COMMIT_MSG" | grep -Eq '^(feat|fix|refactor|chore|docs): [a-z].+'; then
    exit 0
fi

echo "❌ Invalid commit message:"
echo "\"$COMMIT_MSG\""
echo ""
echo "Expected format:"
echo "<type>: <imperative description>"
echo ""
echo "Allowed types:"
echo "- feat"
echo "- fix"
echo "- refactor"
echo "- chore"
echo "- docs"
echo ""
echo "Examples:"
echo "feat: add login screen"
echo "fix: handle empty response"
echo "refactor: simplify navigation flow"
echo "chore: update dependencies"
echo "docs: update setup instructions"

exit 1
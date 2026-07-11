#!/bin/sh

set -e

HOOKS_DIR=".githooks"

echo "Configuring Git hooks..."

git config core.hooksPath "$HOOKS_DIR"

echo "Git hooks configured successfully."
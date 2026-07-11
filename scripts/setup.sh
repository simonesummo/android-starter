#!/bin/sh

set -e

echo "Configuring Git hooks..."

git config core.hooksPath .githooks
chmod +x .githooks/*

echo "Setup completed successfully."
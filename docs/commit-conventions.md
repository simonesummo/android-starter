# Commit Conventions

## Format

`<type>: <short description>`

## Supported Types

### feat
New feature (or significant architectural or setup change)

```
feat: add feature-home module
feat: implement navigation setup
feat: add compose base theme
```

### fix
Bug or unexpected behavior

```
fix: navigation crash on back press
fix: incorrect DI scope in ViewModel
```

### refactor
Internal structural changes without behavior change

```
refactor: move network layer into core-network module
refactor: simplify HomeViewModel state handling
```

### chore
All technical, non-functional changes

```
chore: setup gradle version catalog
chore: configure detekt rules
chore: add koin dependency
```

### test
Added or modified tests

```
test: add ViewModel unit tests for Home
```

### docs
Documentation updates only

```
docs: update android-starter README
docs: add architecture decision notes
```

## Rules of thumb

- If behavior changes → feat / fix
- If structure changes → refactor
- If no functional change → chore
- If documentation only → docs

## Guidelines

- Use the imperative mood (e.g. "add", not "added")
- Keep the subject line concise and meaningful
- Keep the commit subject under 50 characters
- Prefer small and focused commits
- Do not mix unrelated changes in a single commit

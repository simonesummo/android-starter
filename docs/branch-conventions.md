# Branch Naming Convention

This project follows a Git Flow based branching strategy. Every development branch must follow a consistent naming convention to improve traceability between branches and GitHub Issues.

## Branch Format

`<type>/<issue-number>-<short-description>`

#### Example:
```
feature/12-add-login-screen
fix/24-fix-navigation-crash
release/1.0.0
hotfix/42-fix-production-crash
```

## Supported Branch Types

### feature

Used for new features, improvements, or significant functionality changes.

#### Examples:
```
feature/12-add-login-screen
feature/18-implement-navigation
```

### fix

Used for bug fixes and unexpected behavior corrections.

#### Examples:
```
fix/24-fix-navigation-crash
fix/31-correct-validation-error
```

### hotfix

Used for urgent fixes that need to be applied directly to a production release.

#### Examples:
```
hotfix/42-fix-production-crash
```

### release

Used for preparing a new application release and stabilizing the code before merging into main.

#### Examples:
```
release/1.0.0
release/1.1.0
```

## Branch Naming Rules

* Every development branch must reference an existing GitHub Issue.
* The issue number must be included immediately after the branch type.
* The branch description must be short, meaningful, and written in kebab-case.
* Branch names must use lowercase characters only.
* Spaces and special characters are not allowed.
* The branch type must be one of the supported types:
    * `feature`
    * `fix`
    * `hotfix`
* `release` is not considered a development branch and therefore follows a different naming pattern:\
  `release/<version>`

## Protected Branches

The following branches are reserved:

* `main`: stable production-ready code.
* `develop`: integration branch for completed features.

Direct development work should not happen on protected branches. All changes must be performed through dedicated branches and merged through Pull Requests.
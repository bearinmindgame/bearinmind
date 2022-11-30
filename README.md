# Bear in Mind

2D adventure game written in Java.

## Building from source

### Prerequisites

You need the following tools installed to build the game from source:

- Java JDK (17 recommended)
- Apache Ant

### Building

Use the following command to build the game:

```shell
ant build
```

The generated jar file will be located in the `out` folder.

> The `build` argument can be omitted because it is the default target.

### Testing

To run the unit tests, run the following command:

```shell
ant test
```

Apart from the console output, test reports will be saved to `out/test-report` in XML format.

## Contributing to the project

### Commit messages

Commit messages should be written with the syntax below. Commits not following the synax will be ignored during versioning and changelog generation.

```txt
type: description of changes (#issuenumber)
```

where the valid types are:

- `breaking` (breaking changes, new major version)
- `feat` (new features, new minor version)
- `fix` (bug fixes)
- `test` (new tests written)
- `revert`
- `refactor` (when there is no functional change)
- `docs` (javadoc, readme etc)
- `build` (build.xml)
- `ci` (github workflows)
- `chore` (only by actions)
- `other`

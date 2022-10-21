# Bear in Mind

> This branch is for testing GitHub Actions. This will be deleted, don't merge here.

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

# jackson-proguard
## Basic Usage
Probably the most useful of invocation is:

`./gradlew --info disassemble runLocal`

This will compile the simple example of a `Model` class with various Jackson `JsonProperty`
annotations, run it through ProGuard, and then disassemble the `Model` class and print a
serialized `Model` object.

# File IO

1. Files exercise

    Create a `FileHandler` class in the `util` package, we will use this class
    to handle all kinds of file operations. The class should have 2 private
    properties: directory, filename, don't forget to handle the exceptions.

    1. Create a method to create the file if it does not exist.
    1. Create a method to create the directory if it does not exist.
    1. Create a method for retrieving file contents as a List of Strings.
    1. Create a method to write (append) new contents to a file. This method
       could have an optional parameter to choose between appending the contents
       of the file or not.

    Your class should conform to the interface below:

    ```java
    interface HandlesFiles {
        List<String> slurp(String filename);
        void spit(String filename, List<String> contents);
        void spit(String filename, List<String> contents, boolean append);
    }
    ```

    Note that no IO expceptions are in the method signatures. This means your
    implementation should handle those exceptions, and not expose them.

    Create a `FileHandlerTest` class so you can test your work.

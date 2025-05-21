# GPA Dictionary Generator

A simple Java command-line program that allows users to input and look up student GPAs using a HashMap. The program validates GPA entries, ensures valid name lookups, and continuously prompts the user for GPA queries after setup.

## Features

- Enter any number of student name–GPA pairs
- Validates GPA input (must be between 0.0 and 4.0)
- Prevents invalid name lookups by re-prompting
- CLI-based user interaction using Scanner
- Infinite loop for repeated GPA lookups

## File Structure

src/  
└── gpa_dictionary_generator/  
  └── Main.java

## How to Run

1. Download or clone this repository.
2. Navigate to the project directory in your terminal.
3. Compile the program:
4. Run the program:

## Future Improvements

- Add "exit" command to quit
- Add "list all" feature to display all entries
- Allow name editing or GPA updates
- Save/load GPA data to a file
- Port to Python for practice

## Technologies Used

- Java 21
- HashMap
- Scanner (console input)

# DNA Color Balance Calculator

## Description

The DNA Color Balance Calculator is a Java application designed to evaluate combinations of artificial DNA sequences in the context of Next Generation Sequencing (NGS). The application reads multiple DNA sequences base-by-base and determines the visibility of each base under red and green laser light.

## Features

- Supports input of multiple DNA sequences of variable length.
- Calculates the visibility of each DNA base under red and green lasers for each cycle.
- Outputs the count of visible sequences under each laser per cycle.
- Handles invalid sequence input gracefully.
- Uses an enumeration for efficient and type-safe visibility checks.

## Getting Started

### Prerequisites

- Java Development Kit (JDK), version 8 or later.

### Installation

1. Clone the repository to your local machine using:
   ```sh
   git clone https://github.com/hasnainmdeen/color-balance-calculator.git

### Usage
1. Navigate to the directory containing the project.
2. Compile the Java program:
   ```sh
   javac org/example/DNAColorBalance.java

3. Run the compiled program:
   ```sh
   java org/example/DNAColorBalance.java

4. Enter the DNA sequences one by one, pressing `Enter` after each sequence. When you are finished, enter an empty line to proceed with the calculation.
5. The program will output the color balance for each cycle, indicating how many sequences are visible under the red and green lasers.

#### Input Format

- The DNA sequences should be entered in capital letters without spaces. Each base should be one of `A`, `T`, `C`, or `G`.
- Example of a valid input sequence:
   ```sh
  AGTCAGTAC

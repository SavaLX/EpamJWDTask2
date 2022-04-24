Information handling

Develop an application that parses and processes text.
-------------------------------------
You need to create an application that parses text from a programming textbook from a file and allows you to perform three different operations on the text. 

-----------------------------------

General requirements for the project: 

The parsed text must be presented as an object (text) containing, for example, sentences and code blocks, the sentence may contain the words of the sentence. The words of a sentence (parts of a sentence) can be, for example, simple punctuation words. These classes are entity classes and should not be overloaded with logic methods.

The parsed text must be restored in its original form, with the exception of spaces between elements. Spaces and tabs may be replaced by a single space during parsing. 

Regular expressions should be used to divide text into sentences and other parts. Don't forget that application regular expressions are literal constants. 

The code that breaks the text into its component parts should be formatted as parser classes. 

When developing parsers that parse text, it is necessary to keep track of the number of parser objects created. 

When implementing a job, you can use the Composite and Chain of Responsibility patterns. 

When handling exceptions, the application must use the Log4j logger. 

The created application should allow implementing a group of tasks for working with overtext (tasks are given below) without “rewriting” the existing code.


-----------------------------------------------
Functionality, options for implementation:

2. Output all sentences of the given text in ascending order of the number of words in each of them.

Command Pattern
==============

“An object that contains a symbol, name or key that represents a list of commands, actions or keystrokes”. 
This is the definition of a macro, one that should be familiar to any computer user. From this idea the 
Command design pattern was given birth. 
The Macro represents, at some extent, a command that is built from the reunion of a set of other commands, 
in a given order. Just as a macro, the Command design pattern encapsulates commands (method calls) in 
objects allowing us to issue requests without knowing the requested operation or the requesting object. 
Command design pattern provides the options to queue commands, undo/redo actions and other manipulations.

Motivation
==============

At one point or another we all find ourselves looking back on our code and sometimes wondering how we ended 
up with a lengthy IF-THEN-ELSE statement block. It’s a normal part of coding, but in some cases there are 
good reasons and opportunities to clean this type of code up a bit.
On a recent java project, I noticed a few of these situations inside the controller methods, where 
it might check if the user clicked Button A to POST the form then do X, else if he clicked Button B, do Y, etc. 
Now, when there are only 1 or 2 of these IF branches, no big deal. In fact, one could argue it is easy to read / maintain. 
Thus, if it fits, the (Keep It Simple) KISS principle applies.
However, upon closer review, you may not only have a series of IF-THEN-ELSE blocks, but at the top or bottom of your 
method, you may have extra code going on, which may or may not affect the logic inside your IF statements depending on 
how it’s written. As you can see, if this were the case, it could lead to some ‘unexpected’ results if not well-maintained.
Looking for a cleaner way to replace this scenario (and thus make the code more maintainable ultimately), I came across the 
following post. While written for Java developers, the message and code applies the same for C#. The basic solution here 
involves swapping out your IF-THEN-ELSE blocks with ‘Commands’ and using a Command ‘Map’ that figures out which Command to 
call based on the appropriate switch value.
While you should always be on the lookout for ‘over engineering’ your code and be careful not to jump to using Design 
Patterns ‘everywhere’, there are times when the use of one (such as this one) may simplify your code, make it less coupled 
to other code blocks, and make it easier for other developers in the future to read and maintain, which should always be a 
goal to strive for.

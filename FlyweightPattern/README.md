# Flyweight Pattern

### What Flyweight Pattern is and what it is used for?

Flyweight pattern is one of the structural design patterns as this pattern provides ways to decrease object count thus improving application required objects structure. Flyweight pattern is used when we need to create a large number of similar objects. One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been constructed.

A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects; it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory. Often some parts of the object state can be shared, and it is common practice to hold them in external data structures and pass them to the objects temporarily when they are used.

A classic example usage of the flyweight pattern is the data structures for graphical representation of characters in a word processor. It might be desirable to have, for each character in a document, a glyph object containing its font outline, font metrics, and other formatting data, but this would amount to hundreds or thousands of bytes for each character. Instead, for every character there might be a reference to a flyweight glyph object shared by every instance of the same character in the document; only the position of each character (in the document and/or the page) would need to be stored internally.

Another example is string interning.

In other contexts the idea of sharing identical data structures is called hash consing.

#### What problems can the Flyweight design pattern solve?
* Large numbers of objects should be supported efficiently.
* Creating large numbers of objects should be avoided.

#### What solution does the Flyweight design pattern describe? 
Define `Flyweight` objects that  
* store intrinsic (invariant) state that can be shared and
* provide an interface through which extrinsic (variant) state can be passed in.

### Flow diagram
![Flow diagram](flowchart.png)
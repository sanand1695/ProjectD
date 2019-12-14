# ProjectD

First modify a binary search tree so that it allows duplicates. Then, use this new binary search tree to organize records from a big data set.

This project has two parts. In Part A, you will write the binary search tree class. In Part B, you'll use the class to analyze a data set.


Part A Description:
The class BinarySearchTreeWithDups represents a binary search tree in which duplicate entries are allowed.

Process for Adding Duplicates
A duplicate entry is placed in the entry's left subtree. The process for adding to this new binary tree is:

Compare the new element to the current element.
If the new element is smaller, go into the left subtree. Return to step 1.
If the new element is larger, go into the right subtree. Return to step 1.
Note: This is the same process used in a regular binary search tree.
If the new element is equal to the current element:
Go into the left subtree. Return to step 1.
Review the provided tree picture that uses data from the driver to make sure you understand how the duplicates are added.

The BinarySearchTreeWithDups Class
We will assume the getEntry method returns the first match it finds and the remove method removes the first match it finds. So the only modification required is the add method.

The class BinarySearchTreeWithDups extends BinarySearchTree,

The class shell is provided with empty methods that you will modify.
There are many classes required to get this lab to compile.
All are included in the provided zip. 
Use the versions provided with this project!
Only modify the BinarySearchTreeWithDups class.
Do not modify other classes.
Begin by closely reviewing BinarySearchTree and BinaryTree classes.
Make sure you understand how these classes work before you implement BinarySeachTreeWithDups. 
You must have a good understanding of how the regular BST class works before you can make modifications. 
I cannot stress this point enough!


Part B Description:
Use the working BinarySearchTreeWithDups class to process a big data file.

The Data File
The data file is a list of San Francisco police incident reports for Larceny/Theft from 2003 to 2015 (downloaded from here (Links to an external site.)). There are over 370,000 records in the file. 

In eclipse, place the data file in the same folder as the src/bin folders (one level above the .java files).

Police Report Objects
The PoliceReport class represents a single report. PoliceReport objects are compared for ordering and equivalence by their date. Two reports with the same date are considered logically equivalent- "the same." You can see this in the equals and compareTo methods of the PoliceReport class.

Note: I use a somewhat clunky/hacked method of identifying search criteria (creating a "dummyRecord" with only a single criteria on which to match). The proper way to do this would be to use Comparator objects or, better yet, the Java 8 methods of filtering and matching streams. However, these programming concepts are beyond what you are expected to know for our course, so I used the more simpler (but very inelegant!) approach. Please do not take this as an endorsement of this approach!

The Driver Class
ProjectDPartBDriver reads in the data file and creates a list. It then builds trees from three different orderings of the list: sorted ascending, shuffled, and sorted descending/ 

The driver then "processes" the lists and trees by counting the number of reports that were submitted on a specified set of days. The code uses your countEntriesNonRecursive method to do this. The program displays the count results and how long the processing takes using the list and the tree.

You will run the driver program to answer the questions below.

Note: I put a limit on the number of records that are read in. On my machine, the driver completed in about 4 minutes using the limit of 100,000 records. You can adjust this limit to be smaller if needed based on your own system. You might need to lower the limit to get data to answer the questions below. (The current code uses 40,000 records.)

If you want to run the whole data file to play around with it, you can set the "using limit" variable to be false. If you do this, however, I recommend commenting out the Comparison C section, or else you'll be waiting a long time! :) 

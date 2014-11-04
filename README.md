# Githuj


**Githuj** is a program aimed to make my work with github easier. It is also a project that I am using to learn the clojure programming language

## Commands

### Index a user's repos

    $ githuj index <username> 

Index a user's repositories therby enabling one to open the required repo under 
that user with the `open` command

### Open a project under an indexed user

    $ githuj open <repo-name> 

Open the web browser and point to the repository of that particular user if it 
exists (regex match)

### Create a new repo for yourself

    $ githuj new <new-repo-name> <username> <password>

Create a new repo with the given repo name and credentials if it doesn't exist

## Disclaimer

_The project may be most definitely used to laugh at in terms of how bad the FP 
practices would be or in terms of the usage of idomatic clojure. BUT, Improvement 
is coming Mr. Wayne_

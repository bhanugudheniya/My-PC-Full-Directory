==============================================================================
tags

-> to tag the most recent commit
    git tag -a v1.0 -m "Added first tag"

-> to check all the tags
    git tag

-> to show some specific tag
    git show v1.0

-> push just tags to remote
    git push --tags origin master

================================================================================

-> to ignore some files 
    // create file named 
        .gitignore

================================================================================
fixing conflicts with git stash command

-> if some contributor had made any changes remotely on our repo 
    //and we are trying to pulling the code locally using "git pull origin master",
    // then we will encounter an error which says use git stash command

    // and before pulling the changes we made small changes to a file but not commited yet,
    // then to resolve the above issue we need to stash the changes locally and then
    // pull the code and then apply the stashed changes back and resolve merge conflicts
    // and to do that use commands written below

-> use these commands to resolve stash error
    git pull origin master     // here the error mssg will come
    git stash                  // to stash changes locally (code without commit)
    git pull origin master     // now it will work and we can add stashed changes to it
    git stash list              // to list all the stash changes
    git stash apply stash@{0}   // stash@{0} is the stash code, get it from above command
                                // now a merge conflict will arise, resolve it manually in text // editor
                                 // now you can commit and push your code


================================================================================
3 trees
-> It contain 2 concepts    
    * HEAD or Repo       
    * INDEX  or Staging Area    
    * Working Directory

-> these contain 4 states
    1. Repo = Staging = Working
    2. Repo = Staging != Working
    3. Repo != Staging = Working
    4. Repo != Staging != Working
-> state 1-------------------------------
    // if you see a message "on branch master, nothing to commit, Working tree clean", 
    // that means you are on state 1 and your working directory and staging area 
    // and repository is clean

-> state 2-------------------------------
    // to understand this we created a file three-trees.txt
    // now here  Repo = Staging != Working, coz we have not staged the changes yet

-> state 3-------------------------------
    // now we have to run, git add . command
    // now here  Repo != Staging = Working, coz we have staged the changes
    // but the repo is different

-> state 4-------------------------------
    // now we will create a additional file in order to reach state 4
    // now here  Repo != Staging != Working


================================================================================
forcing push (use carefully when working with a team)
git push --force origin master

# Ray's Adventure
[[[ReadMe is in progress, being written as I verify these steps]]]

This directory will be used to develop, test, and release the Chicago Pod's text-based game, Ray's Adventure.

From a high-level administrative perspective, we will each have a Fork of this repository, then use Pull Requests to submit and review code (merged into our local Forks), which can then be reviewed and QA tested before being eventually merged into the master repo.

To realistically and efficiently manage our project, we will be working across three branches: Develop, QA, and master. 
1. Develop will be the branch with all the latest code changes, being updated as we go (it may or may not be in a “working” state at a given time, depending on how complete merged changes are). This branch, for example, would be where we merge our changes at the end of the day so that others in the Pod can see what we’ve been working on in our local repo.
2. QA will be the latest “stable” version. Changes in this branch will be sourced from modifications in the develop branch, once those commits have been reviewed and are ready to be added to the other completed portions of the game (to be tested with the already completed game aspects to ensure that the new changes don’t break anything previously submitted).
3. Once changes have been QA tested, they will be merged from QA into the master branch, which will be the “public” version of the game (i.e., a working version that can be played with the files in their current state).

###Initial Setup
To make and prepare our Fork:
1. Navigate to [brianlarson733:master](https://github.com/brianlarson733/Great-Lakes-Support) in a browser window, then click the "Fork" button in the upper right.
2. While viewing the Fork in a browser page, copy the repo's SSH address (using the "Code v" and copy buttons)
3. Open a local terminal where the working repository will be located on your local machine (for exmaple, in a directory called /git), then execute: `git clone [copied text]` (for example, `git clone git@github.com:WilsonIsaac/Great-Lakes-Support-1.git`)
4. Add the remote "upstream" repo (what is shared between our Pod): `git remote add upstream git@github.com:brianlarson733/Great-Lakes-Support.git`


###Development and Repository Usage

To more specifically detail our steps:
1. Prior to starting for the day, we will want to checkout the branch that we are working on (for example, `git checkout -b develop`, if we are going to be adding new code changes), to ensure that we have the latest changes in the repo. Afterwards, we can make the desired changes to the local files stored on our computer (only accessible to each individual user so far). 

2. Once we’ve made desired changes to files and are ready to submit them, execute (in a terminal window inside the repository):
* `git status`
  * This will verify that we’re working on the correct branch, and what files have been modified that will or will not be committed (file names in red will not be committed, green will be committed)
* `git add .` [alternately: `git add filename` to stage specific files]
  * This will prepare/stage all files (with .) listed in the status command to be committed
* `git status`
  * Now files should be listed to be included within a commit
* `git commit -m “Message about changes”`
  * This will create the “commit” (with its individual hash), using any files that we’ve staged
* `git push origin develop`
  * This is the command that will upload our local repository content (the commit changes) to the remote repository (our Fork on GitHub)

At this point, you can check your Fork on Github and should see a note that says something like “This branch is 1 commit ahead of [brianlarson733:master](https://github.com/brianlarson733/Great-Lakes-Support).”

3. Once we are ready to begin merging our commit (or group of commits) into the develop branch, we’ll create a pull request:

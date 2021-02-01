# Ray's Adventure

This directory will be used to develop, test, and release the Chicago Pod's text-based game, Ray's Adventure.

From a high-level administrative perspective, we will each have a Fork of this repository, then use Pull Requests to submit and review code (merged into our local Forks), which can then be reviewed and QA tested before being eventually merged into the master repo.

To manage our project in a way that more realistically aligns with how clients would use GitHub, we will be working across three branches: Develop, QA, and master. 
1. `develop` will be the branch with all the latest code changes, being updated as we go (it may or may not be in a “working” state at a given time, depending on how complete merged changes are). This branch, for example, would be where we merge our changes at the end of the day so that others in the Pod can see what we’ve been working on in our local repo.
2. `QA` will be the latest “stable” version. Changes in this branch will be sourced from modifications in the develop branch, once those commits have been reviewed and are ready to be added to the other completed portions of the game (to be tested with the already completed game aspects to ensure that the new changes don’t break anything previously submitted).
3. Once changes have been QA tested, they will be merged from QA into the `master` branch, which will be the “public” version of the game (i.e., a working version that can be played with the files in their current state).

### Initial Setup

Assuming that Git has already been installed ([see here](https://grow.liferay.com/people/Environment+Setup+for+TS+Work+-+Ubuntu#section-Environment+Setup+for+TS+Work+-+Ubuntu-Git) if needed) on our local machines and we've created a GitHub account, the next step is to make and prepare our Fork:
1. Navigate to [brianlarson733:master](https://github.com/brianlarson733/Great-Lakes-Support) in a browser window, then click the "Fork" button in the upper right and select where to fork this repository (your own user's repository, in this case).
2. While viewing the Fork in a browser page, copy the repo's SSH address (using the "Code ▾" and copy buttons)
3. Open a local terminal where the working repository will be located on your local machine (for exmaple, in a directory called /git), then execute: `git clone [copied text]` (for example, `git clone git@github.com:WilsonIsaac/Great-Lakes-Support.git`). You should now have a "Great-Lakes-Support" directory present
4. Navigate in the terminal into this new directory, then add the remote "upstream" repo (what is shared between our Pod): `git remote add upstream git@github.com:brianlarson733/Great-Lakes-Support.git`
5. Now we can sync the contents of our Fork and the upstream repository: 
 * Execute `git fetch upstream` (to fetch all branches and their commits from the brianlarson733 repository), then:
 * Execute `git checkout master`  (since we're syncing our fork's master with the original repo's master)
 * Execute `git merge upstream/master`

We should now have an "up to date" fork that can be used locally and developed.

Optional, but recommended: [edit your bash to display the current directory name](https://grow.liferay.com/people/GIT+tips+and+tricks#section-GIT+tips+and+tricks-How+to+display+the+current+branch+name+in+your+prompt+on+Linux) when using the terminal.

### Development and Repository Usage

To checkout the branch we will be using to make changes (develop), simply run `git checkout develop`. Because this `develop` branch already exists in the primary repository, this will create and switch to a new branch in our fork that will be connected to the primary repository's `develop` branch. You can similarly create other new branches (if you'd like) in your personal repository by adding the -b flag; for example: `git checkout -b new-branch-name`

To more specifically detail our day-to-day coding steps:
1. Prior to starting for the day, we will want to checkout the branch that we are working on (for example, `git checkout develop`, if we are going to be adding new code changes to the `develop` branch), then sync it to ensure that we are working with the latest changes in the repo (`git fetch upstream` and `git merge upstream/develop`). After doing so, we can make the desired changes to the local files stored on our computer. 

2. Once we’ve made desired changes to files and are ready to submit them, execute (in a terminal window inside the working repository):
* `git status`
  * This will verify that we’re working on the correct branch, and what files have been modified that will or will not be committed (file names in red will not be committed, green will be committed)
* `git add .` [alternately: `git add filename` to only stage specific files]
  * This will prepare/stage all files (with `.`) listed in the status command to be committed
* `git status`
  * Now files should be listed to be included within a commit
* `git commit -m “Message about changes”`
  * This will create the “commit” (with its individual hash), using any files that we’ve staged.
* `git push origin develop`
  * This is the command that will upload our local repository content (the commit changes) to the remote repository (our Fork on GitHub)

At this point, you can check your Fork on Github and should see a note that says something like “This branch is 1 commit ahead of [brianlarson733:master](https://github.com/brianlarson733/Great-Lakes-Support).”

#### Creating a Pull Request for our changes

Once we are ready to begin merging our commit (or group of commits) into the develop branch for other pod members to use, we’ll create a pull request:
1. In GitHub, click Pull Request to open a new PR (or alternately, select the "Compare & pull request" button where you see the "`develop` had recent pushes..." message, if present, to auto-populate some values)
2. Use the base repository (brianlarson733/Great-Lakes-Support) and base branch (develop), with our fork in the head repository and the branch we are pushing changes from (develop)
3. Create a title and/or leave a comment if needed, then click "Create pull Request"
4. This will run a quick automated test to check that our changes can be merged into the `develop` branch (i.e., ensuring we didn't make changes to the same file that conflict with recently committed changes from another user). 
 * If it passes, we (or a "GitHub admin") can then merge our pull request, which will incorporate our changes into the `develop` branch (which can then be seen on other user's computers when they next sync their fork).
 * If it does not pass, it is likely due to a conflict, in which case manual actions will be needed to align the code changes with the other merged changes.

5. We can continue adding commits to a pull request until it is merged or closed, if we have additional changes to add or need to make modifications to earlier commits.

Note: After the PR is merged, you may see a "this branch is 1 commit behind" message when viewing your Fork in GitHub. This can be ignored, as since our Fork did not have the action of merging in our pushed changes, the message is expected. However, to resolve the messages we can run the following (replacing the branch name for the one being aligned):
* `git checkout master`
* `git pull upstream master`
* `git push origin master`
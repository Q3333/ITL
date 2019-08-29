# Git

> Git은 분산버전관리시스템(DVCS)이다.
>
> 소스코드의 이력을 관리한다.

- 참고 문서

  - [Git scm](https://git-scm.com/book/ko/v2)

  - [Git 입문](https://backlog.com/git-tutorial/kr/)

    

  ```
  [포탈이름](포탈주소)
  ```

  `사이에 넣으면 회색 강조 표시

  `3개(코드창) 뒤에 바로 bash같은거 쓰면 언어 설정까지 됨

## 1. git 설정

git 커밋을 하기 위해서는 초기에 작성자(author) 설정을 반드시 하여야 한다.

```
$ git config --global user.name {사용자이름}
$ git config --global user.email {사용자이메일}
```

현재 global로 설정된 환경설정을 확인하기 위해서는 아래의 명령어를 작성한다.

```
$ git config --global --list
user.email=edutak.ssafy@gmail.com
user.name=edutak
```

## 2. git 활용 기초

1. 로컬 git 저장소 설정

   ```
   $ git init
   Initialized empty Git repository in C:/Users/student/Desktop/algorithms/.git/
   (master) $
   ```

   - 해당 디렉토리에 `.git/` 폴더가 생성 된다.
   - 항상 `git init` 하기 전에는 해당 폴더가 이미 로컬 저장소인지(`(master)` 여부) 확인 하여야 한다.

2. add

   ```
   $ git add .
   $ git add README.md a.txt
   $ git add folder/
   $ git status
   On branch master
   Your branch is ahead of 'origin/master' by 1 commit.
     (use "git push" to publish your local commits)
   
   Untracked files:
     (use "git add <file>..." to include in what will be committed)
   
           Git.md
   
   nothing added to commit but untracked files present (use "git add" to track)
   ```

   - `add` 명령어를 통해서 `Working directory`에서 `INDEX(staging area)`로 특정 파일들을 이동시킨다.
   - 커밋을 할 목록에 쌓는 것이다.

3. commit

   ```
   $ git commit -m '커밋메시지'
   $ git commit
   [master a1a04a7] README 제목 작성
    1 file changed, 1 insertion(+)
   $ git log
   ```

4. 커밋 히스토리 확인하기(`log`)

   ```
   $ git log
   $ git log -2
   $ git log --oneline
   ```

5. 현재 git 상태 알아보기(`status`) **중요! 자주 입력해서 확인하자!**

   ```
   $ git status
   ```

## 3. 원격저장소(remote) 활용하기

### 1. 기초

1. remote 저장소 등록

   ```
   $ git remote add origin {github URL}
   ```

   - 원격 저장소를 `origin` 이라는 이름으로 `URL` 을 등록한다.

2. remote 저장소 확인

   ```
   $ git remote -v
   ```

3. remote 저장소 삭제

   ```
   $ git remote rm {저장소 이름}
   ```

### 2. Push - Pull

1. 원격 저장소로 보내기 (`push`)

   ```
   $ git push origin master
   ```

2. 원격 저장소로부터 가져오기(`pull`)

   ```
   $ git pull origin master
   ```

### 3. Push-Pull 시나리오

Local A, Local B, Github으로 활용을 하는 경우 원격저장소 이력과 달라져서 충돌이 발생할 수 있다. 따라서, 항상 작업을 시작하기전에 `pull` 을 받고, 작업을 완료한 이후에 `push`를 진행하면 충돌 사항이 발생하지 않는다!

1. auto-merge

   - 동일한 파일을 수정하지 않은 경우 자동으로 merge commit이 발생 한다.

   ```
   1. Local A에서 작업 후 Push
   2. Local B에서 작업 시 pull을 받지 않음.
   3. Local B에서 다른 파일 작업 후 commit -> push
   4. 오류 발생(~~git pull~~)
   5. Local B에서 git pull
   6. 자동으로 vim commit 할 수 있도록 뜸.
   7. 저장하면, merge commit 발생
   8. Local B에서 git push!
   ```

2. merge conflict

   - 다른 이력(커밋)으로 동일한 파일이 수정되는 경우 merge conflict 발생.
   - 직접 충돌 파일을 해결 해야 한다!

   ```
   1. Local A에서 작업 후 Push
   2. Local B에서 작업 시 pull을 받지 않음.
   3. Local B에서 동일 파일 작업 후 commit -> push
   4. 오류 발생(~~git pull~~)
   5. Local B에서 git pull
   6. 충돌 발생(merge conflict)
   7. 직접 오류 수정 및 add, commit
   8. Local B에서 git push
   ```

   - `git status` 명령어를 통해 어느 파일에서 충돌이 발생하였는지 확인 가능!

   - 실제 파일 예시

     ```
     <<<<<<< HEAD
     Local B작업
     =======
     원격 저장소에 기록된 작업
     >>>>>>> fajskh213ht12h4fahjkfhsdk
     ```



## 4. 되돌리기

1. `Staging area` 에서 unstage

   ```
   $ git status
   On branch master
   Your branch is ahead of 'origin/master' by 1 commit.
     (use "git push" to publish your local commits)
   
   Changes to be committed:
     (use "git reset HEAD <file>..." to unstage)
   
           deleted:    b.txt
   $ git reset HEAD b.txt
   ```

2. commit 메시지 수정하기

   ```
   $ git commit --amend
   ```

   - 커밋 메시지를 수정하게 되면 해시값이 변경되어 이력이 변화하게 된다.

   - 따라서 원격 저장소에 push된 이력이라면 절대 변경하면 안된다!

   - 커밋을 하는 과정에서 파일을 빠뜨렸다면, 위의 명령어를 통해서 수정할 수도 있다!

     ```
     $ git add omit_file.txt
     $ git commit --amend
     ```

3. `working directory` 변경사항 버리기

   ```
   $ git checkout -- 파일명
   ```

   - 변경사항이 모두 삭제 되고, 해당 파일의 이전 커밋 상태로 변화한다!







사진 올리는 법 : 



asset으로 설정

체크리스트 3개 전부다 클릭







만들어주는 사이트 : <http://gitignore.io/>

.gitignore

파일 안에 

.settings/

data.csv

*.txt

같이 들어있으면 해당 이름들의 파일은 깃에 올라가지 않음.





유용한 사이트(웹디자인)

<https://startbootstrap.com/>

<https://fontawesome.com/>

<https://jekyllrb-ko.github.io/>

<https://www.gatsbyjs.org/>
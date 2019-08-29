# Git 특강2

> Git은 분산버전 관리 시스템(DVCS)이다.
>
> 소스코드의 이력을 관리

- 참고 문서

> [Git.scm]()

```
[포탈이름](포탈주소)
```

`사이에 넣으면 회색 강조 표시

`3개(코드창) 뒤에 바로 bash같은거 쓰면 언어 설정까지 됨

## 1. git 설정

git 커밋을 하기 위해서는 초기에 작성자(author)설정을 반드시 하여야 한다.

```bash
$ git config --global user.name '이름'

$ git config --global user.email '이메일@이메일'
```



현재 global로 설정된 환경 설정을 확인하기 위해서는 아래의 명령어를 작성한다.



## 2.git 활용 기초

1. 로컬 git 저장소 설정

   ```bash
   $ git init
   -> Initialized empty Git repository in
   C:/Users/students~~~~~/.git/
   (master)$
   ```

   - 해당 디렉토리에 .git/폴더가 생성된다.
   - 항상 git init 하기 전에는 해당 폴더가 이미 로컬 저장소인지 [(master) 여부 ] 확인하여야 한다.	

​	



2. add

   ```bash
   $ git add .
   $ git add README.md a.txt
   $ git add folder/
   $ git status
   on branch master
   ```

   - add 명령어를 통해서 Working directory에서 INDEX(staging area)로 특정 파일들을 이동시킨다.
   - 커밋을 할 목록에 쌓는 것이다.



3. commit

```bash
$ git commit -m '커밋메세지'
$ git commit
[master a1a04a7] README 제목 작성
 1 file changed, 1 insertion(+)
$ git log
```



4. 커밋 히스토리 확인하기(log)

```bash
$ git log
$ git log -2
$ git log --online
```

ex) git log -1





5. 현재 git 상태 알아보기(status) **중요! 자주 입력해서 확인하자!**

```bash
$ git stats
```





# 3. 원격 저장소(remote) 활용하기



## 1.기초

1. remote 저장소 등록

   ```bash
   $ git remote add origin {github URL}
   ```

   - 원격 저장소를 `origin`이라는 이름으로 `URL`을 등록한다.



2. remote 저장소 확인

   ```bash
   $ git remote -v
   ```



3. remote 저장소 삭제

   ```bash
   $ git remote rm {저장소 이름}
   ```



# 2.Push - Pull

1. 원격 저장소로 보내기 `push` 

```bash
$ git push origin master
```



2. 원격 저장소로부터 가져오기 `pull`

```bash
$ git pull origin master
```







VI 설치방법

1. 기타에 있는 4가지 작업 추가 수행
2. accept Current Change 등등을 클릭하면 편하게 조절 가능

 Accpet both 어쩌구나



## 3. Push-Pull 시나리오

Local A, Local B, Github으로 활용을 하는 경우 원격 저장소 이력과 달라져서 충돌이 발생할 수 있다. 따라서, 항상 작업을 시작하기  전에 `pull`을 받고 작업을 완료한 이후에 push를 진행하면 충돌사항이 발생하지 않는다.



1. auto-merge

   -  동일한 파일을 수정하지 않은 경우 자동으로 merge commit이 발생한다.

   ```
   1. Local A에서 작업 후 Push
   2. Local B에서 작업 시 pull을 받지 않음.
   3. Local B에서 작업 후 commit -> Push
   4. 오류 발생(~~git pull~~)
   5. Local B에서 git pull
   6. 자동으로 vim commit
   7. 저장하면, merge commit 발생
   8. Local B에서 git push!
   ```

   

2. merge conflict
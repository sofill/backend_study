Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

새로운 크로스 플랫폼 PowerShell 사용 https://aka.ms/pscore6

PS C:\Users\user> dir


    디렉터리: C:\Users\user


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-02   오후 1:17                .config
d-----     2019-12-02   오후 5:13                .eclipse
d-----     2019-12-03   오후 6:01                .gradle
d-----     2019-12-02   오후 5:13                .p2
d-----     2019-12-02   오후 5:13                .tooling
d-----     2019-12-02   오후 3:07                .vscode
d-r---     2019-12-04  오전 12:36                3D Objects
d-r---     2019-12-04  오전 12:36                Contacts
d-r---     2019-12-04  오전 12:36                Desktop
d-r---     2019-12-04  오전 12:36                Documents
d-r---     2019-12-04  오전 12:36                Downloads
d-----     2019-12-02   오후 4:49                eclipse
d-----     2019-12-02   오후 5:36                eclipse-workspace
d-r---     2019-12-04  오전 12:36                Favorites
d-----     2019-12-03   오후 1:04                git
d-r---     2019-12-04  오전 12:36                Links
d-r---     2019-12-04  오전 12:36                Music
d-r---     2019-11-30  오전 11:15                OneDrive
d-r---     2019-12-04  오전 12:36                Pictures
d-r---     2019-12-04  오전 12:36                Saved Games
d-----     2019-12-03   오후 6:09                scoop
d-r---     2019-12-04  오전 12:36                Searches
d-r---     2019-12-04  오전 12:36                Videos
-a----     2019-12-03  오전 11:20             82 .gitconfig


PS C:\Users\user> cd git
PS C:\Users\user\git> dir


    디렉터리: C:\Users\user\git


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-03   오후 6:23                bitcamp-20191202
d-----     2019-12-03  오후 12:52                bitcamp-java-20190527
d-----     2019-12-03   오후 6:01                bitcamp-study
d-----     2019-12-03  오후 12:47                eomcs-java-project
d-----     2019-12-03  오후 12:48                eomcs-java-project-2019
d-----     2019-12-03   오후 6:27                ohoracs-java


PS C:\Users\user\git> cd .\bitcamp-20191202\
PS C:\Users\user\git\bitcamp-20191202> git pull                                                                         remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/eomjinyoung/bitcamp-20191202
   596886a..6d32f68  master     -> origin/master
Updating 596886a..6d32f68
Fast-forward
 self-checklist.md   | 219 +++++++++++++++++++++++++++++++++++++---------------
 self-checklist.xlsx | Bin 17307 -> 0 bytes
 2 files changed, 157 insertions(+), 62 deletions(-)
 delete mode 100644 self-checklist.xlsx
PS C:\Users\user\git\bitcamp-20191202> cd ..
PS C:\Users\user\git> cd .\ohoracs-java\
PS C:\Users\user\git\ohoracs-java> git pull
remote: Enumerating objects: 75, done.
remote: Counting objects: 100% (58/58), done.
remote: Compressing objects: 100% (20/20), done.
remote: Total 37 (delta 13), reused 37 (delta 13), pack-reused 0
Unpacking objects: 100% (37/37), done.
From https://github.com/ohoracs/ohoracs-java
   be29d7d..66daff1  master     -> origin/master
Updating be29d7d..66daff1
Fast-forward
 self-checklist.md                                 | 219 ++++++++++++++++------
 self-checklist.xlsx                               | Bin 17307 -> 0 bytes
 src/main/java/com/ohoracs/basic/ex04/Exam31.java  |   4 +-
 src/main/java/com/ohoracs/basic/ex04/Exam311.java |  47 ++++-
 src/main/java/com/ohoracs/basic/ex04/Exam32.java  |  54 ++----
 src/main/java/com/ohoracs/basic/ex04/Exam321.java |  39 ++++
 src/main/java/com/ohoracs/basic/ex04/Exam322.java |  29 +++
 src/main/java/com/ohoracs/basic/ex04/Exam33.java  |  16 ++
 src/main/java/com/ohoracs/basic/ex04/Exam41.java  |  28 +--
 src/main/java/com/ohoracs/basic/ex04/Exam42.java  |  47 ++---
 src/main/java/com/ohoracs/basic/ex04/Exam43.java  |  48 ++---
 src/main/java/com/ohoracs/basic/ex04/Exam44.java  |  23 +++
 src/main/java/com/ohoracs/basic/ex04/Exam51.java  |  27 +--
 src2/ch03/Test01.java                             |  25 +--
 14 files changed, 389 insertions(+), 217 deletions(-)
 delete mode 100644 self-checklist.xlsx
 create mode 100644 src/main/java/com/ohoracs/basic/ex04/Exam321.java
 create mode 100644 src/main/java/com/ohoracs/basic/ex04/Exam322.java
 create mode 100644 src/main/java/com/ohoracs/basic/ex04/Exam33.java
 create mode 100644 src/main/java/com/ohoracs/basic/ex04/Exam44.java
PS C:\Users\user\git\ohoracs-java> cd ..
PS C:\Users\user\git> cd .\bitcamp-study\dir
cd : 'C:\Users\user\git\bitcamp-study\dir' 경로는 존재하지 않으므로 찾을 수 없습니다.
위치 줄:1 문자:1
+ cd .\bitcamp-study\dir
+ ~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (C:\Users\user\git\bitcamp-study\dir:String) [Set-Location], It
   emNotFoundException
    + FullyQualifiedErrorId : PathNotFound,Microsoft.PowerShell.Commands.SetLocationCommand

PS C:\Users\user\git> dir


    디렉터리: C:\Users\user\git


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-04   오전 9:32                bitcamp-20191202
d-----     2019-12-03  오후 12:52                bitcamp-java-20190527
d-----     2019-12-04  오전 11:19                bitcamp-study
d-----     2019-12-03  오후 12:47                eomcs-java-project
d-----     2019-12-03  오후 12:48                eomcs-java-project-2019
d-----     2019-12-04   오전 9:32                ohoracs-java


PS C:\Users\user\git> cd .\bitcamp-study\
PS C:\Users\user\git\bitcamp-study> dir

    디렉터리: C:\Users\user\git\bitcamp-study


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-03   오후 6:20                bitcamp-docs
-a----     2019-12-03  오후 12:52            200 .gitignore
-a----     2019-12-03   오후 5:57            410 Hello.class
-a----     2019-12-03   오후 5:56            107 Hello.java
-a----     2019-12-03   오후 6:01             30 hello.js
-a----     2019-12-04  오전 11:25             24 HelloWorld.class
-a----     2019-12-03  오후 12:41             15 README.md
-a----     2019-12-04   오전 9:36           5597 self-checklist(old).md
-a----     2019-12-04   오전 9:32          13417 self-checklist.md
-a----     2019-12-03  오후 12:50          17307 self-checklist.xlsx


PS C:\Users\user\git\bitcamp-study> javap HelloWorld.class
Error: invalid index #0
public class ??? {
}
PS C:\Users\user\git\bitcamp-study> javap HelloWorld.class
public class HelloWorld {
}
PS C:\Users\user\git\bitcamp-study> java Hello
Hello!
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
error: file not found: HelloWorld2.java
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
error: file not found: HelloWorld2.java
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
error: file not found: HelloWorld2.java
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\user\git\bitcamp-study> javap HelloWorld2
Error: class not found: HelloWorld2
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
error: file not found: HelloWorld2.java
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study>
PS C:\Users\user\git\bitcamp-study>
PS C:\Users\user\git\bitcamp-study>
PS C:\Users\user\git\bitcamp-study> dir


    디렉터리: C:\Users\user\git\bitcamp-study


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-03   오후 6:20                bitcamp-docs
-a----     2019-12-03  오후 12:52            200 .gitignore
-a----     2019-12-03   오후 5:57            410 Hello.class
-a----     2019-12-03   오후 5:56            107 Hello.java
-a----     2019-12-03   오후 6:01             30 hello.js
-a----     2019-12-04  오전 11:46             62 HelloWorld.class
-a----     2019-12-04  오전 11:46            196 HelloWorld2.class
-a----     2019-12-04  오전 11:46             34 HelloWorld2.java
-a----     2019-12-03  오후 12:41             15 README.md
-a----     2019-12-04   오전 9:36           5597 self-checklist(old).md
-a----     2019-12-04   오전 9:32          13417 self-checklist.md
-a----     2019-12-03  오후 12:50          17307 self-checklist.xlsx


PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> ls


    디렉터리: C:\Users\user\git\bitcamp-study


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-03   오후 6:20                bitcamp-docs
-a----     2019-12-03  오후 12:52            200 .gitignore
-a----     2019-12-03   오후 5:57            410 Hello.class
-a----     2019-12-03   오후 5:56            107 Hello.java
-a----     2019-12-03   오후 6:01             30 hello.js
-a----     2019-12-04  오전 11:46             62 HelloWorld.class
-a----     2019-12-04  오전 11:48            196 HelloWorld2.class
-a----     2019-12-04  오전 11:48             35 HelloWorld2.java
-a----     2019-12-03  오후 12:41             15 README.md
-a----     2019-12-04   오전 9:36           5597 self-checklist(old).md
-a----     2019-12-04   오전 9:32          13417 self-checklist.md
-a----     2019-12-03  오후 12:50          17307 self-checklist.xlsx


PS C:\Users\user\git\bitcamp-study> javap HelloWorld
public class HelloWorld {
}
PS C:\Users\user\git\bitcamp-study> javap -verbose HelloWorld
Classfile /C:/Users/user/git/bitcamp-study/HelloWorld.class
  Last modified 2019. 12. 4.; size 62 bytes
  MD5 checksum e137e3ad27a20f2419de6b0018615f0c
public class HelloWorld
  minor version: 0
  major version: 52
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #1                          // HelloWorld
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 0, attributes: 0
Constant pool:
  #1 = Class              #2              // HelloWorld
  #2 = Utf8               HelloWorld
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
{
}
PS C:\Users\user\git\bitcamp-study> javap HelloWorld
public class HelloWorld {
  public static void main(java.lang.String[]);
}
PS C:\Users\user\git\bitcamp-study> java HelloWorld
Hello World
PS C:\Users\user\git\bitcamp-study> java HelloWorld
오류: 기본 클래스 HelloWorld을(를) 찾거나 로드할 수 없습니다.
원인: java.lang.NoClassDefFoundError: AelloWorld (wrong name: HelloWorld)
PS C:\Users\user\git\bitcamp-study> java HelloWorld
Aello World
PS C:\Users\user\git\bitcamp-study> java HelloWorld
오류: 기본 클래스 HelloWorld을(를) 로드하는 중 LinkageError가 발생했습니다.
        java.lang.ClassFormatError: Unknown constant tag 65 in class file HelloWorld
PS C:\Users\user\git\bitcamp-study> java HelloWorld
Aello Worldaaa
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
HelloWorld2.java:2: error: ']' expected
    public void main(Stringp[ args){
                             ^
1 error
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
HelloWorld2.java:4: error: cannot find symbol
    public void main(Stringp[] args){
                     ^
  symbol:   class Stringp
  location: class HelloWorld2
1 error
PS C:\Users\user\git\bitcamp-study> javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> javap HelloWorld2
Compiled from "HelloWorld2.java"
public class HelloWorld2 {
  public HelloWorld2();
  public void main(java.lang.String[]);
}
PS C:\Users\user\git\bitcamp-study> java HelloWorld2
오류: HelloWorld2 클래스에서 기본 메소드가 static이(가) 아닙니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
PS C:\Users\user\git\bitcamp-study> Javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> Java HelloWorld2.java
error: class found on application class path: HelloWorld2
PS C:\Users\user\git\bitcamp-study> Java HelloWorld2
오류: HelloWorld2 클래스에서 기본 메소드가 static이(가) 아닙니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
PS C:\Users\user\git\bitcamp-study> Javac HelloWorld2.java
PS C:\Users\user\git\bitcamp-study> javap HelloWorld2
Compiled from "HelloWorld2.java"
public class HelloWorld2 {
  public HelloWorld2();
  public static void main(java.lang.String[]);
}
PS C:\Users\user\git\bitcamp-study> Java HelloWorld2
Hello World!
PS C:\Users\user\git\bitcamp-study> Java HelloWorld2
Hello World!
PS C:\Users\user\git\bitcamp-study> dir


    디렉터리: C:\Users\user\git\bitcamp-study


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-03   오후 6:20                bitcamp-docs
-a----     2019-12-03  오후 12:52            200 .gitignore
-a----     2019-12-04  오후 12:08            321 cafe.class
-a----     2019-12-03   오후 5:57            410 Hello.class
-a----     2019-12-03   오후 5:56            107 Hello.java
-a----     2019-12-03   오후 6:01             30 hello.js
-a----     2019-12-04  오후 12:05            287 HelloWorld.class
-a----     2019-12-04  오후 12:12            428 HelloWorld2.class
-a----     2019-12-04  오후 12:14            130 HelloWorld2.java
-a----     2019-12-03  오후 12:41             15 README.md
-a----     2019-12-04   오전 9:36           5597 self-checklist(old).md
-a----     2019-12-04   오전 9:32          13417 self-checklist.md
-a----     2019-12-03  오후 12:50          17307 self-checklist.xlsx


PS C:\Users\user\git\bitcamp-study> node -v
v13.2.0
PS C:\Users\user\git\bitcamp-study> node Hello.js
Hello! haha~~
PS C:\Users\user\git\bitcamp-study> git add .
PS C:\Users\user\git\bitcamp-study> git commit -m "자바 프로젝트 디렉토리 생성"
[master 7a55058] 자바 프로젝트 디렉토리 생성
 6 files changed, 232 insertions(+)
 create mode 100644 Hello.java
 create mode 100644 HelloWorld2.java
 create mode 100644 hello.js
 create mode 100644 self-checklist(old).md
 create mode 100644 self-checklist.md
 create mode 100644 self-checklist.xlsx
PS C:\Users\user\git\bitcamp-study> git push
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 8 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (8/8), 19.67 KiB | 6.56 MiB/s, done.
Total 8 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/sofill/bitcamp-study.git
   2fd0f85..7a55058  master -> master
PS C:\Users\user\git\bitcamp-study> cd ...
cd : 지정한 경로 C:\Users\user\git\bitcamp-study\...에 개체가 없습니다.
위치 줄:1 문자:1
+ cd ...
+ ~~~~~~
    + CategoryInfo          : InvalidArgument: (:) [Set-Location], PSArgumentException
    + FullyQualifiedErrorId : Argument,Microsoft.PowerShell.Commands.SetLocationCommand

PS C:\Users\user\git\bitcamp-study> cd..
PS C:\Users\user\git> cd .\bitcamp-20191202\
PS C:\Users\user\git\bitcamp-20191202> git pull                                                                         remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 4 (delta 2), reused 4 (delta 2), pack-reused 0
Unpacking objects: 100% (4/4), done.
From https://github.com/eomjinyoung/bitcamp-20191202
   6d32f68..30cc005  master     -> origin/master
Updating 6d32f68..30cc005
Fast-forward
 HelloWorld2.java  | 5 +++++
 self-checklist.md | 3 ++-
 2 files changed, 7 insertions(+), 1 deletion(-)
 create mode 100644 HelloWorld2.java
PS C:\Users\user\git\bitcamp-20191202> git add .
PS C:\Users\user\git\bitcamp-20191202> git commit -m "자바 프로젝트 디렉토리 생성"
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
PS C:\Users\user\git\bitcamp-20191202> git push
remote: Permission to eomjinyoung/bitcamp-20191202.git denied to sofill.
fatal: unable to access 'https://github.com/eomjinyoung/bitcamp-20191202.git/': The requested URL returned error: 403
PS C:\Users\user\git\bitcamp-20191202> git add .
PS C:\Users\user\git\bitcamp-20191202> git commit -m "자바 프로젝트 디렉토리 생성"
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
PS C:\Users\user\git\bitcamp-20191202> cd ..
PS C:\Users\user\git> cd .\bitcamp-study\
PS C:\Users\user\git\bitcamp-study> git add .                                                                           PS C:\Users\user\git\bitcamp-study> git commit -m "자바 프로젝트 디렉토리 생성"                                         [master 33e8afe] 자바 프로젝트 디렉토리 생성
 4 files changed, 13 insertions(+)
 create mode 100644 bitcamp-java/src/main/java/README.md
 create mode 100644 bitcamp-java/src/main/resources/README.md
 create mode 100644 bitcamp-java/src/test/java/README.md
 create mode 100644 bitcamp-java/src/test/resources/README.md
PS C:\Users\user\git\bitcamp-study> git push
Enumerating objects: 13, done.
Counting objects: 100% (13/13), done.
Delta compression using up to 8 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (12/12), 1.06 KiB | 541.00 KiB/s, done.
Total 12 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/sofill/bitcamp-study.git
   7a55058..33e8afe  master -> master
PS C:\Users\user\git\bitcamp-study> cd src/main/java
cd : 'C:\Users\user\git\bitcamp-study\src\main\java' 경로는 존재하지 않으므로 찾을 수 없습니다.
위치 줄:1 문자:1
+ cd src/main/java
+ ~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (C:\Users\user\g...y\src\main\java:String) [Set-Location], ItemNotFoundE
   xception
    + FullyQualifiedErrorId : PathNotFound,Microsoft.PowerShell.Commands.SetLocationCommand

PS C:\Users\user\git\bitcamp-study> cd .\bitcamp-java\
PS C:\Users\user\git\bitcamp-study\bitcamp-java> cd src/main/java                                                       PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> javac Hello2.java                                        PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> ls

    디렉터리: C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----     2019-12-04   오후 3:50            413 Hello2.class
-a----     2019-12-04   오후 3:48            110 Hello2.java
-a----     2019-12-04   오후 3:17             84 README.md


PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> java Hello2
Hello2!
PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> del Hello2.class
PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> ls


    디렉터리: C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----     2019-12-04   오후 3:48            110 Hello2.java
-a----     2019-12-04   오후 3:17             84 README.md


PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main\java> cd ..
PS C:\Users\user\git\bitcamp-study\bitcamp-java\src\main> cd ..
PS C:\Users\user\git\bitcamp-study\bitcamp-java\src> cd ..
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac src/main/java/Hello2.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> ls


    디렉터리: C:\Users\user\git\bitcamp-study\bitcamp-java


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-04   오후 2:24                bin
d-----     2019-12-04   오후 3:05                src


PS C:\Users\user\git\bitcamp-study\bitcamp-java> dir


    디렉터리: C:\Users\user\git\bitcamp-study\bitcamp-java


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----     2019-12-04   오후 2:24                bin
d-----     2019-12-04   오후 3:05                src


PS C:\Users\user\git\bitcamp-study\bitcamp-java> java Hello2
오류: 기본 클래스 Hello2을(를) 찾거나 로드할 수 없습니다.
원인: java.lang.ClassNotFoundException: Hello2
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -classpath src/main/java Hello2
Hello2!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp src/main/java Hello2
Hello2!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin src/main/java/Hello2.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/Hello2.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -co bin/main Hello2
Unrecognized option: -co
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cd bin/main Hello2
Unrecognized option: -cd
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main Hello2
Hello2!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/basic/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/basic/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/ok/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin.main Hello3
오류: 기본 클래스 Hello3을(를) 찾거나 로드할 수 없습니다.
원인: java.lang.ClassNotFoundException: Hello3
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main Hello3
ok/Hello3!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/basic/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/ok/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/ok/Hello3.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main/com/ohoracs/basic Hello3
오류: 기본 클래스 Hello3을(를) 찾거나 로드할 수 없습니다.
원인: java.lang.NoClassDefFoundError: com/ohoracs/basic/Hello3 (wrong name: Hello3)
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main com/ohoracs/basic Hello3
오류: 기본 클래스 com.ohoracs.basic을(를) 찾거나 로드할 수 없습니다.
원인: java.lang.ClassNotFoundException: com.ohoracs.basic
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main com/ohoracs/basic/Hello3
basic/Hello3!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main com.ohoracs.basic.Hello3
basic/Hello3!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main com.ohoracs.ok.Hello3
ok/Hello3!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com
error: invalid flag: src/main/java/com
Usage: javac <options> <source files>
use --help for a list of possible options
PS C:\Users\user\git\bitcamp-study\bitcamp-java> javac -d bin/main src/main/java/com/ohoracs/basic/Hello4.java
PS C:\Users\user\git\bitcamp-study\bitcamp-java> jaca -cp bin/main Hello4
jaca : 'jaca' 용어가 cmdlet, 함수, 스크립트 파일 또는 실행할 수 있는 프로그램 이름으로 인식되지 않습니다. 이름이 정확한
지 확인하고 경로가 포함된 경우 경로가 올바른지 검증한 다음 다시 시도하십시오.
위치 줄:1 문자:1
+ jaca -cp bin/main Hello4
+ ~~~~
    + CategoryInfo          : ObjectNotFound: (jaca:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\user\git\bitcamp-study\bitcamp-java> java -cp bin/main Hello4
basic/Hello4!
PS C:\Users\user\git\bitcamp-study\bitcamp-java> java


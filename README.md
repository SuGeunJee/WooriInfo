# WOORI INFO - 학생 정보 관리 시스템 🎓

## 📝 WOORI INFO 시스템 소개
학생들을 위한 정보 관리 시스템 
학생들의 기본 정보, 목표, 스터디 희망 분야 등을 관리하고, 등하교 메이트 매칭 기능을 제공

## 🌟 주요 기능

![wori](https://github.com/user-attachments/assets/c50a55ae-46ca-4edf-8964-93d0b94bfb3e)
1. **모든 친구들 정보 조회**
   - 전체 친구들 프로필 정보 조회

2. **궁금한 친구들 정보 조회**
   - 궁금한 친구 이름으로 조회
   - 등하교 메이트를 희망하는 친구 조회
   - 모든 친구들의 이름과 주소 조회
   - 모든 친구들의 이름과 전화번호 조회

3. **내 정보 관리**
   - 개인 프로필 정보 추가 
   - 개인 프로필 정보 조회 및 수정 삭제
   - 노트북 번호를 통한 고유 식별

4. **보안**
   - 정보 수정/삭제 시 비밀번호 인증
   - BCrypt를 활용한 비밀번호 암호화 

## 🛠 시스템 아키텍처
![image (3)](https://github.com/user-attachments/assets/19fc3268-ccce-43e3-8b69-ec4e78eccd6d)

## 🛠 DB ERD
![image (1)](https://github.com/user-attachments/assets/be80f25a-7917-4495-89c8-bf0152b6e456)

## 🛠 기술 스택
- **언어:** Java
- **데이터베이스:** MySQL
- **보안:** BCrypt
- **빌드 도구:** Maven
- **개발 환경:** Spring Tool Suite (STS) / DBeaver
- **협업툴:** Git / Notion / Slack / Discord
- **라이브러리:** Lombok / JDBC / jBCrypt

## 📁 프로젝트 구조
```plaintext
src/  
├── 📂 info/  
│   ├── 📂 controller/  
│   │   └── 🎮 MemberController.java  
│   ├── 📂 exception/  
│   │   └── ⚠️ NotExistException.java  
│   ├── 📂 model/  
│   │   ├── 🛠️ MemberDAO.java  
│   │   ├── 📂 dto/  
│   │   │   ├── 📄 MemberDTO.java  
│   │   │   ├── 📄 MemberInfoDTO.java  
│   │   │   ├── 📄 CommuteMateDTO.java  
│   │   │   └── 👑 Role.java  
│   │   └── 📂 util/
│   │       └── ⚙️ DBUtil.java  
│   └── 📂 view/  
│       ├── 🖥 RunningStartView.java  
│       └── 📺 RunningEndView.java  
```
## 👀 실행 화면
![imageimage](https://github.com/user-attachments/assets/a0df7c88-ac06-4450-8a1f-36d6a0281dfc)

## 🤝 Commit Message Convention
| Tag Name | Description |
| --- | --- |
| Feat | 새로운 기능을 추가 |
| Fix | 버그 수정 |
| Refactor | 프로덕션 코드 리팩토링 |
| Comment | 필요한 주석 추가 및 변경 |
| Docs | 문서 수정 |
| Test | 테스트 코드, 리펙토링 테스트 코드 추가, Production Code(실제로 사용하는 코드) 변경 없음 |
| Chore | 빌드 업무 수정, 패키지 매니저 수정, 패키지 관리자 구성 등 업데이트, Production Code 변경 없음 |
| Rename | 파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우 |
| Remove | 파일을 삭제하는 작업만 수행한 경우 |

ex) [Feat] Add MemberDTO with builder pattern and JDBC DB connection

<br>
<details>
  <summary><b>팀원의 첫인상과 대화를 나눈 후의 느낌</b></summary>

### 😊 지수근
- 최다영 : 성격이 온화해 보이셨다. → 의외로 활발하시고 첫 인상처럼 성격이 온화하시다.
- 최윤정 : 차분하고 신중해 보였다. → 맛집 얘기할 때 진심이 느껴진다.
- 한정현 : 책임감이 강해 보였다. → 생각보다 말씀도 많으시고 재밌으시다.

### 😁 최다영

- 지수근 : 친숙한 느낌이 들었다. → 비슷한 점이 많아 더욱 친숙해졌고 차분하신 것 같다.
- 최윤정 : 똑부러지는 성격인 것 같다. → 밝고 또렷한 목소리가 귀에 콕콕 박힌다.
- 한정현 : 부처같은 느낌을 받았다. → 활발하시고 눈치가 빠른 것 같았다.

### 👩‍💻 최윤정

- 지수근 : 똑똑하고 꼼꼼하실 것 같다. → 비슷하다. 그리고 닭강정.. 나만 많이 먹은 거 봤다. 배려심도 많은 분 같다.
- 최다영 : 낯이 익은데.. 아까 오티 때 봐서 그런가? → 같은 대학교셨다! 눈송이 너무 반갑다. 대화할 때 긍정 에너지가 느껴진다.
- 한정현 : 뭔가 장난기가 있으실 것 같다. → MBTI 듣고 나니 첫인상이 맞을 수도 있겠다. 옆에서 상태 체크도 먼저 해주시고 친절하시다.

### 🐱‍👤한정현

- 지수근 :  스마트한 이미지가 있다. → 굉장히 친절하시고 모르는걸 잘 알려주신다.
- 최윤정 : 밝고 성격이 좋을 것 같다. → 꼼꼼하고 똑순이 같다.
- 최다영 :  착하시고 뭔가 다람쥐 같은 이미지가 있다. → 착한 다람쥐 같다.
</details>
<br>

# 📌 트러블 슈팅

## 💥 이슈 1. Git Push 오류

상황

- SSH 키 생성하고 공개 키 Github에 등록했나요? yes
- git config 설정했나요? yes

그런데, Github에 Push가 되지 않았다.

## ✔ 해결한 방법

git config로 설정했던 name, email을 unset 해준 뒤 다시 재등록해주니 push가 되었다. 혹시 오타가 있을 수 있으니, 본인의 깃허브에 들어가 복사해서 붙여넣기 하는 것을 추천한다.

<details>
  <summary><b> Git Bash로 SSH Key 설정 및 Github 연동 과정 정리</b></summary>

## 1. SSH 키 생성 및 등록

### 명령어 실행

```bash

# 홈 디렉토리로 이동

cd ~

# SSH 키 생성

ssh-keygen

# SSH 키가 저장된 디렉토리로 이동

cd ~/.ssh

# 디렉토리 내 파일 목록 확인

ls -la

# 공개 키 파일 내용 확인 및 복사

cat id_ed25519.pub

```

### GitHub에 SSH 키 등록

1. GitHub → **Settings > SSH and GPG keys**로 이동.

2. **New SSH Key** 클릭.

3. 위 명령어에서 복사한 공개 키(`id_ed25519.pub`) 내용을 붙여넣고 저장.

## 2. Git 작업 흐름

### 명령어 실행

```bash

# 레포지토리 클론

git clone git@github.com:lalalarr/WooriInfo.git

# 클론한 디렉토리로 이동

cd /c/WooriInfo

# 파일 변경 후 추가

git add .

# 변경사항 확인

git diff  # 탈출은 'q'

# 변경사항 커밋

git commit -m "[Docs] Update README"

# 변경사항 푸시

git push origin main

```

## **3. Git 설정 초기화 및 재설정**

### **기존 설정 삭제**

```bash

git config --unset --global user.name

git config --unset --global user.email

```

### 현재 설정 확인

```bash

git config --list

```

### 새로운 설정 등록

```bash

git config --global user.name 깃허브아이디

git config --global user.email 깃허브에연동된이메일

```

<br>

# 📖 참고 자료

[https://hoozy.tistory.com/entry/GIT-GIT-BASH로-SSH-연결-후-프로젝트-PUSH](https://hoozy.tistory.com/entry/GIT-GIT-BASH%EB%A1%9C-SSH-%EC%97%B0%EA%B2%B0-%ED%9B%84-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-PUSH)
</details>

## 💥 이슈 2. 빈 디렉토리 Push 문제

상황
- JAVA 프로젝트를 생성하고, controller, view, model package를 만든 후 Git에 Push 했을 때 저장소에 Push가 정상적으로 되지 않았다.

## ✔ 해결한 방법

Git에서는 기본적으로 추적할 파일이 없는 빈 디렉토리를 추적하지 않기 때문에 생성한 package 구조를 유지하기 위해서는 Git에서 추적할 파일이 필요하다. 이를 위해 각 비어있는 packag에 .gitkeep 파일을 생성한 후 Push 했다.
```
# 비어있는 폴더도 git에 올라가도록 하기
$ touch src/info/controller/.gitkeep
$ touch wooriInfo/src/info/model/dto/.gitkeep
$ touch wooriInfo/src/info/model/util/.gitkeep
$ touch wooriInfo/src/info/view/.gitkeep
```
<br>

# 💡 고찰

- 지수근
   - JAVA를 이용하여 MVC 패턴을 처음으로 실제 프로젝트에 적용해보면서 각 계층 간의 역할과 데이터 흐름을 체계적으로 이해할 수 있었습니다. 특히 Controller와 DAO 계층을 분리하여 구현하고, View에서 사용자와의 상호작용을 담당하는 구조를 직접 설계하면서 객체지향의 핵심 원리를 실무적으로 경험할 수 있어서 좋았습니다. 또한, JDBC를 통한 데이터베이스 연동 과정에서 Connection, PreparedStatement 등의 개념을 실습을 통해 이해할 수 있었으며, Git을 활용한 협업 과정에서 rebase, merge와 같은 기능들을 다시 한번 확실히 정립할 수 있어 유익한 경험이었다고 생각합니다.

- 한정현
  - DB를 jdbc로 세팅하고 CRUD기능을 수행하는 과정에서 MVC패턴에 대해 다시 한번 자세하게 공부할 수 있게 되었다. 또한 비록 콘솔창이지만 View에서도 최대한 UI적으로 어떻게 해야 좋은지에 대해서도 생각해보게 되어 좋았고 Controller와 연계하여 리팩토링 하는 과정에서도 좀 더 간결하고 효율적인 코드에 대해 생각해보는 기회가 되어 좋았다. 이번에는 DB를 jdbc로 세팅을 했지만 추후에는 jpa나 mybatis를 사용해서 다시 한번 수행해보고 싶다는 생각을 했다. 또한 팀원들과 대화를 하고 여러 문제를 해결하는 협업 과정에서 많이 배우고 간만에 재밌게 프로젝트를 수행한 좋은 경험이었다.


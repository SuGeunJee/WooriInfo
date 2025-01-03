# WooriInfo

## 📝 README : 팀원의 첫인상과 식사 후 현인상 작성

### 😊 지수근

- 최다영 : 성격이 온화해 보였음 -> 의외로 활발하시고 첫 인상처럼 성격이 온화하심
- 최윤정 : 차분하고 신중해 보였음 -> 맛집 얘기할 때 진심이 느껴짐
- 한정현 : 책임감 강해 보였음 -> 생각보다 말씀도 많으시고 재밌음

### 😁 최다영

- 지수근 : 친숙한 느낌이 들었음 -> 비슷한 점이 많아 더욱 친숙해졌고 차분하심
- 최윤정 : 똑부러지는 성격인 것 같음 -> 밝고 또렷한 목소리가 귀에 콕콕 박힘
- 한정현 : 부처같은 느낌을 받았음 -> 활발하시고 눈치가 빠른 것 같았음

### 👩‍💻 최윤정

- 지수근 : 똑똑하고 꼼꼼하실 것 같다. → 비슷하다. 그리고 닭강정.. 나만 많이 먹은 거 봤다. 배려심도 많은 분 같다.
- 최다영 : 낯이 익은데.. 아까 오티 때 봐서 그런가? → 같은 대학교셨다! 눈송이 너무 반갑다. 대화할 때 긍정 에너지가 느껴진다.
- 한정현 : 뭔가 장난기가 있으실 것 같다. → MBTI 듣고 나니 첫인상이 맞을 수도 있겠다. 옆에서 상태 체크도 먼저 해주시고 친절하시다.

### 🐱‍👤한정현

- 지수근 :  스마트한 이미지가 있다 → 굉장히 친절하시고 모르는걸 잘 알려주신다
- 최윤정 : 밝고 성격이 좋을 것 같다 → 꼼꼼하고 똑순이 같다
- 최다영 :  착하시고 뭔가 다람쥐 같은 이미지가 있다 → 착한 다람쥐 같다

<br>

# 👀 회고록
## 💥 발생한 문제

상황

- SSH 키 생성하고 공개 키 Github에 등록했나요? yes
- git config 설정했나요? yes

그런데, Github에 Push가 되지 않았다.

## ✔ 해결한 방법

git config로 설정했던 name, email을 unset 해준 뒤 다시 재등록해주니 push가 되었다. 혹시 오타가 있을 수 있으니, 본인의 깃허브에 들어가 복사해서 붙여넣기 하는 것을 추천한다.

<br>

---

# 📌 Git Bash로 SSH Key 설정 및 Github 연동 과정 정리

### 1. SSH 키 생성 및 등록

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

- --

### 2. Git 작업 흐름

### 명령어 실행

```bash

# 레포지토리 클론

git clone git@github.com:lalalarr/WooriInfo.git

# 클론한 디렉토리로 이동

cd /c/02.mission/WooriInfo

# 파일 변경 후 추가

git add .

# 변경사항 확인

git diff  # 탈출은 'q'

# 변경사항 커밋

git commit -m "[Docs] Update README"

# 변경사항 푸시

git push origin main

```

### **3. Git 설정 초기화 및 재설정**

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

## 📖 참고 자료

[https://hoozy.tistory.com/entry/GIT-GIT-BASH로-SSH-연결-후-프로젝트-PUSH](https://hoozy.tistory.com/entry/GIT-GIT-BASH%EB%A1%9C-SSH-%EC%97%B0%EA%B2%B0-%ED%9B%84-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-PUSH)
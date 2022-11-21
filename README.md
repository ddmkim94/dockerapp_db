# 서버배포/운영

## 프로젝트 폴더 경로
- `/docker_projects/dockerapp/project`

## 프로젝트 새로 구성
- `rm -rf /docker_projects/dockerapp/project`
- `mkdir -p /docker_projects/dockerapp/project`
- `cd /docker_projects/dockerapp/project`
- `git clone https://github.com/ddmkim94/dockerapp_db .`
- `chmod 744 ./gradlew`

## 그래들 빌드
- `./gradlew clean build`

## 현재 실행중인 컨테이너 중지 및 삭제
- `docker stop dockerapp_1`
	- 안되면 : `docker kill dockerapp_1`
- `docker rm -f dockerapp_1`

## 새 sbdb 이미지 만들기
- `git pull origin master`
- `./gradlew clean build`
- `docker build -t dockerapp .`

## sbdb 이미지 실행
```bash
docker run \
  --name=dockerapp_1 \
  -p 8080:8080 \
  -v /docker_projects/dockerapp_1/volumes/gen:/gen \
  --restart unless-stopped \
  -e TZ=Asia/Seoul \
  -d \
  dockerapp
```

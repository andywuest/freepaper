#/bin/bash
PROJECT_DIR="projects/sailfishos/github/freepaper/"
cd $PROJECT_DIR
git pull
mvn clean install -Dmaven.test.skip=true
java -jar target/freepaper-1.0-SNAPSHOT.jar server ./config/home.yml
cd -

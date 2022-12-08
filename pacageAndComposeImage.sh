if [ -d "docker/prod" ]
then
  cd docker/prod
  docker compose down
  $(dirname $0)
  cd ..
  cd ..
fi

$(dirname $0)

mvn clean -Pdocker-image
mvn package -Pdocker-image

docker compose up

echo "Done, press any key to continue"
while [ true ] ; do
read -t 3 -n 1
if [ $? = 0 ] ; then
exit ;
fi
done
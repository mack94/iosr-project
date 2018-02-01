# build images if necessary
echo "BUILD IMAGES IF NECESSARY BEFORE THIS"

# map size for elasticsearch
echo "set sysctl max_map_count"
sudo sysctl -w vm.max_map_count=262144

# stop and remove all container
echo "stopping and erasing working containers"
docker stop $(docker ps -aq)
docker rm $(docker ps -aq) 

# run the portainer (name not from iosr)
echo "running the Portainer"
docker run -d -p 9000:9000  --restart always -v /var/run/docker.sock:/var/run/docker.sock -v /opt/portainer:/data portainer/portainer --admin-password '$2y$05$4VN2X91zmAEqNcVnkjezDuHBte6h2zB9nZWcwNvdl0PUy.bePB9.O'

# run pumba 
#echo "running Pumba"
#docker run -d -v /var/run/docker.sock:/var/run/docker.sock gaiaadm/pumba pumba --random --interval 1m kill --signal SIGKILL re2:^iosr

# run the docker-compose 
echo "Docker-compose up"
docker-compose build
docker-compose up

#docker update --restart=always $(docker ps -aq)

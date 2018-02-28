wget https://get.docker.com/
sudo sh index.html

sudo docker pull docker pull postgres:10.2
sudo docker run --name=postgres -p 5432:5432 -e POSTGRES_DB='dev_db' -e POSTGRES_USER='root' -e POSTGRES_PASSWORD='1234' -d mysql/mysql-server:5.7
sudo docker stop postgres
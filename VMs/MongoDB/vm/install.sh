#!/usr/bin/env bash

sudo mkdir -p /data/db
sudo chown -R 777 /data/db

sudo apt-get update && apt-get upgrade -y
sudo apt-get install mongodb -y

sudo sed -i "s/127.0.0.1/0.0.0.0/" /etc/mongod.conf
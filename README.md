# docker-dev-setup-example

Some example code showing a development environment setup using docker-compose.

## Requirements

You need docker and docker-compose installed.

Follow the official [installation guide](https://docs.docker.com/install/). The community edition is fine and should install docker-compose by default.

## Running

From the root of this project run:

`docker-compose up --build`

You can see the node app running at <http://localhost:3000>

You can see pgadmin running at <http://localhost:9000>

To cleanup:

Hit Ctrl+c to stop the running applications.

To remove the containers:

`docker-compose down`

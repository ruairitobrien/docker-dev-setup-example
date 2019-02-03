# docker-dev-setup-example

Some example code showing a development environment setup using docker-compose.

This will spin up a postgres database, a node web app based on express and a java web app using spring boot.

This project demonstrated some ways to setup a local development environment using docker and docker-compose to reduce the need to install local dependencies (beyond docker) and to avoid using things like in memory databases which can cover up potential issues that only arise when you deploy to a real environment.

## Requirements

You need docker and docker-compose installed.

Follow the official [installation guide](https://docs.docker.com/install/). The community edition is fine and should install docker-compose by default.

## Running

From the root of this project run:

`docker-compose up --build`

You can see the node app running at <http://localhost:3000>

If you look at the console output you should be able to see a message showing the node app has connected to the database. The node apps outputs will be prefixed with `node_1`

You can see pgadmin running at <http://localhost:9000>

You need ot login to pgadmin with the email and password specified in the docker-compose.yml file.

You can see the spring web app running at <http://localhost:8080>

Well, sort of. You'll see an error page but that's just because we never setup any routes.

Note, the spring app takes a lot longer to come up than the others so you might need to wait a while after running `docker-compose up --build` before seeing it running.

To cleanup:

Hit Ctrl+c to stop the running applications.

To remove the containers:

`docker-compose down`

FROM keymetrics/pm2:latest-alpine

WORKDIR /usr/app

COPY bin/ ./bin/
COPY package.json .
COPY yarn.lock .
COPY ecosystem.config.js .

# Install app dependencies
ENV NPM_CONFIG_LOGLEVEL warn
RUN yarn install

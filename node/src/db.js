const sleep = require('util').promisify(setTimeout);
const { Client } = require('pg');
const client = new Client();

const connect = async () => {
  try {
    await client.connect();
    const res = await client.query('SELECT NOW()');
    console.log('Printing out response for SELECT NOW()', res);
    await client.end();
  } catch (err) {
    await sleep(1000);
    connect();
  }
};

module.exports = {
  connect
};

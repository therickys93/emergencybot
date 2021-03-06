# Emergency Numbers Bot #

[![Build Status](https://travis-ci.org/itjustworksteam/emergencybot.svg?branch=master)](https://travis-ci.org/itjustworksteam/emergencybot)

### A telegram bot that helps you getting emergency numbers ###

* the official bot is [here](https://telegram.me/emergencynumbersbot)
* Contribution is really appreciated.
* This bot use the emergencyserver as backend. You can find the repo [here](https://github.com/itjustworksteam/emergencyserver)

### How do I get set up? ###

* You have to install java oracle jdk 8 to continue
* clone this repository
* compile it with: ``./gradlew clean stage``
* remember to set up this environment variables: ``TELEGRAM_SERVER_TOKEN``, ``TELEGRAM_BOT_TOKEN``, ``PORT`` and ``EMERGENCY_URL``
* run it with: ``java -cp build/libs/emergencybot.jar it.itjustworks.emergencybot.server.Server``
* run tests with: ``./gradlew clean check``

* For the documentation please see the [telegram bot api](https://core.telegram.org/bots/api)

### Contribution guidelines ###

##### For Developers: #####

* First of all we use TDD so test your code.
* Comment your code so that we can understand what you want to do.
* Submit your pull request.

##### For Others: #####

* Contact us and explain your idea or your problem
* We will reply you as soon as possible

### Who do I talk to? ###

* For any problem open an issue

### List of all commands and what the bot can do ###

* /start --> start the chat
* /help --> show a little guide on how to use it
* /credits --> find out who is the developer
* /feedback --> say us what you think about the bot
* send your location --> show the police, medical and fire numbers of the country you are

### use docker compose and run it locally ###

```
version: '2'

services:
  app:
    image: therickys93/emergencybot
    environment:
      - TELEGRAM_BOT_TOKEN=your_token
      - TELEGRAM_SERVER_TOKEN=123
      - PORT=80
  proxy:
    image: therickys93/proxy
    ports:
      - "80:80"

```

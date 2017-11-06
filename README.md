# TestLittleProxy

Test for the little proxy : https://github.com/adamfisk/LittleProxy

## Run (with build)

Default port is 8080

```
$ git clone https://github.com/keuss/TestLittleProxy.git
$ cd LittleProxy
$ ./run.bash

OR

$ ./run.bash -DproxyPort=8880

OR

$ nohup ./run.bash -DproxyPort=8883 &

add -Dlog4j.configurationFile=path/to/log4j2.xml to specify the configuration file location for log4j2 (By default, Log4j looks for a configuration file named log4j2.xml (not log4j.xml) in the classpath.)

```

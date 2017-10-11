#!/usr/bin/env bash
function die() {
  echo $*
  exit 1
}

echo "Start ..."

fullPath=`dirname $0`
jar=`find $fullPath/TestProxy*-testlittleproxy-shade.jar`
cp=`echo $jar | sed 's,./,'$fullPath'/,'`
echo "cp : ${cp}"
echo "Other args : $*"
javaArgs="$* -server -XX:+HeapDumpOnOutOfMemoryError -Xmx800m -jar "$cp" $*"

echo "Running using Java on path at `which java` with args $javaArgs"
java $javaArgs || die "Java process exited abnormally"

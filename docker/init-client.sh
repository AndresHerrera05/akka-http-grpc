#! /bin/sh

/usr/local/bin/envoy -c /etc/envoy-configuration.json &
java -jar /app/customer-service-assembly-1.0.jar
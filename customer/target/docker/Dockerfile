FROM envoy_java:8
ADD 0/customer-service-assembly-1.0.jar /app/customer-service-assembly-1.0.jar
RUN mkdir /var/log/envoy
ENTRYPOINT ["java", "-jar", "\/app\/customer-service-assembly-1.0.jar"]
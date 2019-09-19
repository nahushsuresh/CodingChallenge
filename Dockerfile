FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/mac-addr-lookup-0.0.1.jar mac-addr-lookup.jar
ENTRYPOINT [ "sh", "-c", "java -cp mac-addr-lookup.jar com.test.mac.addr.lookup.MacAddressLookup" ]

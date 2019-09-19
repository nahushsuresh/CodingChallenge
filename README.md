#Run Instructions

1) To run it

java -cp target\mac-addr-lookup-0.0.1.jar com.test.mac.addr.lookup.MacAddressLookup -m "<MAC ADDRESS INPUT>" -v

Note: If you're behind firewall. Make sure you set proxies

* -Dhttp.proxyHost=<proxy host> -Dhttp.proxyPort=<proxy port>

# Docker Run instructions

1) docker build -t mac_addr_lookup .
2) docker run mac_addr_lookup -m="00-05-9A-3C-7A-00" -v="true"
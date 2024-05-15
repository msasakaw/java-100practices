# Javaネットワークについて
- 参考：https://stacktrace.jp/java/http_jvm_parameter.html
- コマンドライン
    - プロキシサーバーのホスト名：Dhttp.proxyHost=~
    - プロキシサーバーのポート名：Dhttp.proxyPort=~
    - プロキシを経由せず直接接続するホスト名：Dhttp.nonProxyHosts=*.internal.com

- ソースコードからの指定
    - System.setProperty("http.proxyHost",     "proxy.bar.com");
    - System.setProperty("http.proxyPort",     "8080");
    - System.setProperty("http.nonProxyHosts", "localhost|*.internal.com");

↑を踏まえ、Answer
## java -Dhttp.proxyHost=proxy.example.com -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.noproxy.example.com HelloWorld.java
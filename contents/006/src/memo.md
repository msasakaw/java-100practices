# Linuxタイムゾーンについて
- 参考：https://qiita.com/azusanakano/items/b39bd22504313884a7c3
Rootユーザーで行う
- コマンド一覧
    - date：現在の確認
        - Wed May 15 08:13:59 GMT 2024
    - timedatectl:システムクロック設定を確認および変更
        - set-timezone 地域名

##  timedatectl set-timezone Asia/Tokyo
##  date で確認　
Wed May 15 17:22:35 JST 2024

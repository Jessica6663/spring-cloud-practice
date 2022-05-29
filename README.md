# Spring Cloud 練習 Project
- author: Jessica Tsai
- date: 2022.05.29
- 說明: 個人練習 Spring Cloud 的專案

---

## 環境準備
### version
- jdk 11+
- mysql 8.0.25
- maven-3.3.9
- IDEA
### database
- script/cloud01.sql

---

## 模塊說明
### spring-cloud-api
提供核心 entity
### spring-cloud-provider-group
提供操作 group 服務
### spring-cloud-consumer-group
調用 spring-cloud-provider-group，提供消費者端的 group 服務
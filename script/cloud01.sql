create database `cloud01`;

use `cloud01`;

drop table if exists `group`;

create table `group`
(
    `g_no`       bigint auto_increment comment '團體 ID' ,
    `g_name`     varchar(60) comment '團體名稱',
    `db_source`  varchar(60) comment '資料庫來源',
    primary key (`g_no`)
) engine=innodb default charset=utf8 comment '團體';

INSERT INTO `group`(`g_name`, `db_source`) VALUES ('少年隊', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('TOKIO', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('20th Century', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('KinKi Kids', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('嵐', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('NEWS', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('関ジャニ∞', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('KAT-TUN', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('Hey! Say! JUMP', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('Kis-My-Ft2', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('Sexy Zone', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('A.B.C-Z', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('ジャニーズWEST', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('ふぉ〜ゆ〜', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('King & Prince', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('SixTONES', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('Snow Man', database());
INSERT INTO `group`(`g_name`, `db_source`) VALUES ('なにわ男子', database());


# JavaWeb实训项目  
  
ver0.0.1  

## mysql初始化
create user "roku"@"localhost" identified by "roku";
use mysql;
update user set authentication_string='roku' where user='roku';
create database cloudgo;
grant all privileges on \*.\* to 'roku'@'localhost' with grant option;


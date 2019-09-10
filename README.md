# JPA Exercises

This repository contains exercises to help people learn JPA.

You can either use MySQL or H2 for running the examples.

If you are using MySQL then please ensure you have a database named `jpaex` created. To create a database do following:

```
$ mysql -uroot
```

> You don't have to type `$`. It signifies command prompt.

Once connected to mysql using CLI, run the following command to create the database

```
mysql> create database jpaex;
```

> You don't have to type `mysql> ` it signifies mysql command prompt

To view all the database, you can run following SQL command

```
mysql> show databases;
```

To connect to the database

```
mysql> connect jpaex
```

To view all the tables, you can run following SQL

```
mysql> show tables
```
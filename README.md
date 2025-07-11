WELCOME to CassandraUnit
========================

Everything is in the wiki : 
https://github.com/nMoncho/cassandra-unit/wiki

What is it?
-----------
Like other *Unit projects, CassandraUnit is a Java utility test tool.
It helps you create your Java Application with [Apache Cassandra](http://cassandra.apache.org) Database backend.
CassandraUnit is for Cassandra what DBUnit is for Relational Databases.

CassandraUnit helps you writing isolated JUnit tests in a Test Driven Development style.

This is a fork from [org.cassandraunit](https://github.com/jsevellec/cassandra-unit). Most, if not all, work
has been done there. We just update dependencies, and release on different Cassandra versions. Whereas the
original development released versions following the Cassandra Java Driver, this project releases versions
following the actual Cassandra DB.

Main features :
---------------
- Start an embedded Cassandra.
- Create structure (keyspace and Column Families) and load data from an XML, JSON or YAML DataSet.
- Execute a CQL script.

Where to start :
----------------
You can start by reading the wiki : 
https://github.com/nMoncho/cassandra-unit/wiki

and you can watch cassandra-unit-examples project.
https://github.com/nMoncho/cassandra-unit-examples

License :
---------
This project is licensed under LGPL V3.0 :
http://www.gnu.org/licenses/lgpl-3.0-standalone.html


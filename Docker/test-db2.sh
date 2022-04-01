#!/bin/bash
#local
set -e
export PGPASSWORD=password
#psql -U root -h localhost -p 5432 -d docker  -W password<<EOF
psql postgresql://root:password@localhost << EOF
  CREATE USER docker WITH PASSWORD 'docker';
  CREATE DATABASE docker;
  GRANT ALL PRIVILEGES ON DATABASE docker TO docker;
  \connect $APP_DB_NAME docker
  BEGIN;
    CREATE TABLE IF NOT EXISTS event (
	  id CHAR(26) NOT NULL CHECK (CHAR_LENGTH(id) = 26) PRIMARY KEY,
	  aggregate_id CHAR(26) NOT NULL CHECK (CHAR_LENGTH(aggregate_id) = 26),
	  event_data JSON NOT NULL,
	  version INT,
	  UNIQUE(aggregate_id, version)
	);
	CREATE INDEX idx_event_aggregate_id ON event (aggregate_id);
  COMMIT;
EOF
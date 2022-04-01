#!/bin/bash
set -e
export PGPASSWORD=password
#psql -U root -h localhost -p 5432 -d docker  -W password<<EOF
psql postgresql://root:password@localhost/docker << EOF
EOF
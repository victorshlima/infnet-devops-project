#!/bin/bash

echo "=======CONFIGURANDO AWS =========="
aws configure set aws_acccess_key_id $1
aws configure set aws_secret_access_key $2
aws configure set region $3
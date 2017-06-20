#!/bin/bash

mvn clean test -q
cd target/classes

echo -e "\n\nEXAMPLES:\n\n"

echo "INPUT: big brown fox jumped over a lazy dog"
echo "big brown fox jumped over a lazy dog" | java -cp . com.piotrderen.App
echo 
echo "INPUT: Lorem ipsum dolor sit amet"
echo "Lorem ipsum dolor sit amet" | java -cp . com.piotrderen.App

cd ../../

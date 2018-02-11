#!/usr/bin/env bash

echo "start";

mvn clean package

mv /Users/ivosahlik/Public/workspace-liferay-6.2/liferay62portletinitialproject/target/portlet-initial-project-v1.war /Users/ivosahlik/Public/liferay/liferay-portal-6.2.0-ce-ga1/deploy/

echo "end";
#!/bin/bash
jsonschema2pojo --annotation-style GSON --generate-builders --package com.bakkenbaeck.token.model.sofa -S -E --source schema --target java
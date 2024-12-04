/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hugegraph.structure.traverser;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prediction {

    @JsonProperty("adamic_adar")
    private Double adamicAdar;
    @JsonProperty("resource_allocation")
    private Double resourceAllocation;
    @JsonProperty
    private Map<String, Object> measure;

    public Double getAdamicAdar() {
        return this.adamicAdar;
    }

    public Double getResourceAllocation() {
        return this.resourceAllocation;
    }

    public Map<String, Object> measure() {
        return this.measure;
    }
}

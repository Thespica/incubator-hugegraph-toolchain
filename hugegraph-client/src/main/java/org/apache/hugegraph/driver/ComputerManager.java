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

package org.apache.hugegraph.driver;

import org.apache.hugegraph.client.api.task.ComputerDisAPI;
import org.apache.hugegraph.client.api.task.TasksWithPage;
import org.apache.hugegraph.client.RestClient;
import org.apache.hugegraph.structure.Task;

import java.util.List;
import java.util.Map;

public class ComputerManager {

    private ComputerDisAPI computerDisAPI;

    public ComputerManager(RestClient client, String graphSpace, String graph) {
        this.computerDisAPI = new ComputerDisAPI(client, graphSpace, graph);
    }

    public long create(String algorithm, long worker,
                       Map<String, Object> params) {
        return this.computerDisAPI.create(algorithm, worker, params);
    }

    public void delete(long id) {
        this.computerDisAPI.delete(id);
    }

    public void cancel(long id) {
        this.computerDisAPI.cancel(id);
    }

    public List<Task> list(long limit) {
        return this.computerDisAPI.list(limit);
    }

    public TasksWithPage list(String page, long limit) {
        return this.computerDisAPI.list(page, limit);
    }

    public Task get(long id) {
        return this.computerDisAPI.get(id);
    }
}

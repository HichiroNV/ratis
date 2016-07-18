/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.raft.server;

public class RaftConfKeys {
  public static final String RAFT_SERVER_USE_MEMORY_LOG_KEY = "raft.server.use.memory.log";
  public static final boolean RAFT_SERVER_USE_MEMORY_LOG_DEFAULT = false;

  public static final String RAFT_SERVER_STORAGE_DIR_KEY = "raft.server.storage.dir";
  public static final String RAFT_SERVER_STORAGE_DIR_DEFAULT = "file:///tmp/raft-server/";

  // TODO migrate some properties from RaftConstants to here
}
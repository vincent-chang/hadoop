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
package org.apache.hadoop.hdfs.server.blockmanagement;

import java.io.IOException;

import org.apache.hadoop.classification.VisibleForTesting;
import org.apache.hadoop.hdfs.protocol.DatanodeID;
import org.apache.hadoop.hdfs.server.protocol.BlockReportContext;

/**
 * Used to inject certain faults for testing.
 */
public class BlockManagerFaultInjector {
  @VisibleForTesting
  public static BlockManagerFaultInjector instance =
      new BlockManagerFaultInjector();

  @VisibleForTesting
  public static BlockManagerFaultInjector getInstance() {
    return instance;
  }

  @VisibleForTesting
  public void incomingBlockReportRpc(DatanodeID nodeID,
          BlockReportContext context) throws IOException {

  }

  @VisibleForTesting
  public void requestBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }

  @VisibleForTesting
  public void removeBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }

  @VisibleForTesting
  public void mockAnException() {
  }

  @VisibleForTesting
  public void mockJNStreams() throws IOException {

  }
}

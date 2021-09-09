/**
 * Copyright (C) 2018-2021 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.expediagroup.streamplatform.streamregistry.state.model.specification;

import java.util.List;
import java.util.Map;

import lombok.NonNull;
import lombok.Value;

import com.fasterxml.jackson.databind.node.ObjectNode;

import com.expediagroup.streamplatform.streamregistry.state.model.Entity.ZoneKey;

@Value
public class ProcessSpecification implements Specification {
  @NonNull List<ZoneKey> zones;
  @NonNull String description;
  @NonNull List<Tag> tags;
  @NonNull String type;
  @NonNull ObjectNode configuration;
  @NonNull Map<String, List<Principal>> security;
  @NonNull String function;
  @NonNull List<ProcessInputStream> inputs;
  @NonNull List<ProcessOutputStream> outputs;
}

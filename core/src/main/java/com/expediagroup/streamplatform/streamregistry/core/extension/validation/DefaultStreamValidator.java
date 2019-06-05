/**
 * Copyright (C) 2018-2019 Expedia, Inc.
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
package com.expediagroup.streamplatform.streamregistry.core.extension.validation;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import com.expediagroup.streamplatform.streamregistry.model.Stream;

@Slf4j
public class DefaultStreamValidator implements StreamValidator {

  @Override
  public void configure(Map<String, ?> configs) {
  }

  @Override
  public boolean isStreamValid(Stream stream) {
    if (stream.getVpcList() == null || stream.getVpcList().isEmpty()) {
      log.error("Stream {} cannot be created without vpcList configuration", stream.getName());
      return false;
    }
    return true;
  }

  @Override
  public String getValidationAssertion() {
    return null;
  }
}
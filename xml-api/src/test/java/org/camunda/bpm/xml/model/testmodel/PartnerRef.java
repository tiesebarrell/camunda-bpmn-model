/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.xml.model.testmodel;

import org.camunda.bpm.xml.model.ModelBuilder;
import org.camunda.bpm.xml.model.impl.instance.ModelElementInstanceImpl;
import org.camunda.bpm.xml.model.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.xml.model.instance.ModelElementInstance;
import org.camunda.bpm.xml.model.type.ModelElementTypeBuilder;

import static org.camunda.bpm.xml.model.testmodel.TestModelConstants.ELEMENT_NAME_PARTNER_REF;
import static org.camunda.bpm.xml.model.testmodel.TestModelConstants.MODEL_NAMESPACE;

/**
 * @author Sebastian Menski
 */
public class PartnerRef extends ModelElementInstanceImpl implements ModelElementInstance {

  public static void registerType(ModelBuilder modelBuilder) {
    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(PartnerRef.class, ELEMENT_NAME_PARTNER_REF)
      .namespaceUri(MODEL_NAMESPACE)
      .instanceProvider(new ModelElementTypeBuilder.ModelTypeInstanceProvider<PartnerRef>() {
        public PartnerRef newInstance(ModelTypeInstanceContext instanceContext) {
          return new PartnerRef(instanceContext);
        }
      });

    typeBuilder.build();
  }

  public PartnerRef(ModelTypeInstanceContext instanceContext) {
    super(instanceContext);
  }
}
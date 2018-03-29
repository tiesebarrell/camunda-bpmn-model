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

package org.camunda.bpm.model.bpmn.instance;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Giulio Piccinin
 */
public class DataStoreReferenceTest extends BpmnModelElementInstanceTest {

    public TypeAssumption getTypeAssumption() {
        return new TypeAssumption(FlowElement.class, false);
    }

    public Collection<ChildElementAssumption> getChildElementAssumptions() {
        return Collections.singletonList(
                new ChildElementAssumption(DataState.class, 0, 1)
        );
    }

    public Collection<AttributeAssumption> getAttributesAssumptions() {
        return Arrays.asList(
                new AttributeAssumption("itemSubjectRef"),
                new AttributeAssumption("dataStoreRef")
        );
    }
}
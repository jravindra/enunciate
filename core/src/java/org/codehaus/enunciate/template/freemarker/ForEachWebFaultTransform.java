/*
 * Copyright 2006 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.template.freemarker;

import net.sf.jelly.apt.freemarker.FreemarkerTransform;
import org.codehaus.enunciate.template.strategies.jaxws.WebFaultLoopStrategy;

/**
 * Transform for iterating over each web fault of a WSDL.
 *
 * @author Ryan Heaton
 */
public class ForEachWebFaultTransform extends FreemarkerTransform<WebFaultLoopStrategy> {

  /**
   * Construct a new transform under the specified namespace.  <code>null</code> or <code>""</code> means the root namespace.
   *
   * @param namespace The namespace.
   */
  public ForEachWebFaultTransform(String namespace) {
    super(namespace);
  }

  public WebFaultLoopStrategy newStrategy() {
    return new WebFaultLoopStrategy();
  }
}
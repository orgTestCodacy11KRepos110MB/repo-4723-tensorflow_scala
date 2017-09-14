/* Copyright 2017, Emmanouil Antonios Platanios. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.platanios.tensorflow.api.ops

/** Contains helper functions and classes for creating IO-related ops.
  *
  * @author Emmanouil Antonios Platanios
  */
package object io {
  private[api] trait API
      extends Dataset.API
          with Iterator.API
          with Reader.API {
    type Dataset[T, O, D, S] = io.Dataset[T, O, D, S]
    type Iterator[T, O, D, S] = io.Iterator[T, O, D, S]
    type Reader = io.Reader

    io.Dataset.Gradients
    io.Files.Gradients
    io.Iterator.Gradients
    io.Reader.Gradients
  }
}

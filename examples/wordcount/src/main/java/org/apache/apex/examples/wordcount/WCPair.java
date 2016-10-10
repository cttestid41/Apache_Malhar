/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.apex.examples.wordcount;

/**
 * A single (word, frequency) pair
 *
 * @since 3.2.0
 */
public class WCPair
{
  /**
   * The word
   */
  public String word;

  /**
   * The frequency
   */
  public int freq;

  /**
   * Default constructor
   */
  public WCPair()
  {

  }

  /**
   * Create new object with given values
   * @param w The word
   * @param f The frequency
   */
  public WCPair(String w, int f)
  {
    word = w;
    freq = f;
  }

  @Override
  public String toString()
  {
    return String.format("(%s, %d)", word, freq);
  }
}
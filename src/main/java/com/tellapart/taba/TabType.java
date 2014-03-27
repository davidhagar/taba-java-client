/* Copyright 2014 TellApart, Inc.
 *
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
package com.tellapart.taba;

/**
 * Enumeration of TabTypes, and their server-side String names.
 */
public enum TabType {
  Buffer ("Buffer"),
  Gauge ("Gauge"),
  ExpiryGauge ("ExpiryGauge"),
  TotalsCounter ("TotalsCounter"),
  PercentileCounter ("PercentileCounter"),
  CounterGroup ("CounterGroup"),
  PercentileGroup ("PercentileGroup");

  private final String mName;
  private TabType(String name) {
    mName = name;
  }

  public boolean equalsName(String otherName){
    return (otherName == null) ? false : mName.equals(otherName);
  }

  public String toString(){
    return mName;
  }

}
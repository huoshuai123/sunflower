/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower.converters

import androidx.room.TypeConverter
import java.lang.StringBuilder

class StringListConverters {

    @TypeConverter
    fun StringListToString(list: List<String>) : String{
        if(list.isEmpty()){
            return ""
        }
        val str = StringBuilder(list[0])
        list.forEachIndexed { index, value ->
            if(index != 0){
                str.append(',')
            }
            str.append(value)
        }
        return str.toString()
    }

    @TypeConverter
    fun StringToListString(str: String): List<String>{
        return str.split(',')
    }

}
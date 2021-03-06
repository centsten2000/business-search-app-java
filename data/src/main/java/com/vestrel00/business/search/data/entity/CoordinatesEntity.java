/*
 * Copyright 2018 Vandolf Estrellado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vestrel00.business.search.data.entity;

import com.google.auto.value.AutoValue;

/**
 * Contains coordinates.
 */
@AutoValue
// FIXME? (JACKSON DATABIND) - The generated builder could be used for deserialization.
// However, Jackson does not yet support setting default values for null or missing properties
// per setter/getter methods. Furthermore, it is not as flexible as parsing using the tree model.
// E.G. Missing (or null) property string -> empty string (instead of the default null)
// @JsonDeserialize(builder = AutoValue_CoordinatesEntity.Builder.class)
public abstract class CoordinatesEntity implements Entity {

    /**
     * @return a new {@link Builder}
     */
    public static Builder builder() {
        return new AutoValue_CoordinatesEntity.Builder();
    }

    public abstract double latitude();

    public abstract double longitude();

    /**
     * Builder used to create instances of {@link CoordinatesEntity}.
     */
    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder latitude(double latitude);

        public abstract Builder longitude(double latitude);

        public abstract CoordinatesEntity build();
    }
}

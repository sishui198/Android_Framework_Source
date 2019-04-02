/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@RequiresApi(18)
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {

    private final ViewGroupOverlay mViewGroupOverlay;

    ViewGroupOverlayApi18(@NonNull ViewGroup group) {
        mViewGroupOverlay = group.getOverlay();
    }

    @Override
    public void add(@NonNull Drawable drawable) {
        mViewGroupOverlay.add(drawable);
    }

    @Override
    public void clear() {
        mViewGroupOverlay.clear();
    }

    @Override
    public void remove(@NonNull Drawable drawable) {
        mViewGroupOverlay.remove(drawable);
    }

    @Override
    public void add(@NonNull View view) {
        mViewGroupOverlay.add(view);
    }

    @Override
    public void remove(@NonNull View view) {
        mViewGroupOverlay.remove(view);
    }

}

package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import defpackage.hi0;

/* loaded from: classes.dex */
public class a implements ControllerListener2 {
    public static final hi0 Companion = new hi0();
    private static final ControllerListener2<?> NO_OP_LISTENER = new a();

    public static final <I> ControllerListener2<I> getNoOpListener() {
        Companion.getClass();
        return NO_OP_LISTENER;
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onEmptyEvent(Object obj) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String str) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String str, Object obj) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String str, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
    }
}

package com.facebook.fresco.ui.common;

import defpackage.nqf;
import defpackage.vu6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/fresco/ui/common/ImagePerfDataListener;", "", "Lcom/facebook/fresco/ui/common/c;", "imagePerfData", "Lvu6;", "imageLoadStatus", "Le5f;", "onImageLoadStatusUpdated", "(Lcom/facebook/fresco/ui/common/c;Lvu6;)V", "Lnqf;", "visibilityState", "onImageVisibilityUpdated", "(Lcom/facebook/fresco/ui/common/c;Lnqf;)V", "ui-common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public interface ImagePerfDataListener {
    void onImageLoadStatusUpdated(c imagePerfData, vu6 imageLoadStatus);

    void onImageVisibilityUpdated(c imagePerfData, nqf visibilityState);
}

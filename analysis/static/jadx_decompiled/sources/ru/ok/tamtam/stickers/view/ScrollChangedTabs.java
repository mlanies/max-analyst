package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import defpackage.swc;

/* loaded from: classes2.dex */
public class ScrollChangedTabs extends TabLayout {
    public ScrollChangedTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void setOnScrollListener(swc swcVar) {
    }
}

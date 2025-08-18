package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.qr8;
import defpackage.wq8;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements qr8 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // defpackage.qr8
    public final void b(wq8 wq8Var) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}

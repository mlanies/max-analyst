package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.br8;
import defpackage.k8g;
import defpackage.qr8;
import defpackage.vq8;
import defpackage.wq8;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements vq8, qr8, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public wq8 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k8g k8gVarX = k8g.x(context, attributeSet, b, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(k8gVarX.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(k8gVarX.n(1));
        }
        k8gVarX.z();
    }

    @Override // defpackage.vq8
    public final boolean a(br8 br8Var) {
        return this.a.q(br8Var, null, 0);
    }

    @Override // defpackage.qr8
    public final void b(wq8 wq8Var) {
        this.a = wq8Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((br8) getAdapter().getItem(i));
    }
}

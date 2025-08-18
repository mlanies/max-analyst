package androidx.mediarouter.app;

import android.content.Context;
import android.widget.ArrayAdapter;
import defpackage.lh8;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = dVar;
        this.a = lh8.d(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}

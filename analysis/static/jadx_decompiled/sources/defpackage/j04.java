package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public final class j04 extends Filter {
    public i04 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((qce) this.a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            i04 r3 = r3.a
            qce r3 = (defpackage.qce) r3
            if (r4 != 0) goto L9
            java.lang.String r4 = ""
            goto L10
        L9:
            r3.getClass()
            java.lang.String r4 = r4.toString()
        L10:
            o0d r0 = r3.v0
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L2c
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L20
            goto L2c
        L20:
            android.app.SearchableInfo r0 = r3.w0     // Catch: java.lang.RuntimeException -> L2c
            android.database.Cursor r3 = r3.g(r0, r4)     // Catch: java.lang.RuntimeException -> L2c
            if (r3 == 0) goto L2c
            r3.getCount()     // Catch: java.lang.RuntimeException -> L2c
            goto L2d
        L2c:
            r3 = r2
        L2d:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L3d
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L42
        L3d:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j04.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        i04 i04Var = this.a;
        Cursor cursor = ((h04) i04Var).c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((qce) i04Var).b((Cursor) obj);
    }
}

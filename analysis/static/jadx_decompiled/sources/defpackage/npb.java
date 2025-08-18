package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class npb implements x3a, lde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ npb(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        SharedPreferences.Editor editorEdit = v3c.q(this.b).edit();
        editorEdit.putBoolean("proxy_retention", this.c);
        editorEdit.apply();
    }

    @Override // defpackage.lde
    public Object get() {
        switch (this.a) {
            case 1:
                return are.r(this.b, false, this.c);
            case 2:
                return are.r(this.b, true, this.c);
            default:
                return are.t(this.b, this.c);
        }
    }
}

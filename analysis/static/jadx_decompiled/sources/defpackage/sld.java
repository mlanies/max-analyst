package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class sld {
    public final Context a;
    public final khe b = new khe(new xid(5));
    public final rld c;

    /* JADX WARN: Type inference failed for: r2v2, types: [rld] */
    public sld(Context context, final khe kheVar) {
        this.a = context;
        this.c = new mi5() { // from class: rld
            @Override // defpackage.mi5
            public final nx3 a() {
                return ((w9a) ((kke) kheVar.getValue())).b();
            }
        };
    }
}

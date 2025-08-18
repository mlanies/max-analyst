package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* loaded from: classes.dex */
public final class v24 implements ao0 {
    public static final jde o = c37.u(new xc3(1));
    public final qm7 a;
    public final q24 b;
    public final BitmapFactory.Options c;

    /* JADX WARN: Illegal instructions before constructor call */
    public v24(Context context) {
        qm7 qm7Var = (qm7) o.get();
        fm9.l(qm7Var);
        this(qm7Var, new h94(context), null);
    }

    @Override // defpackage.ao0
    public final bm7 B(byte[] bArr) {
        return ((mc9) this.a).a(new u24(this, 0, bArr));
    }

    @Override // defpackage.ao0
    public final bm7 u(Uri uri) {
        return ((mc9) this.a).a(new u24(this, 1, uri));
    }

    public v24(qm7 qm7Var, h94 h94Var, BitmapFactory.Options options) {
        this.a = qm7Var;
        this.b = h94Var;
        this.c = options;
    }
}

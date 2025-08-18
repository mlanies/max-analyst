package androidx.media3.effect;

import android.content.Context;
import defpackage.b8b;
import defpackage.crd;
import defpackage.ffc;
import defpackage.i63;
import defpackage.pgf;
import defpackage.s8b;
import defpackage.t8b;
import defpackage.wc3;
import defpackage.xw0;
import defpackage.z18;
import defpackage.zff;

/* loaded from: classes.dex */
public final class PreviewingSingleInputVideoGraph$Factory implements t8b {
    public final zff a;

    public PreviewingSingleInputVideoGraph$Factory(zff zffVar) {
        this.a = zffVar;
    }

    @Override // defpackage.t8b
    public final s8b a(Context context, i63 i63Var, pgf pgfVar, wc3 wc3Var, ffc ffcVar) {
        xw0 xw0Var = xw0.o;
        b8b b8bVar = null;
        for (int i = 0; i < ffcVar.o; i++) {
            z18 z18Var = (z18) ffcVar.get(i);
            if (z18Var instanceof b8b) {
                b8bVar = (b8b) z18Var;
            }
        }
        return new s8b(context, this.a, i63Var, pgfVar, xw0Var, wc3Var, crd.u0, false, b8bVar, 0L);
    }
}

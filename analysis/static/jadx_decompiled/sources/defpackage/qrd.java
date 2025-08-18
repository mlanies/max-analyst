package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class qrd extends ej0 {
    public final a34 h;
    public final q24 i;
    public final qy5 j;
    public final huc l;
    public final ird n;
    public final tb8 o;
    public z0f p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public qrd(pb8 pb8Var, q24 q24Var, huc hucVar) {
        ib8 ib8Var;
        this.i = q24Var;
        this.l = hucVar;
        boolean z = true;
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        Uri uri = Uri.EMPTY;
        String string = pb8Var.a.toString();
        string.getClass();
        zw6 zw6VarJ = zw6.j(zw6.n(pb8Var));
        if (((Uri) s74Var.e) != null && ((UUID) s74Var.d) == null) {
            z = false;
        }
        fm9.k(z);
        if (uri != null) {
            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, zw6VarJ, null, -9223372036854775807L);
        } else {
            ib8Var = null;
        }
        tb8 tb8Var = new tb8(string, new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var);
        this.o = tb8Var;
        ny5 ny5Var = new ny5();
        String str = pb8Var.b;
        ny5Var.m = ia9.l(str == null ? "text/x-unknown" : str);
        ny5Var.d = pb8Var.c;
        ny5Var.e = pb8Var.d;
        ny5Var.f = pb8Var.e;
        ny5Var.b = pb8Var.f;
        String str2 = pb8Var.g;
        ny5Var.a = str2 != null ? str2 : null;
        this.j = new qy5(ny5Var);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri2 = pb8Var.a;
        fm9.m(uri2, "The uri must be set.");
        this.h = new a34(uri2, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.n = new ird(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, tb8Var, null);
    }

    @Override // defpackage.ej0
    public final zd8 c(yj8 yj8Var, n64 n64Var, long j) {
        z0f z0fVar = this.p;
        jn jnVarB = b(yj8Var);
        return new prd(this.h, this.i, z0fVar, this.j, this.k, this.l, jnVarB, this.m);
    }

    @Override // defpackage.ej0
    public final tb8 i() {
        return this.o;
    }

    @Override // defpackage.ej0
    public final void k() {
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.p = z0fVar;
        n(this.n);
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        ((prd) zd8Var).t0.s(null);
    }

    @Override // defpackage.ej0
    public final void q() {
    }
}

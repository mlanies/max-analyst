package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class vt8 implements f6 {
    public final /* synthetic */ au8 a;
    public final /* synthetic */ es8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jy8 d;

    public /* synthetic */ vt8(au8 au8Var, es8 es8Var, String str, jy8 jy8Var) {
        this.a = au8Var;
        this.b = es8Var;
        this.c = str;
        this.d = jy8Var;
    }

    @Override // defpackage.f6
    public final void run() {
        au8 au8Var = this.a;
        au8Var.getClass();
        es8 es8Var = this.b;
        int i = es8Var.a.z0.i();
        String str = this.c;
        cu8 cu8Var = es8Var.a;
        if (i == 1) {
            long j = cu8Var.t0;
            xxc xxcVar = mg4.o;
            au8Var.e.a(new k8d(j, Collections.singletonList(Long.valueOf(cu8Var.b)), null, true, cu8Var.U0));
        } else {
            ((k24) au8Var.a).c.n(cu8Var.b, new m82(str, 2));
        }
        long j2 = cu8Var.b;
        dg5 dg5Var = (dg5) this.d.c.getValue();
        dg5Var.getClass();
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        long j3 = cu8Var.t0;
        sb.append(j3);
        au1.q(j2, ":", ":", sb);
        sb.append(str);
        dg5Var.a.c(sb.toString());
        au8Var.b.c(new l6f(j3, cu8Var.b, 0));
    }
}

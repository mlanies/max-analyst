package defpackage;

import java.util.ArrayList;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a7f implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6f b;

    public /* synthetic */ a7f(v6f v6fVar, int i) {
        this.a = i;
        this.b = v6fVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        v6f v6fVar = this.b;
        switch (this.a) {
            case 0:
                hm9.q("c7f", "putUploadInRepository: failed, upload=%s", v6fVar, (Throwable) obj);
                break;
            default:
                j10 j10Var = (j10) obj;
                j10Var.i = d20.X;
                d7f d7fVar = v6fVar.a;
                j10Var.m = d7fVar.a;
                j10Var.u = d7fVar.b;
                j10Var.k = v6fVar.e;
                j10Var.o = v6fVar.f;
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        o8f o8fVar;
        switch (this.a) {
            case 1:
                gle gleVar = (gle) obj;
                boolean z = gleVar instanceof plf;
                v6f v6fVar = this.b;
                if (z) {
                    ArrayList arrayList = ((plf) gleVar).c;
                    qlf qlfVar = (qlf) (arrayList != null ? x53.D0(arrayList) : nz4.a).get(0);
                    u6f u6fVarB = v6fVar.b();
                    u6fVarB.d = qlfVar.a;
                    o8f o8fVar2 = new o8f();
                    o8fVar2.a = qlfVar.c;
                    o8fVar2.b = qlfVar.b;
                    u6fVarB.h = new p8f(o8fVar2);
                    return new v6f(u6fVarB);
                }
                if (gleVar instanceof mj5) {
                    nj5 nj5Var = (nj5) ((mj5) gleVar).c.get(0);
                    u6f u6fVarB2 = v6fVar.b();
                    u6fVarB2.d = nj5Var.c;
                    o8f o8fVar3 = new o8f();
                    o8fVar3.a = nj5Var.b;
                    o8fVar3.b = nj5Var.a;
                    u6fVarB2.h = new p8f(o8fVar3);
                    return new v6f(u6fVarB2);
                }
                if (gleVar instanceof gwa) {
                    u6f u6fVarB3 = v6fVar.b();
                    u6fVarB3.d = ((gwa) gleVar).c;
                    return new v6f(u6fVarB3);
                }
                if (!(gleVar instanceof i4e)) {
                    throw new UploadException("requestUrlSingle, can't request url for unknown media type= ".concat(h4f.t(v6fVar.a.c)));
                }
                u6f u6fVarB4 = v6fVar.b();
                u6fVarB4.d = ((i4e) gleVar).c;
                return new v6f(u6fVarB4);
            case 2:
            default:
                w8f w8fVar = (w8f) obj;
                e7f e7fVar = new e7f();
                v6f v6fVar2 = this.b;
                d7f d7fVar = v6fVar2.a;
                e7fVar.b = d7fVar.d;
                mx1 mx1Var = new mx1();
                mx1Var.c = d7fVar.a;
                mx1Var.a = d7fVar.c;
                mx1Var.b = d7fVar.b;
                e7fVar.a = mx1Var;
                e7fVar.c = v6fVar2.b;
                e7fVar.d = v6fVar2.c;
                e7fVar.e = v6fVar2.d;
                e7fVar.f = v6fVar2.e;
                e7fVar.g = v6fVar2.f;
                e7fVar.h = v6fVar2.g;
                p8f p8fVar = v6fVar2.h;
                if (p8fVar == null) {
                    o8fVar = null;
                } else {
                    o8f o8fVar4 = new o8f();
                    o8fVar4.b = p8fVar.b;
                    o8fVar4.a = p8fVar.a;
                    o8fVar = o8fVar4;
                }
                e7fVar.i = o8fVar;
                e7fVar.j = v6fVar2.i;
                w8fVar.getClass();
                return new sa3(2, new uh(w8fVar, 28, e7fVar));
            case 3:
                return new ly8(this.b, (d2e) obj);
        }
    }
}

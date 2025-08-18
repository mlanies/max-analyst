package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class dl3 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dl3(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.f6
    public final void run() {
        switch (this.a) {
            case 0:
                el3 el3Var = (el3) this.d;
                el3Var.getClass();
                el3Var.c(this.b, new c10(this.c, 12));
                return;
            default:
                long j = this.b;
                long j2 = this.c;
                fd5 fd5Var = (fd5) this.d;
                ilc ilcVar = fd5Var.a;
                ilcVar.c();
                try {
                    ArrayList arrayListC = fd5Var.c();
                    int iIndexOf = arrayListC.indexOf(Long.valueOf(j));
                    int iIndexOf2 = arrayListC.indexOf(Long.valueOf(j2));
                    if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                        Object obj = arrayListC.get(iIndexOf);
                        arrayListC.remove(iIndexOf);
                        arrayListC.add(iIndexOf2, obj);
                        fd5Var.a(arrayListC);
                    }
                    ilcVar.r();
                    return;
                } finally {
                    ilcVar.l();
                }
        }
    }
}

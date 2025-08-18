package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class ol8 {
    public final ml8 a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ pl8 d;
    public final /* synthetic */ Object e;

    public ol8(ml8 ml8Var, pl8 pl8Var, Object obj, int i) {
        this.c = i;
        this.d = pl8Var;
        this.e = obj;
        this.a = ml8Var;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "executeWithDetachableLooper.done, quit loop ...", null);
                }
                ((bi4) this.e).b.quitSafely();
                break;
            default:
                String str2 = (String) this.d.b;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str2, "executeWithMainLooper.done", null);
                }
                ((CountDownLatch) this.e).countDown();
                break;
        }
    }
}

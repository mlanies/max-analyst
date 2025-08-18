package defpackage;

import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class av implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;

    public /* synthetic */ av(tf2 tf2Var, int i) {
        this.a = i;
        this.b = tf2Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                this.b.t0.c();
                break;
            case 1:
                tf2 tf2Var = this.b;
                hm9.p(tf2Var.a, "loadPrev: exception", th);
                tf2Var.Y.a(new HandledException(th));
                break;
            case 2:
                this.b.s0.c();
                break;
            default:
                tf2 tf2Var2 = this.b;
                hm9.p(tf2Var2.a, "load: exception", th);
                tf2Var2.Y.a(new HandledException(th));
                break;
        }
    }
}

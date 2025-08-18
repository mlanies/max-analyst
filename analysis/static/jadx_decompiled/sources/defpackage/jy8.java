package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class jy8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final khe e;

    public jy8(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var4;
        this.e = new khe(new z30(17, je7Var3));
    }

    public final void a() {
        hm9.n(jy8.class.getName(), "try to restore uploads");
        if (this.d.compareAndSet(false, true)) {
            ((ExecutorService) this.e.getValue()).execute(new nn6(15, this));
        }
    }
}

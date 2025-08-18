package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ut6 extends i06 {
    public final Object X;
    public final /* synthetic */ int o = 1;

    public ut6(ov6 ov6Var) {
        super(ov6Var);
        this.X = new AtomicBoolean(false);
    }

    @Override // defpackage.i06, java.lang.AutoCloseable
    public void close() {
        switch (this.o) {
            case 1:
                if (!((AtomicBoolean) this.X).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public ut6(ov6 ov6Var, vt6 vt6Var) {
        super(ov6Var);
        this.X = new WeakReference(vt6Var);
        a(new tt6(0, this));
    }
}

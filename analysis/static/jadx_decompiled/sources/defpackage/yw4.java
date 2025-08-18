package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class yw4 extends tu0 {
    public final /* synthetic */ tu0 n;
    public final /* synthetic */ ThreadPoolExecutor o;

    public yw4(tu0 tu0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.n = tu0Var;
        this.o = threadPoolExecutor;
    }

    @Override // defpackage.tu0
    public final void v(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.v(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.tu0
    public final void y(t99 t99Var) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.y(t99Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class du1 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;

    public du1(gh7 gh7Var, eg7 eg7Var) {
        this.a = 1;
        this.c = gh7Var;
        this.o = eg7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Executor) this.c).execute(new cu1(0, this));
                break;
            default:
                if (!this.b) {
                    ((gh7) this.c).d((eg7) this.o);
                    this.b = true;
                    break;
                }
                break;
        }
    }

    public du1(eu1 eu1Var, Executor executor) {
        this.a = 0;
        this.o = eu1Var;
        this.b = false;
        this.c = executor;
    }
}

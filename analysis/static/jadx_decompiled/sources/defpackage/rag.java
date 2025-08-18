package defpackage;

import com.my.tracker.obfuscated.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class rag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ rag(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a0 a0Var = this.b;
        switch (i) {
            case 0:
                a0Var.c();
                break;
            default:
                a0.a(a0Var);
                break;
        }
    }
}

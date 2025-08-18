package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class hhe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ihe b;
    public final /* synthetic */ ihe c;

    public /* synthetic */ hhe(ihe iheVar, ihe iheVar2, int i) {
        this.a = i;
        this.b = iheVar;
        this.c = iheVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ihe iheVar = this.b;
                Objects.requireNonNull(iheVar.e);
                iheVar.e.g(this.c);
                return;
            default:
                ihe iheVar2 = this.b;
                ihe iheVar3 = this.c;
                q40 q40Var = iheVar2.b;
                synchronized (q40Var.b) {
                    ((LinkedHashSet) q40Var.c).remove(iheVar2);
                    ((LinkedHashSet) q40Var.o).remove(iheVar2);
                }
                iheVar2.g(iheVar3);
                if (iheVar2.f == null) {
                    iheVar2.toString();
                    return;
                } else {
                    Objects.requireNonNull(iheVar2.e);
                    iheVar2.e.c(iheVar3);
                    return;
                }
        }
    }
}

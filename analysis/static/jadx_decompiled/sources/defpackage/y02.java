package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y02 extends jbe {
    public final /* synthetic */ int Y;
    public Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02() {
        super(2);
        this.Y = 0;
    }

    @Override // defpackage.jbe
    public final void v() {
        switch (this.Y) {
            case 0:
                v02 v02Var = (v02) this.Z;
                v02Var.getClass();
                a12 a12Var = (a12) v02Var.b;
                a12Var.getClass();
                this.b = 0;
                this.o = null;
                a12Var.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((ay) this.Z).Y;
                np8.f(arrayDeque.size() < 2);
                np8.d(!arrayDeque.contains(this));
                this.b = 0;
                this.o = null;
                arrayDeque.addFirst(this);
                return;
            default:
                fqd fqdVar = (fqd) this.Z;
                synchronized (fqdVar.b) {
                    this.b = 0;
                    this.o = null;
                    int i = fqdVar.s0;
                    fqdVar.s0 = i + 1;
                    fqdVar.Y[i] = this;
                    if (!fqdVar.c.isEmpty() && fqdVar.s0 > 0) {
                        fqdVar.b.notify();
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02(cbe cbeVar, int i) {
        super(2);
        this.Y = i;
        this.Z = cbeVar;
    }
}

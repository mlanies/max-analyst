package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class lle {
    public final Context a;
    public final p84 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i;
    public final khe j;

    public lle(Context context, p84 p84Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = context;
        this.b = p84Var;
        this.c = je7Var;
        this.d = je7Var3;
        this.e = je7Var2;
        this.f = je7Var4;
        this.g = ((c79) je7Var5.getValue()).a;
        ((c79) je7Var5.getValue()).getClass();
        this.h = ((c79) je7Var5.getValue()).b;
        final ep epVar = (ep) this;
        final int i = 0;
        this.i = new khe(new k56() { // from class: kle
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        lle lleVar = epVar;
                        return new qh5(lleVar.a, lleVar.a(), (tda) lleVar.d.getValue(), lleVar.b);
                    default:
                        lle lleVar2 = epVar;
                        bea beaVarA = lleVar2.a();
                        tda tdaVar = (tda) lleVar2.d.getValue();
                        ex4 ex4Var = (ex4) lleVar2.c.getValue();
                        return new fx4(lleVar2.a, beaVarA, tdaVar, lleVar2.b, ex4Var);
                }
            }
        });
        final int i2 = 1;
        this.j = new khe(new k56() { // from class: kle
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        lle lleVar = epVar;
                        return new qh5(lleVar.a, lleVar.a(), (tda) lleVar.d.getValue(), lleVar.b);
                    default:
                        lle lleVar2 = epVar;
                        bea beaVarA = lleVar2.a();
                        tda tdaVar = (tda) lleVar2.d.getValue();
                        ex4 ex4Var = (ex4) lleVar2.c.getValue();
                        return new fx4(lleVar2.a, beaVarA, tdaVar, lleVar2.b, ex4Var);
                }
            }
        });
    }

    public final bea a() {
        return (bea) this.e.getValue();
    }

    public abstract boolean b();
}

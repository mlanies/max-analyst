package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class m65 {
    public final je7 a;
    public final khe b;
    public final khe c;
    public final khe d;
    public final khe e;
    public final khe f;

    public m65(Context context, final je7 je7Var, final je7 je7Var2) {
        this.a = je7Var;
        this.b = new khe(new hy4(context, 3));
        this.c = new khe(new yf3(context, 5, this));
        final int i = 0;
        this.d = new khe(new k56() { // from class: l65
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        lw0 lw0Var = new lw0();
                        lw0Var.a = (hw0) je7Var2.getValue();
                        lw0Var.c = (p24) this.c.getValue();
                        lw0Var.d = 2;
                        return lw0Var;
                    case 1:
                        return new vke(((tke) je7Var2.getValue()).e(), (h84) this.b.getValue());
                    default:
                        lw0 lw0Var2 = new lw0();
                        lw0Var2.a = (hw0) je7Var2.getValue();
                        lw0Var2.c = (p24) this.e.getValue();
                        lw0Var2.d = 2;
                        return lw0Var2;
                }
            }
        });
        final int i2 = 1;
        this.e = new khe(new k56() { // from class: l65
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        lw0 lw0Var = new lw0();
                        lw0Var.a = (hw0) je7Var.getValue();
                        lw0Var.c = (p24) this.c.getValue();
                        lw0Var.d = 2;
                        return lw0Var;
                    case 1:
                        return new vke(((tke) je7Var.getValue()).e(), (h84) this.b.getValue());
                    default:
                        lw0 lw0Var2 = new lw0();
                        lw0Var2.a = (hw0) je7Var.getValue();
                        lw0Var2.c = (p24) this.e.getValue();
                        lw0Var2.d = 2;
                        return lw0Var2;
                }
            }
        });
        final int i3 = 2;
        this.f = new khe(new k56() { // from class: l65
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        lw0 lw0Var = new lw0();
                        lw0Var.a = (hw0) je7Var2.getValue();
                        lw0Var.c = (p24) this.c.getValue();
                        lw0Var.d = 2;
                        return lw0Var;
                    case 1:
                        return new vke(((tke) je7Var2.getValue()).e(), (h84) this.b.getValue());
                    default:
                        lw0 lw0Var2 = new lw0();
                        lw0Var2.a = (hw0) je7Var2.getValue();
                        lw0Var2.c = (p24) this.e.getValue();
                        lw0Var2.d = 2;
                        return lw0Var2;
                }
            }
        });
    }

    public final p24 a(Uri uri, boolean z) {
        tke tkeVar = (tke) this.a.getValue();
        boolean zD = !tkeVar.c ? false : tkeVar.d(uri.getHost());
        return z ? zD ? (p24) this.f.getValue() : (p24) this.d.getValue() : zD ? (p24) this.e.getValue() : (p24) this.c.getValue();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;

/* loaded from: classes2.dex */
public final class cz4 implements lx4 {
    public final Context a;
    public final khe b;
    public final iy4 c;
    public final adb d = new adb(6);
    public final khe e;
    public final khe f;

    public cz4(Context context, je7 je7Var) {
        this.a = context;
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: bz4
            public final /* synthetic */ cz4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                sy4 sy4Var;
                switch (i) {
                    case 0:
                        try {
                            sy4Var = new sy4(this.b.a.getResources());
                        } catch (Exception unused) {
                            sy4Var = null;
                        }
                        return new ux4(sy4Var);
                    default:
                        cz4 cz4Var = this.b;
                        return new dy4((ux4) cz4Var.b.getValue(), cz4Var.d, cz4Var.c, cz4Var.e);
                }
            }
        });
        this.c = new iy4(context);
        this.e = new khe(new yf3(this, 4, je7Var));
        final int i2 = 1;
        this.f = new khe(new k56(this) { // from class: bz4
            public final /* synthetic */ cz4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                sy4 sy4Var;
                switch (i2) {
                    case 0:
                        try {
                            sy4Var = new sy4(this.b.a.getResources());
                        } catch (Exception unused) {
                            sy4Var = null;
                        }
                        return new ux4(sy4Var);
                    default:
                        cz4 cz4Var = this.b;
                        return new dy4((ux4) cz4Var.b.getValue(), cz4Var.d, cz4Var.c, cz4Var.e);
                }
            }
        });
    }

    @Override // defpackage.lx4
    public final mn5 a() {
        return ((gy4) this.e.getValue()).e;
    }

    @Override // defpackage.lx4
    public final void b(Activity activity) {
        ((gy4) this.e.getValue()).b(activity);
    }

    public final mwd c(String str) {
        ty4 ty4VarA = ((ux4) this.b.getValue()).a(str, 0, str.length());
        if (ty4VarA == null) {
            return null;
        }
        iy4 iy4Var = this.c;
        iy4Var.getClass();
        return new mwd(ty4VarA, tu0.G(28 * fk4.d().getDisplayMetrics().density), new nw4(this.d, iy4Var, (gy4) this.e.getValue(), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.d(java.lang.CharSequence):java.util.List");
    }

    public final Spannable e(int i, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        dy4 dy4Var = (dy4) this.f.getValue();
        dy4Var.getClass();
        Spannable spannableNewSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        y8 y8Var = new y8(spannableNewSpannable);
        int iB = 0;
        while (iB < length) {
            int iE = y8Var.E(iB);
            cvd[] cvdVarArr = (cvd[]) y8Var.a;
            cvd cvdVar = iE < 0 ? null : cvdVarArr[iE];
            if (cvdVar == null) {
                int iE2 = y8Var.E(iB);
                int i2 = (iE2 < 0 || iE2 > cvdVarArr.length + (-1)) ? -1 : cvdVarArr[iE2 + 1].a;
                if (i2 == -1) {
                    i2 = length;
                }
                ty4 ty4VarA = dy4Var.a.a(spannableNewSpannable, iB, i2);
                if (ty4VarA != null) {
                    gy4 gy4Var = (gy4) dy4Var.d.getValue();
                    iy4 iy4Var = dy4Var.c;
                    adb adbVar = dy4Var.b;
                    nw4 nw4Var = new nw4(adbVar, iy4Var, gy4Var, 0);
                    mw7 mw7Var = (mw7) adbVar.c;
                    kvd kvdVar = (kvd) mw7Var.c(ty4VarA);
                    if (kvdVar == null) {
                        kvdVar = new kvd(0);
                        mw7Var.d(ty4VarA, kvdVar);
                    }
                    mwd mwdVar = (mwd) kvdVar.c(i);
                    if (mwdVar == null) {
                        mwdVar = new mwd(ty4VarA, i, nw4Var);
                        kvdVar.d(i, mwdVar);
                    }
                    spannableNewSpannable.setSpan(new ey4(mwdVar), iB, ty4VarA.b() + iB, 33);
                    iB += ty4VarA.b();
                } else {
                    iB++;
                }
            } else {
                iB = cvdVar.b;
            }
        }
        return spannableNewSpannable;
    }
}

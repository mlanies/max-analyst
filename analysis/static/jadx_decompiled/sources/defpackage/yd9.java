package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class yd9 implements pa5 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable o;

    public yd9(yw1 yw1Var, Rational rational) {
        this.a = yw1Var.b();
        this.b = yw1Var.g();
        this.o = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public yze mo6B(int i, int i2) {
        if (i2 == 2) {
            this.a = i;
        } else if (i2 == 1) {
            this.b = i;
        }
        HashMap map = (HashMap) this.o;
        xd9 xd9Var = (xd9) map.get(Integer.valueOf(i2));
        if (xd9Var != null) {
            return xd9Var;
        }
        xd9 xd9Var2 = new xd9();
        map.put(Integer.valueOf(i2), xd9Var2);
        return xd9Var2;
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
        this.c = true;
    }

    public Size a(ev6 ev6Var) {
        int iF0 = ev6Var.f0(0);
        Size size = (Size) ev6Var.f(ev6.F, null);
        if (size == null) {
            return size;
        }
        int iM = kp.m(kp.C(iF0), this.a, 1 == this.b);
        return (iM == 90 || iM == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @Override // defpackage.pa5
    public void w() {
    }

    public yd9() {
        this.a = -1;
        this.b = -1;
        this.o = new HashMap();
    }
}

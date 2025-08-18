package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ yc8 Y;
    public final /* synthetic */ es8 Z;
    public final /* synthetic */ Long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc8(Object obj, Continuation continuation, yc8 yc8Var, es8 es8Var, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = yc8Var;
        this.Z = es8Var;
        this.s0 = l;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tc8(this.X, continuation, this.Y, this.Z, this.s0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        l20 l20Var;
        Context context;
        String str;
        hm9 tm8Var;
        Object next;
        uf5 uf5VarW;
        Context context2;
        long j;
        jqe eqeVar;
        od2.a0(obj);
        l20 l20Var2 = (l20) this.X;
        if ((l20Var2 != null ? l20Var2.j : null) == null) {
            return null;
        }
        long jHashCode = l20Var2.r.hashCode();
        yc8 yc8Var = this.Y;
        Context context3 = yc8Var.a;
        Locale localeV = ((hyc) yc8Var.b).v();
        es8 es8Var = this.Z;
        String strS = ay7.s(context3, localeV, es8Var.a.o, true);
        s10 s10Var = l20Var2.j;
        l20 l20Var3 = s10Var.d;
        int i = (l20Var3 == null || !l20Var3.i()) ? (l20Var3 == null || !l20Var3.f() || l20Var3.b.X) ? 3 : 1 : 2;
        d20 d20Var = l20Var2.o;
        int i2 = d20Var == null ? -1 : qc8.$EnumSwitchMapping$1[d20Var.ordinal()];
        Context context4 = yc8Var.a;
        cu8 cu8Var = es8Var.a;
        long j2 = s10Var.b;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            l20Var = l20Var2;
            context = context4;
            str = strS;
            tm8Var = new tm8(new iqe(are.w(j2, false, context)));
        } else {
            Long l = this.s0;
            if (i2 == 4) {
                l20Var = l20Var2;
                context = context4;
                str = strS;
                iqe iqeVar = new iqe(are.w(j2, false, context));
                long j3 = cu8Var.b;
                if (l != null) {
                    int i3 = (j3 > l.longValue() ? 1 : (j3 == l.longValue() ? 0 : -1));
                }
                tm8Var = new rm8(iqeVar);
            } else if (i2 != 5) {
                iqe iqeVar2 = new iqe(are.w(j2, false, context4));
                long j4 = cu8Var.b;
                if (l != null) {
                    int i4 = (j4 > l.longValue() ? 1 : (j4 == l.longValue() ? 0 : -1));
                }
                context = context4;
                tm8Var = new rm8(iqeVar2);
                str = strS;
                l20Var = l20Var2;
            } else {
                long j5 = s10Var.a;
                l20Var = l20Var2;
                float f = l20Var.q;
                if (j5 == 0) {
                    context2 = context4;
                    j = (long) (j2 * (f / 100.0f));
                } else {
                    context2 = context4;
                    j = l20Var.v;
                }
                str = strS;
                long j6 = l20Var.u;
                if (j6 > 0) {
                    context = context2;
                    eqeVar = new iqe(rh4.j(are.w(j, false, context), "/", are.v(j6, are.m(j6), true, context)));
                } else {
                    context = context2;
                    eqeVar = new eqe(oda.t);
                }
                tm8Var = new sm8(eqeVar, f);
            }
        }
        long j7 = cu8Var.b;
        String strF = l20Var3 != null ? fp3.F(l20Var3) : null;
        String strW = are.w(j2, false, context);
        String strF2 = s5c.F(s10Var);
        v25 v25Var = sf5.c;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (eae.k0(((sf5) next).name(), strF2, true)) {
                break;
            }
        }
        uf5 uf5Var = (sf5) next;
        if (uf5Var != null) {
            uf5VarW = uf5Var;
        } else {
            tf5 tf5Var = tf5.c;
            uf5VarW = ema.w(strF2);
        }
        return new um8(jHashCode, j7, s10Var.a, strF, s10Var.c, str, strW, l20Var.r, l20Var.s, i, tm8Var, uf5VarW);
    }
}

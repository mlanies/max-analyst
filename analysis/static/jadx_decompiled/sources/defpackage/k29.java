package defpackage;

import android.content.Context;
import android.text.Layout;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class k29 {
    public final Context a;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ContextScope h;
    public final khe i;
    public final String b = k29.class.getName();
    public final khe f = new khe(new b29(100, 0));
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public k29(kke kkeVar, oe3 oe3Var, je7 je7Var, je7 je7Var2, je7 je7Var3, Context context) {
        this.a = context;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var3;
        this.h = j1e.a(((w9a) kkeVar).a());
        this.i = new khe(new ga5(6, je7Var));
        oe3Var.a(oe3.c | oe3.d, new c29(0, this));
    }

    public static by8 c(k29 k29Var, e52 e52Var, es8 es8Var, boolean z) {
        k29Var.getClass();
        e29 e29Var = new e29(e52Var, es8Var, false);
        mw7 mw7VarE = k29Var.e();
        Object objC = mw7VarE.c(e29Var);
        if (objC == null) {
            objC = k29Var.a(e52Var, es8Var, null, false);
            mw7VarE.d(e29Var, objC);
        }
        ie7 ie7Var = (ie7) objC;
        return z ? ie7Var.a : ie7Var.b;
    }

    public final ie7 a(final e52 e52Var, final es8 es8Var, final CharSequence charSequence, final boolean z) {
        Iterable<es8> iterableSingletonList;
        khe kheVar;
        e29 e29Var = new e29(e52Var, es8Var, z);
        ((eka) ((mqe) this.d.getValue())).getClass();
        bw8 bw8Var = es8Var.c;
        if (bw8Var == null || bw8Var.a != 1) {
            iterableSingletonList = nz4.a;
        } else {
            es8 es8VarA = bw8Var.c;
            if (es8VarA.a() != null) {
                es8VarA = es8VarA.a();
            }
            iterableSingletonList = Collections.singletonList(new dka(es8VarA.a, es8VarA.b, es8VarA.c, es8VarA.o, es8VarA.X, es8VarA.Y, es8VarA.Z, es8VarA.s0));
        }
        for (es8 es8Var2 : iterableSingletonList) {
            if (es8Var2 != es8Var) {
                a(e52Var, es8Var2, null, true);
            }
        }
        ie7 ie7Var = (ie7) e().c(e29Var);
        final int iB = ((w6a) d()).b();
        final int iB2 = ((w6a) d()).b();
        final int i = 0;
        khe kheVar2 = new khe(new k56(this) { // from class: d29
            public final /* synthetic */ k29 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                }
                return this.b.b(e52Var, es8Var, iB, charSequence, z);
            }
        });
        boolean z2 = iB == iB2;
        if (z2) {
            kheVar = kheVar2;
        } else {
            final int i2 = 1;
            kheVar = kheVar2;
            kheVar2 = new khe(new k56(this) { // from class: d29
                public final /* synthetic */ k29 b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i2) {
                    }
                    return this.b.b(e52Var, es8Var, iB2, charSequence, z);
                }
            });
        }
        boolean z3 = this.a.getResources().getConfiguration().orientation == 1;
        ContextScope contextScope = this.h;
        if (ie7Var != null) {
            by8 by8Var = ie7Var.b;
            if (z2 || z3) {
                Layout layout = (Layout) kheVar.getValue();
                by8 by8Var2 = ie7Var.a;
                by8Var2.b(layout);
                if (by8Var2 != by8Var) {
                    j47.T(contextScope, null, null, new f29(ie7Var, kheVar2, null), 3);
                }
            } else {
                by8Var.b((Layout) kheVar2.getValue());
                j47.T(contextScope, null, null, new g29(ie7Var, kheVar, null), 3);
            }
        } else {
            by8 by8Var3 = new by8(e52Var, es8Var, kheVar);
            by8 by8Var4 = z2 ? by8Var3 : new by8(e52Var, es8Var, kheVar2);
            ie7Var = new ie7(by8Var3, by8Var4);
            e().d(e29Var, ie7Var);
            if (z2 || z3) {
                by8Var3.b((Layout) kheVar.getValue());
                if (by8Var3 != by8Var4) {
                    j47.T(contextScope, null, null, new h29(ie7Var, kheVar2, null), 3);
                }
            } else {
                by8Var4.b((Layout) kheVar2.getValue());
                j47.T(contextScope, null, null, new i29(ie7Var, kheVar, null), 3);
            }
        }
        return ie7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[PHI: r8
      0x011a: PHI (r8v15 int) = (r8v9 int), (r8v11 int) binds: [B:45:0x0118, B:54:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout b(defpackage.e52 r32, defpackage.es8 r33, int r34, java.lang.CharSequence r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k29.b(e52, es8, int, java.lang.CharSequence, boolean):android.text.Layout");
    }

    public final os0 d() {
        return (os0) this.c.getValue();
    }

    public final mw7 e() {
        return (mw7) this.f.getValue();
    }
}

package defpackage;

import android.view.View;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class db5 extends hqd {
    @Override // defpackage.hqd
    public final void B(ol7 ol7Var, Object obj) {
        fb5 fb5Var = (fb5) ol7Var;
        eb5 eb5Var = obj instanceof eb5 ? (eb5) obj : null;
        if (eb5Var != null) {
            BitSet bitSet = (BitSet) eb5Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z || bitSet.get(5)) {
                ((m62) view).c(fb5Var.b, fb5Var.s0, Long.valueOf(fb5Var.a));
            }
            if (bitSet.get(1)) {
                ((m62) view).setOnline(fb5Var.c);
            }
            if (bitSet.get(2)) {
                ((m62) view).setTitle(fb5Var.X);
            }
            if (bitSet.get(3)) {
                ((m62) view).setSubtitle(fb5Var.Y);
            }
            bitSet.get(4);
            if (bitSet.get(6)) {
                ((m62) view).setVerified(fb5Var.o);
            }
        }
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(fb5 fb5Var) {
        m62 m62Var = (m62) this.a;
        long j = fb5Var.a;
        m62Var.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        m62Var.setTitle(fb5Var.X);
        m62Var.setSubtitle(fb5Var.Y);
        m62Var.c(fb5Var.b, fb5Var.s0, Long.valueOf(j));
        m62Var.setOnline(fb5Var.c);
        m62Var.setVerified(fb5Var.o);
    }
}

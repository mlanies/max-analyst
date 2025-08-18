package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class hb5 extends hqd {
    public m56 F0;
    public m56 G0;

    @Override // defpackage.hqd
    public final void B(ol7 ol7Var, Object obj) {
        fb5 fb5Var = (fb5) ol7Var;
        eb5 eb5Var = obj instanceof eb5 ? (eb5) obj : null;
        if (eb5Var != null) {
            BitSet bitSet = (BitSet) eb5Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                lk3 lk3Var = (lk3) view;
                Uri uri = fb5Var.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                lk3Var.O(fb5Var.a, fb5Var.s0, uri.toString());
            }
            if (bitSet.get(2)) {
                ((lk3) view).setName(fb5Var.X);
            }
            boolean z2 = bitSet.get(3);
            CharSequence charSequence = fb5Var.Y;
            if (z2) {
                ((lk3) view).setMessage(charSequence);
            }
            if (bitSet.get(4)) {
                lk3 lk3Var2 = (lk3) view;
                if (fb5Var.Z) {
                    tu0.K(lk3Var2, 300L, new gb5(this, fb5Var, 2));
                    lk3Var2.setMessage(charSequence);
                    lk3Var2.N();
                } else {
                    tu0.K(lk3Var2, 300L, new gb5(this, fb5Var, 3));
                    if (charSequence == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    lk3Var2.P(charSequence, new yf3(this, 8, fb5Var));
                    lk3Var2.setMessage(null);
                }
            }
        }
    }

    @Override // defpackage.hqd
    public final void D() {
        this.F0 = null;
        this.G0 = null;
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(fb5 fb5Var) {
        lk3 lk3Var = (lk3) this.a;
        long j = fb5Var.a;
        lk3Var.setId((int) (j >> 32));
        if (fb5Var.Z) {
            lk3Var.setMessage(fb5Var.Y);
        } else {
            lk3Var.setMessage(null);
        }
        lk3Var.setName(fb5Var.X);
        Uri uri = fb5Var.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        lk3Var.O(j, fb5Var.s0, uri.toString());
    }
}

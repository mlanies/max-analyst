package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class om1 extends hqd implements dn1 {
    public final en1 F0;

    public om1(mm1 mm1Var, en1 en1Var) {
        super(mm1Var);
        this.F0 = en1Var;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        ud1 ud1Var = (ud1) ol7Var;
        en1 en1Var = this.F0;
        en1Var.a.add(this);
        x(en1Var.b);
        mm1 mm1Var = (mm1) this.a;
        mm1Var.setOpponents(ud1Var.b);
        mm1Var.F(ud1Var.c, ud1Var.o);
        x(en1Var.b);
    }

    @Override // defpackage.hqd
    public final void B(ol7 ol7Var, Object obj) {
        ud1 ud1Var = (ud1) ol7Var;
        td1 td1Var = obj instanceof td1 ? (td1) obj : null;
        View view = this.a;
        if (td1Var != null) {
            BitSet bitSet = (BitSet) td1Var.b;
            if (bitSet.get(0)) {
                ((mm1) view).setOpponents(ud1Var.b);
            }
            if (bitSet.get(1)) {
                ((mm1) view).F(ud1Var.c, ud1Var.o);
                return;
            }
            return;
        }
        en1 en1Var = this.F0;
        en1Var.a.add(this);
        x(en1Var.b);
        mm1 mm1Var = (mm1) view;
        mm1Var.setOpponents(ud1Var.b);
        mm1Var.F(ud1Var.c, ud1Var.o);
        x(en1Var.b);
    }

    @Override // defpackage.dn1
    public final void x(cn1 cn1Var) {
        int i = cn1Var != null ? cn1Var.a : 0;
        int i2 = i == 0 ? -1 : nm1.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            View view = this.a;
            if (i2 == 1) {
                mm1 mm1Var = (mm1) view;
                mm1Var.setStatus(null);
                mm1Var.setTitle(null);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mm1 mm1Var2 = (mm1) view;
                mm1Var2.setTitle(cn1Var.b);
                mm1Var2.setStatus(cn1Var.c);
            }
        }
    }
}

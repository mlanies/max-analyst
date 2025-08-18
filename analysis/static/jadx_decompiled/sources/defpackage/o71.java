package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class o71 extends hqd {
    public final m71 F0;

    public o71(FrameLayout frameLayout) {
        super(frameLayout);
        this.F0 = (m71) frameLayout.findViewById(rvb.call_opponents);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        this.F0.setOpponents((sma) ol7Var);
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void B(sma smaVar, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        m71 m71Var = this.F0;
        if (list == null || list.isEmpty()) {
            m71Var.setOpponents(smaVar);
            return;
        }
        pk5 pk5Var = new pk5(l6d.Z(new um5(new at(2, list), new k8(20), n6d.a), n71.b));
        while (pk5Var.hasNext()) {
            rma rmaVar = (rma) pk5Var.next();
            if (!(rmaVar instanceof rma)) {
                throw new NoWhenBranchMatchedException();
            }
            m71Var.setOpponents(rmaVar.a);
        }
    }
}

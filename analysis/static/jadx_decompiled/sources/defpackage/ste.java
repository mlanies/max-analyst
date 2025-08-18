package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ste extends hl7 {
    public ste() {
        super(y34.g);
        A(true);
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        return ((qte) C(i)).a;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        ((rte) decVar).F0.setText(((qte) C(i)).b);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new rte(LayoutInflater.from(viewGroup.getContext()).inflate(pyb.number_item, viewGroup, false));
    }
}

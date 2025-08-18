package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class b44 extends hl7 {
    @Override // defpackage.hdc
    public final long k(int i) {
        return ((x34) C(i)).a;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        ((a44) decVar).F0.setText(((x34) C(i)).X);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(pyb.day_item, viewGroup, false);
        viewInflate.setPivotX(0.0f);
        return new a44(viewInflate);
    }
}

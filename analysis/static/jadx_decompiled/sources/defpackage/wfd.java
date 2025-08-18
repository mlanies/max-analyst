package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class wfd extends hqd {
    public lfd F0;

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        ((ufd) this.a).setModelItem((kfd) ol7Var);
    }

    @Override // defpackage.hqd
    public final void D() {
        this.F0 = null;
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void B(kfd kfdVar, Object obj) {
        ifd ifdVar = obj instanceof ifd ? (ifd) obj : null;
        View view = this.a;
        if (ifdVar == null) {
            ((ufd) view).setModelItem(kfdVar);
            return;
        }
        BitSet bitSet = (BitSet) ifdVar.b;
        bitSet.get(0);
        if (bitSet.get(1)) {
            ((ufd) view).setTitle(kfdVar.getTitle());
        }
        if (bitSet.get(2)) {
            ((ufd) view).setType(kfdVar.getType());
        }
        if (bitSet.get(3)) {
            ((ufd) view).setDescription(kfdVar.b());
        }
        if (bitSet.get(4)) {
            Integer numF = kfdVar.f();
            if (numF != null) {
                ((ufd) view).setStartIcon(numF.intValue());
            } else {
                ((ufd) view).setStartIcon((Drawable) null);
            }
        }
        if (bitSet.get(5)) {
            ufd ufdVar = (ufd) view;
            ufdVar.setOnSwitchListener(null);
            ufdVar.setEndView(kfdVar.e());
            if (kfdVar.e() instanceof ffd) {
                ufdVar.setOnSwitchCheckedListener(new bk(15, this));
            }
        }
        if (bitSet.get(6)) {
            ((ufd) view).setCounter(kfdVar.c());
        }
        if (bitSet.get(7)) {
            ((ufd) view).setUpperText(kfdVar.d());
        }
        if (bitSet.get(8)) {
            ((ufd) view).setStartIconPadding(kfdVar.q());
        }
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class mfd extends ppd {
    public final lfd X;

    public mfd(lfd lfdVar, ExecutorService executorService) {
        super(executorService);
        this.X = lfdVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(wfd wfdVar, int i) {
        kfd kfdVar = (kfd) ((ol7) C(i));
        View view = wfdVar.a;
        ((ufd) view).setModelItem(kfdVar);
        lfd lfdVar = this.X;
        wfdVar.F0 = lfdVar;
        if (kfdVar.e() instanceof ffd) {
            ((ufd) view).setOnSwitchCheckedListener(new bk(16, lfdVar));
        } else {
            ((ufd) view).setOnSwitchListener(null);
        }
        tu0.K(view, 300L, new v7d(lfdVar, 2, kfdVar));
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        wfd wfdVar = (wfd) decVar;
        if (!(!list.isEmpty())) {
            r(wfdVar, i);
            return;
        }
        ifd ifdVar = new ifd(7);
        for (Object obj : list) {
            ifd ifdVar2 = obj instanceof ifd ? (ifd) obj : null;
            if (ifdVar2 != null) {
                ifdVar.M1(ifdVar2);
            }
        }
        wfdVar.B((kfd) this.o.f.get(i), ifdVar);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        return new wfd(new ufd(viewGroup.getContext(), null));
    }
}

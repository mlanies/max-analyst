package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class nxa extends ppd {
    public final mxa X;
    public final int Y;

    public nxa(mxa mxaVar, ExecutorService executorService, int i) {
        super(executorService);
        this.X = mxaVar;
        this.Y = i;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(qxa qxaVar, int i) {
        pxa pxaVar = (pxa) ((ol7) C(i));
        v59 v59Var = new v59(2, this.X, mxa.class, "onItemClick", "onItemClick(JLone/me/chats/picker/PickerEntity$Type;)V", 0, 4);
        v59 v59Var2 = new v59(2, this.X, mxa.class, "onItemLongClick", "onItemLongClick(JLone/me/chats/picker/PickerEntity$Type;)Z", 0, 5);
        qxaVar.A(pxaVar);
        vu5 vu5Var = new vu5(v59Var, 23, pxaVar);
        View view = qxaVar.a;
        tu0.K(view, 300L, vu5Var);
        ((lk3) view).setOnLongClickListener(new ad2(v59Var2, 5, pxaVar));
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        int i2 = rxa.a;
        return rxa.a;
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        lk3 lk3Var = new lk3(viewGroup.getContext(), null);
        qxa qxaVar = new qxa(lk3Var);
        int i2 = this.Y;
        if (i2 > 0) {
            lk3Var.setPaddingRelative(tu0.G(i2 * fk4.d().getDisplayMetrics().density), lk3Var.getPaddingTop(), lk3Var.getPaddingEnd(), lk3Var.getPaddingBottom());
        }
        return qxaVar;
    }
}

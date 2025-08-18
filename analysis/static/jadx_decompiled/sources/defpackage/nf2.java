package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class nf2 extends ppd {
    public final mf2 X;

    public nf2(ExecutorService executorService, mf2 mf2Var) {
        super(executorService);
        this.X = mf2Var;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(of2 of2Var, int i) {
        xm8 xm8Var = (xm8) ((ol7) C(i));
        if (xm8Var instanceof um8) {
            of2Var.E(xm8Var, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 8), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 3));
            return;
        }
        if (!(xm8Var instanceof vm8)) {
            if (xm8Var instanceof wm8) {
                of2Var.E(xm8Var, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 11), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 5));
                return;
            } else {
                if (!(xm8Var instanceof qm8)) {
                    throw new NoWhenBranchMatchedException();
                }
                of2Var.E(xm8Var, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 12), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 6));
                return;
            }
        }
        bd2 bd2Var = of2Var instanceof bd2 ? (bd2) of2Var : null;
        if (bd2Var != null) {
            vm8 vm8Var = (vm8) xm8Var;
            f fVar = new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 9);
            vw vwVar = new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 4);
            f fVar2 = new f(1, this.X, mf2.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0, 10);
            lf2 lf2Var = (lf2) bd2Var.a;
            bd2Var.A(vm8Var);
            tu0.K(lf2Var, 300L, new yc2(fVar, vm8Var, 0));
            lf2Var.setOnLongClickListener(new zc2(vwVar, vm8Var, bd2Var, 0));
            lf2Var.setLinkOnLongClickListener(new ad2(fVar2, 0, vm8Var));
            lf2Var.setOnLinkClickListener(new yc2(fVar2, vm8Var, 1));
        }
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        return ((xm8) this.o.f.get(i)).getI0();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int iOrdinal = ((ih2) ih2.o.get(i)).ordinal();
        if (iOrdinal == 0) {
            return new a62(new sg2(viewGroup.getContext(), null), 1);
        }
        if (iOrdinal == 1) {
            return new na2(new kf2(viewGroup.getContext(), null));
        }
        if (iOrdinal == 2) {
            return new bd2(new lf2(viewGroup.getContext(), null));
        }
        if (iOrdinal == 3) {
            return new a62(new td2(viewGroup.getContext(), null), 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}

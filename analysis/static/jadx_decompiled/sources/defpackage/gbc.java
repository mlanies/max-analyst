package defpackage;

import android.graphics.drawable.InsetDrawable;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class gbc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ gbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        khe kheVarD;
        int i = 1;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                int iOrdinal = recordControlsWidget.H0().ordinal();
                if (iOrdinal == 0) {
                    return new eif();
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f9g f9gVar = f9g.a;
                return new c50(f9gVar.getAccessor().d(kke.class), f9gVar.getAccessor().d(ch9.class));
            case 1:
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                if (recordControlsWidget.H0() == bac.b) {
                    return new p70();
                }
                return null;
            case 2:
                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                bac bacVarH0 = recordControlsWidget.H0();
                jac jacVar = (jac) recordControlsWidget.b.getValue();
                int iOrdinal2 = recordControlsWidget.H0().ordinal();
                if (iOrdinal2 == 0) {
                    kheVarD = f9g.a.getAccessor().d(ejf.class);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kheVarD = f9g.a.getAccessor().d(o60.class);
                }
                return new cbc(bacVarH0, jacVar, kheVarD, new khe(new gbc(recordControlsWidget, 0)), new khe(new gbc(recordControlsWidget, i)));
            case 3:
                return kt3.b(recordControlsWidget.getContext(), recordControlsWidget.F0.a);
            case 4:
                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                return kt3.b(recordControlsWidget.getContext(), woc.U0);
            default:
                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                float f = 2;
                return new InsetDrawable(kt3.b(recordControlsWidget.getContext(), woc.o), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        }
    }
}

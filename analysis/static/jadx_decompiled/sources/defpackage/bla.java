package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class bla extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cla o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bla(cla claVar, int i, boolean z) {
        super(9, (Object) null);
        this.c = i;
        this.o = claVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        switch (this.c) {
            case 0:
                fka fkaVarJ = (fka) obj2;
                if (tpa.f((fka) obj, fkaVarJ)) {
                    return;
                }
                cla claVar = this.o;
                if (fkaVarJ == null) {
                    fkaVarJ = qp4.u0.j(claVar);
                }
                claVar.onThemeChanged(fkaVarJ);
                return;
            case 1:
                if (((uka) obj) != ((uka) obj2)) {
                    cla claVar2 = this.o;
                    claVar2.l();
                    claVar2.k();
                    if (claVar2.g()) {
                        return;
                    }
                    claVar2.requestLayout();
                    return;
                }
                return;
            case 2:
                ska skaVar = (ska) obj2;
                if (tpa.f((ska) obj, skaVar)) {
                    return;
                }
                cla claVar3 = this.o;
                cla.d(claVar3, skaVar);
                claVar3.k();
                if (claVar3.g()) {
                    return;
                }
                claVar3.requestLayout();
                return;
            case 3:
                final qka qkaVar = (qka) obj2;
                qka qkaVar2 = (qka) obj;
                cla claVar4 = this.o;
                if ((claVar4.getForm() == uka.a || claVar4.getForm() == uka.c) && !tpa.f(qkaVar2, qkaVar)) {
                    claVar4.removeView(claVar4.A0);
                    Context context = claVar4.getContext();
                    fka customTheme = claVar4.getCustomTheme();
                    OneMeButton oneMeButton2 = null;
                    if (qkaVar instanceof kka) {
                        oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(woc.d0), true);
                        final int i = 0;
                        tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: owe
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i) {
                                    case 0:
                                        ((kka) qkaVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((lka) qkaVar).a.invoke(view);
                                        break;
                                    default:
                                        ((vka) ((oka) qkaVar).a).b.invoke(view);
                                        break;
                                }
                            }
                        });
                    } else if (qkaVar instanceof lka) {
                        oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(woc.p0), true);
                        final int i2 = 1;
                        tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: owe
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        ((kka) qkaVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((lka) qkaVar).a.invoke(view);
                                        break;
                                    default:
                                        ((vka) ((oka) qkaVar).a).b.invoke(view);
                                        break;
                                }
                            }
                        });
                    } else if (qkaVar instanceof oka) {
                        yka ykaVar = ((oka) qkaVar).a;
                        if (!(ykaVar instanceof vka)) {
                            if (!(ykaVar instanceof xka) && !(ykaVar instanceof wka)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new jr9("Left action should not support search icon");
                        }
                        OneMeButton oneMeButton3 = new OneMeButton(context, null);
                        oneMeButton3.setCustomTheme(customTheme);
                        oneMeButton3.d(Integer.valueOf(((vka) ykaVar).a), true);
                        final int i3 = 2;
                        tu0.K(oneMeButton3, 300L, new View.OnClickListener() { // from class: owe
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        ((kka) qkaVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((lka) qkaVar).a.invoke(view);
                                        break;
                                    default:
                                        ((vka) ((oka) qkaVar).a).b.invoke(view);
                                        break;
                                }
                            }
                        });
                        oneMeButton = oneMeButton3;
                    } else {
                        if (!(qkaVar instanceof nka)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oneMeButton = null;
                    }
                    if (oneMeButton != null) {
                        oneMeButton.setId(xoc.O);
                        oneMeButton2 = oneMeButton;
                    }
                    claVar4.A0 = oneMeButton2;
                    if (oneMeButton2 != null) {
                        claVar4.addView(oneMeButton2);
                        f46.C(oneMeButton2, tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(52 * fk4.d().getDisplayMetrics().density));
                    }
                    claVar4.k();
                    if (claVar4.g()) {
                        return;
                    }
                    claVar4.requestLayout();
                    return;
                }
                return;
            case 4:
                kpa kpaVar = (kpa) obj2;
                cla claVar5 = this.o;
                int iOrdinal = claVar5.getForm().ordinal();
                if (iOrdinal == 0) {
                    iIntValue = kpaVar != null ? ((Number) kpaVar.a).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
                    iIntValue2 = kpaVar != null ? ((Number) kpaVar.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iIntValue3 = kpaVar != null ? ((Number) kpaVar.a).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        iIntValue4 = kpaVar != null ? ((Number) kpaVar.b).intValue() : tu0.G(4 * fk4.d().getDisplayMetrics().density);
                        claVar5.setPadding(iIntValue3, 0, iIntValue4, 0);
                        return;
                    }
                    iIntValue = kpaVar != null ? ((Number) kpaVar.a).intValue() : tu0.G(16 * fk4.d().getDisplayMetrics().density);
                    iIntValue2 = kpaVar != null ? ((Number) kpaVar.b).intValue() : tu0.G(12 * fk4.d().getDisplayMetrics().density);
                }
                iIntValue3 = iIntValue;
                iIntValue4 = iIntValue2;
                claVar5.setPadding(iIntValue3, 0, iIntValue4, 0);
                return;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                cla claVar6 = this.o;
                if (zBooleanValue2 != zBooleanValue) {
                    claVar6.k();
                }
                if (claVar6.v0.a()) {
                    ((fmd) claVar6.v0.getValue()).a(zBooleanValue);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bla(cla claVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                nka nkaVar = nka.a;
                this.o = claVar;
                super(9, nkaVar);
                break;
            case 3:
                nka nkaVar2 = nka.a;
                this.o = claVar;
                super(9, nkaVar2);
                break;
            case 4:
            default:
                uka ukaVar = uka.a;
                this.o = claVar;
                super(9, ukaVar);
                break;
            case 5:
                Boolean bool = Boolean.FALSE;
                this.o = claVar;
                super(9, bool);
                break;
        }
    }
}

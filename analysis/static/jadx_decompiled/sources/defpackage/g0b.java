package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class g0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g0b g0bVar = (g0b) n((d1b) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g0b g0bVar = new g0b(this.Z, continuation, this.Y);
        g0bVar.X = obj;
        return g0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        d1b d1bVar = (d1b) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        Continuation continuation = null;
        if (d1bVar instanceof c1b) {
            if (pinBarsWidget.Y == null) {
                pea peaVar = new pea(pinBarsWidget.getContext());
                peaVar.setId(mea.f);
                peaVar.setCloseBtnClickListener(new zza(pinBarsWidget, i));
                peaVar.setOnClickListener(new zza(pinBarsWidget, 1));
                v3c.y(new xh0(3, continuation, 27), peaVar);
                pinBarsWidget.Y = peaVar;
                int childCount = viewGroup.getChildCount();
                viewGroup.addView(peaVar, childCount < 0 ? childCount : 0);
            }
            pea peaVar2 = pinBarsWidget.Y;
            if (peaVar2 != null) {
                c1b c1bVar = (c1b) d1bVar;
                CharSequence charSequenceB = c1bVar.b.b(pinBarsWidget.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                peaVar2.setSubtitle(charSequenceB);
                peaVar2.setCloseButtonVisibility(c1bVar.c);
            }
        } else {
            viewGroup.removeView(viewGroup.findViewById(mea.f));
            pinBarsWidget.Y = null;
        }
        return e5f.a;
    }
}

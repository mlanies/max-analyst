package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class h0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h0b h0bVar = (h0b) n((bb9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h0b h0bVar = new h0b(this.Z, continuation, this.Y);
        h0bVar.X = obj;
        return h0bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 2;
        int i2 = 3;
        od2.a0(obj);
        bb9 bb9Var = (bb9) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i3 = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        db9 db9Var = null;
        Object[] objArr = 0;
        if (bb9Var instanceof ab9) {
            if (pinBarsWidget.X == null) {
                eb9 eb9Var = new eb9(pinBarsWidget.getContext(), null);
                eb9Var.setId(mea.g);
                eb9Var.setOnCloseClickListener(new zza(pinBarsWidget, i));
                eb9Var.setOnPlaybackSpeedClick(new wz7(19, pinBarsWidget));
                eb9Var.setOnPlaybackClickListener(new zza(pinBarsWidget, i2));
                tu0.K(eb9Var, 300L, new zza(pinBarsWidget, 4));
                eb9Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                v3c.y(new xh0(i2, (Continuation) (objArr == true ? 1 : 0), 26), eb9Var);
                pinBarsWidget.X = eb9Var;
                int childCount = viewGroup.getChildCount();
                if (1 <= childCount) {
                    childCount = 1;
                }
                viewGroup.addView(eb9Var, childCount);
            }
            eb9 eb9Var2 = pinBarsWidget.X;
            if (eb9Var2 != null) {
                ab9 ab9Var = (ab9) bb9Var;
                eb9Var2.setIsPlaying(ab9Var.d);
                eb9Var2.setTitle(ab9Var.a.b(eb9Var2.getContext()));
                eb9Var2.setSubtitle(ab9Var.b.b(eb9Var2.getContext()));
                d3b d3bVar = ab9Var.c;
                int i4 = d3bVar != null ? b0b.$EnumSwitchMapping$1[d3bVar.ordinal()] : -1;
                if (i4 == 1) {
                    db9Var = db9.a;
                } else if (i4 == 2) {
                    db9Var = db9.b;
                } else if (i4 == 3) {
                    db9Var = db9.c;
                }
                eb9Var2.setPlaybackSpeed(db9Var);
                eb9Var2.setProgress(((Number) pinBarsWidget.m0().y0.a.getValue()).floatValue());
            }
        } else {
            viewGroup.removeView(viewGroup.findViewById(mea.g));
            pinBarsWidget.X = null;
        }
        return e5f.a;
    }
}

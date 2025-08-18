package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class j0b extends ffe implements g66 {
    public /* synthetic */ bb9 X;
    public /* synthetic */ d1b Y;
    public /* synthetic */ g5f Z;
    public /* synthetic */ ah6 s0;
    public final /* synthetic */ PinBarsWidget t0;
    public final /* synthetic */ View u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(5, continuation);
        this.t0 = pinBarsWidget;
        this.u0 = view;
    }

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        PinBarsWidget pinBarsWidget = this.t0;
        j0b j0bVar = new j0b(this.u0, (Continuation) obj5, pinBarsWidget);
        j0bVar.X = (bb9) obj;
        j0bVar.Y = (d1b) obj2;
        j0bVar.Z = (g5f) obj3;
        j0bVar.s0 = (ah6) obj4;
        e5f e5fVar = e5f.a;
        j0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        g5f g5fVar;
        g5f g5fVar2;
        int i = 27;
        od2.a0(obj);
        bb9 bb9Var = this.X;
        d1b d1bVar = this.Y;
        g5f g5fVar3 = this.Z;
        ah6 ah6Var = this.s0;
        boolean z = d1bVar instanceof b1b;
        Continuation continuation = null;
        View view = this.u0;
        PinBarsWidget pinBarsWidget = this.t0;
        if (z && (bb9Var instanceof za9) && g5fVar3 != null && (ah6Var instanceof zg6)) {
            if (pinBarsWidget.Z == null) {
                k5f k5fVar = new k5f(pinBarsWidget.getContext());
                k5fVar.setId(mea.i);
                k5fVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                k5fVar.setOnAddContactClickListener(new zza(pinBarsWidget, 5));
                k5fVar.setOnBlockContactClickListener(new zza(pinBarsWidget, 6));
                v3c.y(new xh0(3, continuation, 28), k5fVar);
                pinBarsWidget.Z = k5fVar;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                if (childCount >= 0) {
                    childCount = 0;
                }
                viewGroup.addView(k5fVar, childCount);
            }
            j5f j5fVar = pinBarsWidget.m0().o;
            if (j5fVar != null && (g5fVar2 = (g5f) j5fVar.i.a.getValue()) != null) {
                long jN = ((hyc) ((q33) j5fVar.g.getValue())).n();
                el3 el3Var = j5fVar.b.a;
                el3Var.getClass();
                cqc.a(new dl3(0, g5fVar2.a, jN, el3Var), el3Var.m, null, new un0(i), null);
            }
        } else {
            View viewFindViewById = view.findViewById(mea.i);
            if (viewFindViewById != null) {
                int i2 = PinBarsWidget.t0;
                j5f j5fVar2 = pinBarsWidget.m0().o;
                if (j5fVar2 != null && (g5fVar = (g5f) j5fVar2.i.a.getValue()) != null) {
                    el3 el3Var2 = j5fVar2.b.a;
                    el3Var2.getClass();
                    cqc.a(new dl3(0, g5fVar.a, 0L, el3Var2), el3Var2.m, null, new un0(i), null);
                }
                ((ViewGroup) view).removeView(viewFindViewById);
                pinBarsWidget.Z = null;
            }
        }
        return e5f.a;
    }
}

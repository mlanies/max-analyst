package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class e0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e0b e0bVar = (e0b) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e0bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e0b e0bVar = new e0b(continuation, this.Y);
        e0bVar.X = obj;
        return e0bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ywe yweVar;
        od2.a0(obj);
        h50 h50Var = (h50) this.X;
        boolean zF = tpa.f(h50Var, f50.a);
        PinBarsWidget pinBarsWidget = this.Y;
        if (zF) {
            int i = PinBarsWidget.t0;
            ywe yweVar2 = pinBarsWidget.a;
            if (yweVar2 != null) {
                yweVar2.dismiss();
            }
            pinBarsWidget.a = null;
        } else {
            if (!(h50Var instanceof g50)) {
                throw new NoWhenBranchMatchedException();
            }
            jqe jqeVar = ((g50) h50Var).a;
            eb9 eb9Var = pinBarsWidget.X;
            if (eb9Var != null) {
                if (!eb9Var.isLaidOut() || eb9Var.isLayoutRequested()) {
                    eb9Var.addOnLayoutChangeListener(new l0b(eb9Var, pinBarsWidget, jqeVar));
                } else {
                    int[] iArr = new int[2];
                    View tooltipAnchor = eb9Var.getTooltipAnchor();
                    tooltipAnchor.getLocationOnScreen(iArr);
                    Point point = new Point(rh4.q(18, fk4.d().getDisplayMetrics().density, (br7.D(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                    ywe yweVar3 = pinBarsWidget.a;
                    if (yweVar3 != null && yweVar3.isShowing() && (yweVar = pinBarsWidget.a) != null) {
                        yweVar.dismiss();
                    }
                    ywe yweVar4 = new ywe(pinBarsWidget.getContext(), tooltipAnchor, new qk2(5, pinBarsWidget), (k56) null, 1, 3, 8);
                    yweVar4.d(jqeVar);
                    yweVar4.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    yweVar4.setOnDismissListener(new hr8(1, pinBarsWidget));
                    pinBarsWidget.a = yweVar4;
                }
            }
        }
        return e5f.a;
    }
}

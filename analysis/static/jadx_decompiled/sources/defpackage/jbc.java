package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class jbc extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbc(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = recordControlsWidget;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        FrameLayout frameLayout = (FrameLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                jbc jbcVar = new jbc(this.Z, continuation, 0);
                jbcVar.Y = frameLayout;
                e5f e5fVar = e5f.a;
                jbcVar.o(e5fVar);
                return e5fVar;
            default:
                jbc jbcVar2 = new jbc(this.Z, continuation, 1);
                jbcVar2.Y = frameLayout;
                e5f e5fVar2 = e5f.a;
                jbcVar2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        pq9 pq9Var = qp4.u0;
        RecordControlsWidget recordControlsWidget = this.Z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                ((GradientDrawable) recordControlsWidget.K0.getValue()).setColor(pq9Var.j(frameLayout).f().c);
                break;
            default:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                ((GradientDrawable) recordControlsWidget.J0.getValue()).setColor(f8.G(pq9Var.j(frameLayout2).f().c, 0.2f));
                break;
        }
        return e5fVar;
    }
}

package defpackage;

import android.animation.AnimatorSet;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class tbc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Z = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tbc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tbc tbcVar = new tbc(continuation, this.Z);
        tbcVar.Y = obj;
        return tbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Y;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        while (j1e.z(sx3Var)) {
            bc7[] bc7VarArr = RecordControlsWidget.b1;
            RecordControlsWidget recordControlsWidget = this.Z;
            int iA = recordControlsWidget.I0().w().a();
            recordControlsWidget.r0().clearAnimation();
            float f = ((iA * 1.45f) / 32768) + 1;
            float f2 = f <= 1.45f ? f : 1.45f;
            kl7 kl7VarF = ngg.F(recordControlsWidget.r0(), recordControlsWidget.S0, f2, 100L, 0L);
            AnimatorSet animatorSet = new AnimatorSet();
            recordControlsWidget.V0 = animatorSet;
            animatorSet.setInterpolator((wb5) recordControlsWidget.M0.getValue());
            AnimatorSet animatorSet2 = recordControlsWidget.V0;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(kl7VarF);
            }
            AnimatorSet animatorSet3 = recordControlsWidget.V0;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            recordControlsWidget.S0 = f2;
            this.Y = sx3Var;
            this.X = 1;
            if (j47.x(100L, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}

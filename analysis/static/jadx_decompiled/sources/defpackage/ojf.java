package defpackage;

import android.util.Size;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class ojf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ VideoMessageWidget Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ g8b t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojf(VideoMessageWidget videoMessageWidget, int i, int i2, g8b g8bVar, Continuation continuation) {
        super(2, continuation);
        this.Y = videoMessageWidget;
        this.Z = i;
        this.s0 = i2;
        this.t0 = g8bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ojf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ojf(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = VideoMessageWidget.y0;
            ygf ygfVarO0 = this.Y.o0();
            Size size = new Size(this.Z, this.s0);
            this.X = 1;
            if (((ejf) ygfVarO0).l(size, this.t0, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

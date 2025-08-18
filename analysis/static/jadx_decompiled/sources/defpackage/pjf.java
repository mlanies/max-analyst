package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class pjf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ VideoMessageWidget Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ g8b t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjf(VideoMessageWidget videoMessageWidget, int i, int i2, g8b g8bVar, Continuation continuation) {
        super(2, continuation);
        this.Y = videoMessageWidget;
        this.Z = i;
        this.s0 = i2;
        this.t0 = g8bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pjf(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            eh7 viewLifecycleOwner = this.Y.getViewLifecycleOwner();
            fg7 fg7Var = fg7.X;
            ojf ojfVar = new ojf(this.Y, this.Z, this.s0, this.t0, null);
            this.X = 1;
            Object objB = kq0.B(viewLifecycleOwner.Q(), fg7Var, ojfVar, this);
            if (objB != tx3Var) {
                objB = e5fVar;
            }
            if (objB == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}

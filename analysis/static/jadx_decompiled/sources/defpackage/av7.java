package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class av7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mv7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(mv7 mv7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = mv7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((av7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new av7(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            mv7 mv7Var = this.Y;
            j31 j31Var = new j31(new ArrayList(), new jp5((mn5) mv7Var.o.getValue(), 2), new wu7(3, null, 0));
            yu7 yu7Var = new yu7(mv7Var, 0);
            this.X = 1;
            Object objD = j31Var.d(new ix2(yu7Var, 26), this);
            if (objD != tx3Var) {
                objD = e5fVar;
            }
            if (objD == tx3Var) {
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

package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j0e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0e(j0e j0eVar, Continuation continuation) {
        super(2, continuation);
        this.Z = j0eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((a0e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        a0e a0eVar = new a0e(this.Z, continuation);
        a0eVar.Y = obj;
        return a0eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            o69 o69Var = new o69(new jec(), (on5) this.Y);
            this.X = 1;
            if (this.Z.d(o69Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        throw new KotlinNothingValueException();
    }
}

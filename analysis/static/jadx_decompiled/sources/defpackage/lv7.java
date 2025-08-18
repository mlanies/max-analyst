package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lv7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mv7 Y;
    public final /* synthetic */ CharSequence Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv7(mv7 mv7Var, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = mv7Var;
        this.Z = charSequence;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lv7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lv7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        CharSequence charSequence = this.Z;
        mv7 mv7Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            j31 j31Var = new j31(new ArrayList(), new jp5(new t03(od2.D(new t03(new qn5(1, mv7Var.b.g()), 25), new gv7(charSequence, null)), 26), 2), new wu7(3, null, 1));
            yu7 yu7Var = new yu7(mv7Var, 1);
            this.X = 1;
            Object objD = j31Var.d(new jv7(yu7Var, 0), this);
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
        if (mv7Var.Z.isEmpty()) {
            mv7Var.Z.put(Collections.singletonList("По запросу \"" + ((Object) charSequence) + "\" ничего не найдено!"));
        }
        return e5fVar;
    }
}

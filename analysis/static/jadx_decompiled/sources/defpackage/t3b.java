package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t3b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ o23 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3b(o23 o23Var, Continuation continuation) {
        super(2, continuation);
        this.Y = o23Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        t3b t3bVar = (t3b) n((bb9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        t3bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        t3b t3bVar = new t3b(this.Y, continuation);
        t3bVar.X = obj;
        return t3bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        nif nifVar;
        dkf dkfVar;
        dkf dkfVar2;
        od2.a0(obj);
        bb9 bb9Var = (bb9) this.X;
        ab9 ab9Var = bb9Var instanceof ab9 ? (ab9) bb9Var : null;
        int i = ab9Var != null ? ab9Var.e : 0;
        int i2 = i == 0 ? -1 : s3b.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            o23 o23Var = this.Y;
            if (i2 == 1) {
                mif mifVar = (mif) o23Var.b;
                if (mifVar != null && (((dkfVar = (nifVar = mifVar.b).X) != null && dkfVar.b()) || ((dkfVar2 = nifVar.X) != null && dkfVar2.H0()))) {
                    ((mif) o23Var.b).b();
                }
                o23Var.c = (e60) o23Var.a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e60 e60Var = (e60) o23Var.a;
                uh9 uh9Var = (uh9) e60Var.c;
                if (uh9Var.x || uh9Var.w) {
                    e60Var.b();
                }
                mif mifVar2 = (mif) o23Var.b;
                if (mifVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                o23Var.c = mifVar2;
            }
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pb1 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pb1) n((uj3[]) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pb1 pb1Var = new pb1(2, continuation);
        pb1Var.X = obj;
        return pb1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uj3[] uj3VarArr = (uj3[]) this.X;
        int length = uj3VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            uj3 uj3Var = uj3VarArr[i];
            if (uj3Var == null || uj3Var.w()) {
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}

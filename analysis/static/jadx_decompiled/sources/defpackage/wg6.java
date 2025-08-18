package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wg6 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wg6) n((uj3[]) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wg6 wg6Var = new wg6(2, continuation);
        wg6Var.X = obj;
        return wg6Var;
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
            if (!(true ^ i24.r(uj3VarArr[i]))) {
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}

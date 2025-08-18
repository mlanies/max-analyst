package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yzf extends ffe implements e66 {
    public /* synthetic */ String X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ a0g Z;

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        yzf yzfVar = new yzf(4, (Continuation) obj4);
        yzfVar.X = (String) obj;
        yzfVar.Y = zBooleanValue;
        yzfVar.Z = (a0g) obj3;
        return yzfVar.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return new e0g(this.X, this.Y, this.Z);
    }
}

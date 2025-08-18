package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class xp5 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mec b;

    public /* synthetic */ xp5(mec mecVar, int i) {
        this.a = i;
        this.b = mecVar;
    }

    @Override // defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.a = obj;
                throw new AbortFlowException(this);
            default:
                mec mecVar = this.b;
                Object obj2 = mecVar.a;
                Symbol symbol = ay9.a;
                if (obj2 == symbol) {
                    mecVar.a = obj;
                    return e5f.a;
                }
                mecVar.a = symbol;
                throw new AbortFlowException(this);
        }
    }
}

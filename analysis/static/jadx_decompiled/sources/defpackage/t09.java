package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class t09 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ t09(w7c w7cVar, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = w7cVar;
        this.c = messageWriteWidget;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new s09(on5Var, this.c, 0), continuation);
                if (objD != tx3.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new s09(on5Var, this.c, 1), continuation);
                if (objD2 != tx3.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new s09(on5Var, this.c, 2), continuation);
                if (objD3 != tx3.a) {
                    break;
                }
                break;
        }
        return e5f.a;
    }
}

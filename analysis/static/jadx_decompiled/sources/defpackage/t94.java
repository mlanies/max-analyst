package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class t94 extends Handler {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t94(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ff  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t94.handleMessage(android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t94(ba8 ba8Var, Looper looper) {
        super(looper);
        this.a = 2;
        this.c = ba8Var;
        this.b = false;
    }
}

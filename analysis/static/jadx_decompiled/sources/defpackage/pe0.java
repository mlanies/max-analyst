package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pe0 extends ffe implements a66 {
    public final /* synthetic */ qe0 X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ fbf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(qe0 qe0Var, Context context, fbf fbfVar, Continuation continuation) {
        super(2, continuation);
        this.X = qe0Var;
        this.Y = context;
        this.Z = fbfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pe0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pe0(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qe0 qe0Var = this.X;
        Context context = this.Y;
        fbf fbfVar = this.Z;
        try {
            InputStream inputStreamOpen = context.getAssets().open(fbfVar.a);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return qe0.a(qe0Var, bArr, fbfVar);
        } catch (IOException e) {
            hm9.n("BackgroundDataLoader", "load assets failed: " + e);
            return null;
        }
    }
}

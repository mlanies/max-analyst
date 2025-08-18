package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class er3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er3(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((er3) n((nn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        er3 er3Var = new er3(this.Y, continuation);
        er3Var.X = obj;
        return er3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        nn3 nn3Var = (nn3) this.X;
        long j = nn3Var.a;
        String string = nn3Var.b.toString();
        Uri uri = nn3Var.Z;
        String string2 = uri != null ? uri.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        return new rya(this.Y, j, nn3Var.u0, string, string2);
    }
}

package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vn3 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn3(Object obj, Continuation continuation, String str) {
        super(2, continuation);
        this.X = obj;
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vn3(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pua puaVar = (pua) this.X;
        long j = puaVar.a;
        List listO = c54.O(puaVar);
        String str = puaVar.g;
        return new nn3(j, puaVar.b, null, listO, null, this.Y, str != null ? Uri.parse(str) : null, false, false, puaVar.a(), false, puaVar, 0, false, 29696);
    }
}

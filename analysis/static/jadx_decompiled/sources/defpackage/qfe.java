package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class qfe extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfe(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.Z = obj;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.X;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                qfe qfeVar = new qfe((cge) this.Z, continuation, 0);
                qfeVar.Y = th;
                return qfeVar.o(e5f.a);
            default:
                qfe qfeVar2 = new qfe((ige) this.Z, continuation, 1);
                qfeVar2.Y = th;
                return qfeVar2.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                if (this.Y instanceof HttpUrlExpiredException) {
                    String str = ((cge) this.Z).b;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.Z, str, "Got error about expired URL, retry upload", null);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                Throwable th = this.Y;
                ((ige) this.Z).getClass();
                return Boolean.valueOf((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
        }
    }
}

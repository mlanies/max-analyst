package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.messages.NotificationsImagesProvider;

/* loaded from: classes2.dex */
public final class gw9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ NotificationsImagesProvider Z;
    public final /* synthetic */ Uri s0;
    public final /* synthetic */ ww0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(NotificationsImagesProvider notificationsImagesProvider, Uri uri, ww0 ww0Var, Continuation continuation) {
        super(2, continuation);
        this.Z = notificationsImagesProvider;
        this.s0 = uri;
        this.t0 = ww0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gw9 gw9Var = new gw9(this.Z, this.s0, this.t0, continuation);
        gw9Var.Y = obj;
        return gw9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        NotificationsImagesProvider notificationsImagesProvider = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            this.Y = sx3Var2;
            this.X = 1;
            UriMatcher uriMatcher = NotificationsImagesProvider.a;
            notificationsImagesProvider.getClass();
            sy1 sy1Var = new sy1(1, v3c.u(this));
            sy1Var.n();
            g0 g0VarG = s36.o().g(wv6.a(this.s0));
            sy1Var.d(new af5(g0VarG, 1));
            g0VarG.m(new iw9(sy1Var, 0), qq1.a);
            Object objM = sy1Var.m();
            if (objM != tx3Var) {
                objM = e5f.a;
            }
            if (objM == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        this.Y = null;
        this.X = 2;
        obj = NotificationsImagesProvider.a(notificationsImagesProvider, this.t0, sx3Var, this);
        return obj == tx3Var ? tx3Var : obj;
    }
}

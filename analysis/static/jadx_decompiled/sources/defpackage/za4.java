package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class za4 implements cc3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqb b;

    public /* synthetic */ za4(lqb lqbVar, int i) {
        this.a = i;
        this.b = lqbVar;
    }

    @Override // defpackage.cc3
    public final Object f(bg4 bg4Var) {
        switch (this.a) {
            case 0:
                return new bb4((Context) bg4Var.a(Context.class), ((fl5) bg4Var.a(fl5.class)).c(), bg4Var.b(lqb.a(kj6.class)), bg4Var.c(ef4.class), (Executor) bg4Var.f(this.b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, bg4Var);
        }
    }
}

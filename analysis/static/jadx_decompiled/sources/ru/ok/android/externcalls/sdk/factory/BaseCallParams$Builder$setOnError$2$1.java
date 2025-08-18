package ru.ok.android.externcalls.sdk.factory;

import defpackage.e5f;
import defpackage.m56;
import defpackage.p66;
import defpackage.rj3;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BaseCallParams$Builder$setOnError$2$1 extends p66 implements m56 {
    public BaseCallParams$Builder$setOnError$2$1(Object obj) {
        super(1, 0, rj3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
    }

    @Override // defpackage.m56
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return e5f.a;
    }

    public final void invoke(Throwable th) {
        ((rj3) this.receiver).accept(th);
    }
}

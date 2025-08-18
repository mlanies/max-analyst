package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ip0;
import defpackage.kh7;
import defpackage.le0;
import defpackage.lq9;
import defpackage.lqb;
import defpackage.nb3;
import defpackage.nh4;
import defpackage.nx3;
import defpackage.ob8;
import defpackage.oq9;
import defpackage.oz7;
import defpackage.qq9;
import defpackage.u4f;
import defpackage.y53;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lnb3;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nb3> getComponents() {
        ob8 ob8VarA = nb3.a(new lqb(le0.class, nx3.class));
        ob8VarA.a(new nh4(new lqb(le0.class, Executor.class), 1, 0));
        ob8VarA.f = oz7.b;
        nb3 nb3VarB = ob8VarA.b();
        ob8 ob8VarA2 = nb3.a(new lqb(kh7.class, nx3.class));
        ob8VarA2.a(new nh4(new lqb(kh7.class, Executor.class), 1, 0));
        ob8VarA2.f = lq9.o;
        nb3 nb3VarB2 = ob8VarA2.b();
        ob8 ob8VarA3 = nb3.a(new lqb(ip0.class, nx3.class));
        ob8VarA3.a(new nh4(new lqb(ip0.class, Executor.class), 1, 0));
        ob8VarA3.f = oq9.X;
        nb3 nb3VarB3 = ob8VarA3.b();
        ob8 ob8VarA4 = nb3.a(new lqb(u4f.class, nx3.class));
        ob8VarA4.a(new nh4(new lqb(u4f.class, Executor.class), 1, 0));
        ob8VarA4.f = qq9.t0;
        return y53.M(nb3VarB, nb3VarB2, nb3VarB3, ob8VarA4.b());
    }
}

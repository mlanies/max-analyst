package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a14;
import defpackage.au1;
import defpackage.ef4;
import defpackage.fl5;
import defpackage.j2f;
import defpackage.jl5;
import defpackage.kl5;
import defpackage.l2f;
import defpackage.lqb;
import defpackage.mj6;
import defpackage.nb3;
import defpackage.nh4;
import defpackage.ob8;
import defpackage.wae;
import defpackage.za4;
import defpackage.zb3;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(lqb lqbVar, zb3 zb3Var) {
        fl5 fl5Var = (fl5) zb3Var.a(fl5.class);
        au1.r(zb3Var.a(kl5.class));
        return new FirebaseMessaging(fl5Var, zb3Var.c(ef4.class), zb3Var.c(mj6.class), (jl5) zb3Var.a(jl5.class), zb3Var.e(lqbVar), (wae) zb3Var.a(wae.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<nb3> getComponents() {
        lqb lqbVar = new lqb(j2f.class, l2f.class);
        ob8 ob8Var = new ob8(FirebaseMessaging.class, new Class[0]);
        ob8Var.b = LIBRARY_NAME;
        ob8Var.a(nh4.a(fl5.class));
        ob8Var.a(new nh4(0, 0, kl5.class));
        ob8Var.a(new nh4(0, 1, ef4.class));
        ob8Var.a(new nh4(0, 1, mj6.class));
        ob8Var.a(nh4.a(jl5.class));
        ob8Var.a(new nh4(lqbVar, 0, 1));
        ob8Var.a(nh4.a(wae.class));
        ob8Var.f = new za4(lqbVar, 1);
        if (!(ob8Var.d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        ob8Var.d = 1;
        return Arrays.asList(ob8Var.b(), a14.l(LIBRARY_NAME, "24.0.1"));
    }
}

package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a14;
import defpackage.fl5;
import defpackage.ig5;
import defpackage.il5;
import defpackage.ip0;
import defpackage.jl5;
import defpackage.kj6;
import defpackage.le0;
import defpackage.lj6;
import defpackage.lqb;
import defpackage.nb3;
import defpackage.nh4;
import defpackage.ob8;
import defpackage.p6d;
import defpackage.v02;
import defpackage.zb3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static jl5 lambda$getComponents$0(zb3 zb3Var) {
        return new il5((fl5) zb3Var.a(fl5.class), zb3Var.c(lj6.class), (ExecutorService) zb3Var.f(new lqb(le0.class, ExecutorService.class)), new p6d((Executor) zb3Var.f(new lqb(ip0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nb3> getComponents() {
        ob8 ob8Var = new ob8(jl5.class, new Class[0]);
        ob8Var.b = LIBRARY_NAME;
        ob8Var.a(nh4.a(fl5.class));
        ob8Var.a(new nh4(0, 1, lj6.class));
        ob8Var.a(new nh4(new lqb(le0.class, ExecutorService.class), 1, 0));
        ob8Var.a(new nh4(new lqb(ip0.class, Executor.class), 1, 0));
        ob8Var.f = new ig5(11);
        nb3 nb3VarB = ob8Var.b();
        kj6 kj6Var = new kj6(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(kj6.class));
        return Arrays.asList(nb3VarB, new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new v02(15, kj6Var), hashSet3), a14.l(LIBRARY_NAME, "18.0.0"));
    }
}

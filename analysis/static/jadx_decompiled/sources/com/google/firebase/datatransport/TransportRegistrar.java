package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a14;
import defpackage.fw0;
import defpackage.hme;
import defpackage.j2f;
import defpackage.l2f;
import defpackage.lqb;
import defpackage.n2f;
import defpackage.nb3;
import defpackage.nh4;
import defpackage.o2f;
import defpackage.ob8;
import defpackage.of7;
import defpackage.zb3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l2f lambda$getComponents$0(zb3 zb3Var) {
        o2f.b((Context) zb3Var.a(Context.class));
        return o2f.a().c(fw0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l2f lambda$getComponents$1(zb3 zb3Var) {
        o2f.b((Context) zb3Var.a(Context.class));
        return o2f.a().c(fw0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l2f lambda$getComponents$2(zb3 zb3Var) {
        o2f.b((Context) zb3Var.a(Context.class));
        return o2f.a().c(fw0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nb3> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(l2f.class));
        for (Class cls : new Class[0]) {
            a14.h(cls, "Null interface");
            hashSet.add(lqb.a(cls));
        }
        nh4 nh4VarA = nh4.a(Context.class);
        if (!(!hashSet.contains(nh4VarA.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(nh4VarA);
        nb3 nb3Var = new nb3(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new hme(29), hashSet3);
        ob8 ob8VarA = nb3.a(new lqb(of7.class, l2f.class));
        ob8VarA.a(nh4.a(Context.class));
        ob8VarA.f = new n2f(0);
        nb3 nb3VarB = ob8VarA.b();
        ob8 ob8VarA2 = nb3.a(new lqb(j2f.class, l2f.class));
        ob8VarA2.a(nh4.a(Context.class));
        ob8VarA2.f = new n2f(1);
        return Arrays.asList(nb3Var, nb3VarB, ob8VarA2.b(), a14.l(LIBRARY_NAME, "18.2.0"));
    }
}

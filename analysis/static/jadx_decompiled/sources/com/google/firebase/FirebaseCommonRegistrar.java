package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a14;
import defpackage.bb4;
import defpackage.ef4;
import defpackage.fl5;
import defpackage.ig5;
import defpackage.kj6;
import defpackage.le0;
import defpackage.lj6;
import defpackage.lqb;
import defpackage.md7;
import defpackage.mj6;
import defpackage.nb3;
import defpackage.nh4;
import defpackage.ob8;
import defpackage.ta4;
import defpackage.va0;
import defpackage.za4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(ef4.class));
        for (Class cls : new Class[0]) {
            a14.h(cls, "Null interface");
            hashSet.add(lqb.a(cls));
        }
        nh4 nh4Var = new nh4(2, 0, va0.class);
        if (!(!hashSet.contains(nh4Var.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(nh4Var);
        arrayList.add(new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ta4(4), hashSet3));
        lqb lqbVar = new lqb(le0.class, Executor.class);
        ob8 ob8Var = new ob8(bb4.class, new Class[]{lj6.class, mj6.class});
        ob8Var.a(nh4.a(Context.class));
        ob8Var.a(nh4.a(fl5.class));
        ob8Var.a(new nh4(2, 0, kj6.class));
        ob8Var.a(new nh4(1, 1, ef4.class));
        ob8Var.a(new nh4(lqbVar, 1, 0));
        ob8Var.f = new za4(lqbVar, 0);
        arrayList.add(ob8Var.b());
        arrayList.add(a14.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a14.l("fire-core", "21.0.0"));
        arrayList.add(a14.l("device-name", a(Build.PRODUCT)));
        arrayList.add(a14.l("device-model", a(Build.DEVICE)));
        arrayList.add(a14.l("device-brand", a(Build.BRAND)));
        arrayList.add(a14.t("android-target-sdk", new ig5(7)));
        arrayList.add(a14.t("android-min-sdk", new ig5(8)));
        arrayList.add(a14.t("android-platform", new ig5(9)));
        arrayList.add(a14.t("android-installer", new ig5(10)));
        try {
            md7.b.getClass();
            str = "2.0.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a14.l("kotlin", str));
        }
        return arrayList;
    }
}

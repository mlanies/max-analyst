package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.obfuscated.o0;
import defpackage.ewc;

/* loaded from: classes.dex */
public abstract class g0 {
    public static void a(z0 z0Var, t tVar, Context context) {
        h.a(new ewc(context, z0Var, tVar, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, z0 z0Var, t tVar) {
        String string;
        String str;
        char c;
        Context context2;
        z0 z0Var2;
        long jB;
        PackageInfo packageInfoA = o.a(context);
        if (packageInfoA != null) {
            string = Long.toString(packageInfoA.getLongVersionCode());
            str = packageInfoA.versionName;
        } else {
            string = "";
            str = string;
        }
        p0 p0VarA = p0.a(context);
        String strA = p0VarA.a();
        String strG = z0Var.g();
        if (!strG.equals(p0VarA.b())) {
            y0.a("InstallHandler: tracking install");
            if (packageInfoA != null) {
                jB = x0.b(packageInfoA.firstInstallTime);
                context2 = context;
                z0Var2 = z0Var;
            } else {
                context2 = context;
                z0Var2 = z0Var;
                jB = 0;
            }
            o0 o0VarA = o0.a(tVar, z0Var2, context2);
            o0.a aVarA = o0VarA.a();
            tVar.a(jB, o.b(context), aVarA);
            if (aVarA == null) {
                o0VarA.c();
            }
            p0VarA.e(strG);
            c = 1;
        } else if (string.equals(strA)) {
            c = 0;
        } else {
            if (strA.isEmpty()) {
                y0.a("InstallHandler: tracking update");
            } else {
                y0.a("InstallHandler: tracking update from" + strA + " to " + string);
            }
            tVar.a(p0VarA.e(), strA, str, string, o.b(context));
            c = 2;
        }
        long jI = p0VarA.i();
        long jA = x0.a();
        String strA2 = z0Var.a();
        if (!TextUtils.isEmpty(strA2)) {
            if (jA - jI < 604800 || jI == 0) {
                y0.a("InstallHandler: tracking apkPreinstallParams");
                tVar.b(strA2);
            } else {
                y0.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            y0.a("InstallHandler: no install/update");
            return;
        }
        if (c == 1) {
            p0VarA.a(jA);
        }
        p0VarA.d(string);
        p0VarA.g(str);
        p0VarA.b(jA);
    }
}

package com.facebook.soloader;

import android.os.Trace;
import defpackage.fw4;
import defpackage.gw4;
import defpackage.hm9;
import defpackage.ja9;
import defpackage.tfg;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, fw4 fw4Var) {
        String[] strArrJ;
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                if (fw4Var instanceof gw4) {
                    gw4 gw4Var = (gw4) fw4Var;
                    int i = 0;
                    while (true) {
                        try {
                            strArrJ = tfg.j(gw4Var);
                            break;
                        } catch (ClosedByInterruptException e) {
                            i++;
                            if (i > 4) {
                                throw e;
                            }
                            Thread.interrupted();
                            FileInputStream fileInputStream = new FileInputStream(gw4Var.a);
                            gw4Var.b = fileInputStream;
                            gw4Var.c = fileInputStream.getChannel();
                        }
                    }
                } else {
                    strArrJ = tfg.j(fw4Var);
                }
                return strArrJ;
            } finally {
                if (SoLoader.a) {
                    Trace.endSection();
                }
            }
        } catch (ja9 e2) {
            throw hm9.i(str, e2);
        }
    }
}

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import defpackage.ce6;
import defpackage.moe;
import defpackage.noe;
import defpackage.o3a;
import defpackage.ooe;
import defpackage.ph3;
import defpackage.reg;
import defpackage.ukg;
import defpackage.xne;
import defpackage.y99;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final noe zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new reg(context, reg.v0, new ooe("ads_identifier:api"), ce6.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        ph3 ph3Var;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (ph3Var = ((ApiException) exc).a.o) != null && ph3Var.b == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            noe noeVar = this.zzd;
            if (noeVar != null) {
                ukg ukgVarD = ((reg) noeVar).d(new moe(0, Arrays.asList(new y99(35401, i2, 0, j, j2, null, null, 0, i3))));
                o3a o3aVar = new o3a() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // defpackage.o3a
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                };
                ukgVarD.getClass();
                ukgVarD.c(xne.a, o3aVar);
            }
        }
    }
}

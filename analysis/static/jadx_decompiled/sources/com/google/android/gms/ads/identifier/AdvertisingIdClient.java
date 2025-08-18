package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import defpackage.fe6;
import defpackage.fhg;
import defpackage.fp3;
import defpackage.hgg;
import defpackage.np0;
import defpackage.ugg;
import defpackage.xh3;
import defpackage.yhg;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    np0 zza;
    yhg zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        int i;
        int i2;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        zzd zzdVarZza = zzd.zza(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Info infoZzf = advertisingIdClient.zzf(-1);
            advertisingIdClient.zze(infoZzf, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            return infoZzf;
        } catch (Throwable th) {
            advertisingIdClient.zze(null, true, 0.0f, -1L, "", th);
            if (th instanceof IOException) {
                i = 1;
            } else if (th instanceof GooglePlayServicesNotAvailableException) {
                i = 9;
            } else if (th instanceof GooglePlayServicesRepairableException) {
                i = 16;
            } else {
                if (!(th instanceof IllegalStateException)) {
                    i2 = -1;
                    zzdVarZza.zzc(35401, i2, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                    throw th;
                }
                i = 8;
            }
            i2 = i;
            zzdVarZza.zzc(35401, i2, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            fp3.m("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                fp3.n(advertisingIdClient.zza);
                fp3.n(advertisingIdClient.zzb);
                try {
                    ugg uggVar = (ugg) advertisingIdClient.zzb;
                    uggVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelK = uggVar.k(parcelObtain, 6);
                    int i = hgg.a;
                    z = parcelK.readInt() != 0;
                    parcelK.recycle();
                } catch (RemoteException e) {
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            return z;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        fp3.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            fp3.n(this.zza);
            fp3.n(this.zzb);
            try {
                ugg uggVar = (ugg) this.zzb;
                uggVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel parcelK = uggVar.k(parcelObtain, 1);
                String string = parcelK.readString();
                parcelK.recycle();
                ugg uggVar2 = (ugg) this.zzb;
                uggVar2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = hgg.a;
                parcelObtain2.writeInt(1);
                Parcel parcelK2 = uggVar2.k(parcelObtain2, 2);
                if (parcelK2.readInt() == 0) {
                    z = false;
                }
                parcelK2.recycle();
                info = new Info(string, z);
            } catch (RemoteException e) {
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzc(true);
    }

    public final void zza() {
        fp3.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        xh3.a().b(this.zzi, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void zzc(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        fp3.m("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = fe6.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    np0 np0Var = new np0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!xh3.a().c(context, context.getClass().getName(), intent, np0Var, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = np0Var;
                        try {
                            IBinder iBinderA = np0Var.a(TimeUnit.MILLISECONDS);
                            int i = fhg.c;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = iInterfaceQueryLocalInterface instanceof yhg ? (yhg) iInterfaceQueryLocalInterface : new ugg(iBinderA);
                            this.zzc = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    zzc(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        fp3.n(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }
}

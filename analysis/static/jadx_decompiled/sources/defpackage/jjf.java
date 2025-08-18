package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Region;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class jjf implements vuc {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public jjf() {
        this.c = new Path();
        this.d = new Region();
        this.e = new Region();
        this.a = -1;
        this.b = -1;
    }

    public static String h(fl5 fl5Var) {
        fl5Var.a();
        ol5 ol5Var = fl5Var.c;
        String str = ol5Var.e;
        if (str != null) {
            return str;
        }
        fl5Var.a();
        String str2 = ol5Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // defpackage.vuc
    public int a() {
        return this.a;
    }

    @Override // defpackage.vuc
    public void b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream != null) {
            try {
                k(outputStreamOpenOutputStream);
                v3c.i(outputStreamOpenOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    v3c.i(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.vuc
    public Uri c() {
        return (Uri) this.e;
    }

    @Override // defpackage.vuc
    public String d() {
        return (String) this.d;
    }

    @Override // defpackage.vuc
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.vuc
    public void f(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            k(fileOutputStream);
            v3c.i(fileOutputStream, null);
        } finally {
        }
    }

    public synchronized String g() {
        try {
            if (((String) this.d) == null) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    @Override // defpackage.vuc
    public Integer getHeight() {
        return null;
    }

    @Override // defpackage.vuc
    public Integer getWidth() {
        return null;
    }

    public boolean i() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void j() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.d = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public void k(OutputStream outputStream) throws IOException {
        int i;
        byte[] bArr = new byte[2048];
        int i2 = 0;
        do {
            i = this.b;
            int iMin = Math.min(2048, i - i2);
            ((qq8) this.c).S(i2, 0, iMin, bArr);
            outputStream.write(bArr, 0, iMin);
            i2 += iMin;
        } while (i2 < i);
        outputStream.flush();
    }

    public jjf(qq8 qq8Var, int i, String str) {
        this.c = qq8Var;
        this.a = i;
        this.d = str;
        this.b = qq8Var.U();
        this.e = MediaStore.Images.Media.getContentUri("external_primary");
    }

    public jjf(Context context) {
        this.b = 0;
        this.c = context;
    }
}

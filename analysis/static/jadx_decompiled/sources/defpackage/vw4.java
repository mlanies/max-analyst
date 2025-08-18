package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class vw4 {
    public static final Object o = new Object();
    public static volatile vw4 p;
    public final ReentrantReadWriteLock a;
    public final xs b;
    public volatile int c;
    public final Handler d;
    public final rw4 e;
    public final uw4 f;
    public final kj6 g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final ya4 n;

    public vw4(mx5 mx5Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.h = mx5Var.b;
        this.i = mx5Var.c;
        this.j = mx5Var.d;
        this.k = mx5Var.f;
        this.l = -16711936;
        uw4 uw4Var = mx5Var.a;
        this.f = uw4Var;
        int i = mx5Var.g;
        this.m = i;
        this.n = mx5Var.h;
        this.d = new Handler(Looper.getMainLooper());
        xs xsVar = new xs(0);
        this.b = xsVar;
        this.g = new kj6(10);
        xs xsVar2 = mx5Var.e;
        if (xsVar2 != null && !xsVar2.isEmpty()) {
            xsVar.addAll(mx5Var.e);
        }
        rw4 rw4Var = new rw4(this);
        this.e = rw4Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                uw4Var.a(new qw4(rw4Var));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static vw4 a() {
        vw4 vw4Var;
        synchronized (o) {
            vw4Var = p;
            c54.p("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", vw4Var != null);
        }
        return vw4Var;
    }

    public static void c(mx5 mx5Var) {
        if (p == null) {
            synchronized (o) {
                try {
                    if (p == null) {
                        p = new vw4(mx5Var);
                    }
                } finally {
                }
            }
        }
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        c54.p("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.m == 1);
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            rw4 rw4Var = this.e;
            vw4 vw4Var = (vw4) rw4Var.a;
            try {
                vw4Var.f.a(new qw4(rw4Var));
            } catch (Throwable th) {
                vw4Var.e(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new eo(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new eo(arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence g(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        c54.p("Not initialized yet", b() == 1);
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("maxEmojiCount cannot be negative");
        }
        c54.j("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        c54.j("start should be < than charSequence length", i <= charSequence.length());
        c54.j("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.h : false;
        } else {
            z = true;
        }
        return this.e.c(charSequence, i, i2, i3, z);
    }

    public final CharSequence h(CharSequence charSequence) {
        return g(0, charSequence == null ? 0 : charSequence.length(), charSequence, Integer.MAX_VALUE, 0);
    }

    public final void i(tw4 tw4Var) {
        c54.o(tw4Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new eo(Arrays.asList(tw4Var), this.c, (Throwable) null));
            } else {
                this.b.add(tw4Var);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}

package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.jakewharton.processphoenix.ProcessPhoenix;
import defpackage.a81;
import defpackage.bg4;
import defpackage.bk4;
import defpackage.bta;
import defpackage.c5a;
import defpackage.cta;
import defpackage.di;
import defpackage.ee3;
import defpackage.ej4;
import defpackage.eke;
import defpackage.el3;
import defpackage.hm9;
import defpackage.hx7;
import defpackage.i9e;
import defpackage.iba;
import defpackage.ir6;
import defpackage.iu6;
import defpackage.iy5;
import defpackage.j78;
import defpackage.je7;
import defpackage.jw3;
import defpackage.k56;
import defpackage.k5d;
import defpackage.ke3;
import defpackage.khe;
import defpackage.ly5;
import defpackage.lz7;
import defpackage.me3;
import defpackage.mqd;
import defpackage.mre;
import defpackage.nn6;
import defpackage.nz4;
import defpackage.oag;
import defpackage.p4a;
import defpackage.p82;
import defpackage.q4a;
import defpackage.ri6;
import defpackage.s4a;
import defpackage.si6;
import defpackage.sld;
import defpackage.t6b;
import defpackage.tme;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.us7;
import defpackage.x53;
import defpackage.y53;
import defpackage.y8a;
import defpackage.yf3;
import defpackage.yo;
import defpackage.zba;
import defpackage.zj7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lone/me/android/OneMeApplication;", "Landroid/app/Application;", "Lke3;", "Leke;", "", "Lri6;", "Lsi6;", "<init>", "()V", "Lkye;", "tracer", "Lpye;", "report", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class OneMeApplication extends Application implements ke3, eke, ri6, si6 {
    public static final /* synthetic */ int s0 = 0;
    public final String Y;
    public final khe Z;
    public final je7 a = tu0.r(3, new j78(28));
    public final yo b = yo.a;
    public final ArrayList c = new ArrayList();
    public final khe o = new khe(new j78(29));
    public final long X = SystemClock.elapsedRealtime();

    public OneMeApplication() {
        String name = OneMeApplication.class.getName();
        this.Y = name;
        Looper.getMainLooper();
        new hx7();
        cta ctaVar = cta.APP_INIT;
        yo.b.k(ctaVar, new bta(ctaVar, SystemClock.elapsedRealtime()));
        hm9.m = new zba();
        int i = i9e.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "AppVersion 25.8.1(6392)--1", null);
        }
        this.Z = new khe(new p4a(this, 4));
    }

    @Override // defpackage.ke3
    public final me3 a() {
        return (me3) y8a.a.getAccessor().c(me3.class);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i = 14;
        int i2 = 1;
        int i3 = 22;
        int i4 = 0;
        int i5 = lz7.g;
        if (!oag.t("ru")) {
            Locale locale = new Locale("ru");
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (ProcessPhoenix.a(this)) {
            return;
        }
        c5a c5aVar = new c5a(context, this);
        mqd.a = mqd.s(c5aVar);
        ly5 ly5VarC = c();
        yf3 yf3Var = new yf3(c5aVar, i3, this);
        nz4 nz4Var = nz4.a;
        iy5 iy5VarA = ly5VarC.a("Tracer", nz4Var, yf3Var);
        ArrayList arrayList = this.c;
        arrayList.add(iy5VarA);
        iy5 iy5VarA2 = c().a("Scout", Collections.singletonList(iy5VarA), new ej4(this, c5aVar));
        arrayList.add(iy5VarA2);
        arrayList.add(c().a("Protobuf", Collections.singletonList(iy5VarA), new j78(21)));
        b(c(), "LibraryUpgrade", nz4Var, new p4a(this, i4));
        c().a("Account", Collections.singletonList(iy5VarA2), new j78(24));
        b(c(), "AnrWatcher", nz4Var, new p4a(this, i2));
        c().a("SetupRx", nz4.a, new j78(25));
        c().a("RxJavaPlugins.setErrorHandler", nz4.a, new p4a(this, 2));
        iy5 iy5VarA3 = c().a("Chroma.init", nz4Var, new p4a(this, 3));
        b(c(), "AppTracerCrashService", nz4Var, new j78(26));
        b(c(), "IoPoolSize", Collections.singletonList(b(c(), "Logger", nz4Var, new j78(27))), new q4a(i4));
        b(c(), "Fresco", nz4Var, new q4a(8));
        b(c(), "Theme background warmup", nz4Var, new p4a(this, i));
        b(c(), "Chroma.dynamicChange", Collections.singletonList(iy5VarA3), new p4a(this, 15));
        b(c(), "DynamicFont", nz4Var, new p4a(this, 18));
        b(c(), "NativeMedia", nz4Var, new q4a(28));
        b(c(), "EmojiProvider", nz4Var, new q4a(29));
        b(c(), "Animoji warmup", nz4Var, new s4a(i4));
        b(c(), "VisibilityController", nz4Var, new j78(19));
        b(c(), "ProxyChangeListener", nz4Var, new j78(20));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        iy5 iy5VarB = b(c(), "InitialDataStorage.Banners", nz4Var, new zj7(i, atomicBoolean));
        AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        b(c(), "LegacyChats", y53.M(b(c(), "InitialDataStorage.Chats&Folders", Collections.singletonList(iy5VarB), new jw3(atomicReference, i2)), iy5VarB), new a81(this, atomicBoolean, atomicReference, 4));
        b(c(), "RemoveAccountIfNeed", nz4Var, new j78(i3));
        b(c(), "Folders Warmup", nz4Var, new j78(23));
    }

    public final iy5 b(ly5 ly5Var, String str, Iterable iterable, k56 k56Var) {
        ArrayList arrayList = this.c;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (tpa.f(((iy5) it.next()).a, str)) {
                    throw new IllegalStateException(("Task " + str + " is root").toString());
                }
            }
        }
        return ly5Var.a(str, x53.t0(arrayList, iterable), k56Var);
    }

    public final ly5 c() {
        return (ly5) this.a.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        sld sldVar = (sld) this.Z.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) sldVar.b.getValue()).computeIfAbsent(str, new di(19, new k5d(sldVar, str, 2)));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ee3 ee3Var = (ee3) this.o.getValue();
        ee3Var.getClass();
        boolean z = (configuration.uiMode & 48) == 32;
        Boolean bool = ee3Var.b;
        bg4 bg4Var = ee3Var.a;
        if (bool == null) {
            ee3Var.b = Boolean.valueOf(z);
            ee3Var.c = Float.valueOf(configuration.fontScale);
            ((tme) ((je7) bg4Var.Y).getValue()).b(true);
            return;
        }
        if (bool.booleanValue() != z) {
            hm9.n("ee3", "onConfigurationChanged: system night mode changed to " + z);
            ee3Var.b = Boolean.valueOf(z);
            ((tme) ((je7) bg4Var.Y).getValue()).b(true);
        }
        if (ee3Var.c.floatValue() != configuration.fontScale) {
            hm9.n("ee3", "onConfigurationChanged: fontScale changed from " + ee3Var.c + " to " + configuration.fontScale);
            ee3Var.c = Float.valueOf(configuration.fontScale);
            bk4.b().c();
            ((t6b) ((je7) bg4Var.c).getValue()).a();
            ((el3) ((je7) bg4Var.o).getValue()).e();
            ((p82) ((je7) bg4Var.X).getValue()).s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01eb  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.OneMeApplication.onCreate():void");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i < 40 || ProcessPhoenix.a(this)) {
            return;
        }
        hm9.n(this.Y, "onTrimMemory: TRIM_MEMORY_BACKGROUND");
        iu6 iu6Var = (iu6) y8a.a.getAccessor().c(iu6.class);
        ((iba) iu6Var.d.getValue()).a().execute(new nn6(3, iu6Var));
        LruCache lruCache = mre.a;
        hm9.n("ThemeBackgroundCache", "clear cache of themes.");
        mre.a.evictAll();
    }
}

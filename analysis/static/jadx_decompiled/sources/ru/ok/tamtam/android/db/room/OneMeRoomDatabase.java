package ru.ok.tamtam.android.db.room;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import defpackage.a7c;
import defpackage.adb;
import defpackage.alc;
import defpackage.b4e;
import defpackage.bcf;
import defpackage.d9c;
import defpackage.dt2;
import defpackage.ed1;
import defpackage.ew9;
import defpackage.fd5;
import defpackage.hoe;
import defpackage.ilc;
import defpackage.ir3;
import defpackage.ja4;
import defpackage.jj9;
import defpackage.kw9;
import defpackage.le5;
import defpackage.mtf;
import defpackage.n4e;
import defpackage.od5;
import defpackage.oj;
import defpackage.oy8;
import defpackage.qef;
import defpackage.rva;
import defpackage.s1e;
import defpackage.t19;
import defpackage.tp4;
import defpackage.ud5;
import defpackage.w4d;
import defpackage.w8f;
import defpackage.wh;
import defpackage.xrc;
import defpackage.yx9;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.android.OneMeApplication;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/db/room/OneMeRoomDatabase;", "Lilc;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class OneMeRoomDatabase extends ilc {
    public static volatile jj9 m;

    public abstract fd5 A();

    public abstract od5 B();

    public abstract ud5 C();

    public abstract le5 D();

    public abstract oy8 E();

    public abstract t19 F();

    public abstract ew9 G();

    public abstract kw9 H();

    public abstract yx9 I();

    public abstract rva J();

    public abstract adb K();

    public abstract a7c L();

    public abstract d9c M();

    public abstract alc N();

    public abstract xrc O();

    public abstract w4d P();

    public abstract s1e Q();

    public abstract b4e R();

    public abstract n4e S();

    public abstract hoe T();

    public abstract w8f U();

    public abstract qef V();

    public abstract mtf W();

    public abstract WorkersQueueDao X();

    @Override // defpackage.ilc
    public final void a() {
        if (m != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            boolean zK = k();
            boolean zN = n();
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            String strValueOf = (name == null || name.length() == 0) ? String.valueOf(threadCurrentThread.getId()) : threadCurrentThread.getName();
            StringBuilder sb = new StringBuilder("NotMainThreadException(isOpenInternal=");
            sb.append(zN);
            sb.append(", isInTransaction=");
            sb.append(zK);
            sb.append(", curThread=");
            NotMainThreadException notMainThreadException = new NotMainThreadException(zr6.l(sb, strValueOf, ")"));
            int i = OneMeApplication.s0;
            bcf.a.c().a("ONEME-8045", notMainThreadException);
        }
    }

    public abstract wh t();

    public abstract oj u();

    public abstract ed1 v();

    public abstract dt2 w();

    public abstract ir3 x();

    public abstract ja4 y();

    public abstract tp4 z();
}

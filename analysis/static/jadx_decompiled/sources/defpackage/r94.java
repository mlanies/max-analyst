package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r94 implements ap4 {
    public static final SparseArray c;
    public final mw0 a;
    public final Executor b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(g14.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(yl6.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public r94(mw0 mw0Var, ExecutorService executorService) {
        this.a = mw0Var;
        this.b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(zo4.class).getConstructor(tb8.class, mw0.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    public final zo4 a(vo4 vo4Var) {
        fb8 fb8Var;
        za8 za8Var;
        Constructor constructor;
        ib8 ib8Var;
        fb8 fb8Var2;
        za8 za8Var2;
        ib8 ib8Var2;
        int iJ = oaf.J(vo4Var.b, vo4Var.c);
        Executor executor = this.b;
        mw0 mw0Var = this.a;
        Uri uri = vo4Var.b;
        if (iJ != 0 && iJ != 1 && iJ != 2) {
            if (iJ != 4) {
                throw new IllegalArgumentException(zr6.h(iJ, "Unsupported type: "));
            }
            za8 za8Var3 = new za8();
            s74 s74Var = new s74();
            List listEmptyList = Collections.emptyList();
            ffc ffcVar = ffc.X;
            fb8 fb8Var3 = new fb8();
            lb8 lb8Var = lb8.d;
            fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
            if (uri != null) {
                za8Var2 = za8Var3;
                ib8Var2 = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, vo4Var.Y, ffcVar, null, -9223372036854775807L);
                fb8Var2 = fb8Var3;
            } else {
                fb8Var2 = fb8Var3;
                za8Var2 = za8Var3;
                ib8Var2 = null;
            }
            return new jnb(new tb8("", new db8(za8Var2), ib8Var2, new hb8(fb8Var2), gd8.J, lb8Var), mw0Var, executor);
        }
        Constructor constructor2 = (Constructor) c.get(iJ);
        if (constructor2 == null) {
            throw new IllegalStateException(zr6.h(iJ, "Module missing for content type "));
        }
        za8 za8Var4 = new za8();
        s74 s74Var2 = new s74();
        Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        fb8 fb8Var4 = new fb8();
        lb8 lb8Var2 = lb8.d;
        List list = vo4Var.o;
        List listEmptyList2 = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        fm9.k(((Uri) s74Var2.e) == null || ((UUID) s74Var2.d) != null);
        if (uri != null) {
            za8Var = za8Var4;
            constructor = constructor2;
            ib8Var = new ib8(uri, null, ((UUID) s74Var2.d) != null ? new eb8(s74Var2) : null, null, listEmptyList2, vo4Var.Y, ffcVar2, null, -9223372036854775807L);
            fb8Var = fb8Var4;
        } else {
            fb8Var = fb8Var4;
            za8Var = za8Var4;
            constructor = constructor2;
            ib8Var = null;
        }
        try {
            return (zo4) constructor.newInstance(new tb8("", new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var2), mw0Var, executor);
        } catch (Exception e) {
            throw new IllegalStateException(zr6.h(iJ, "Failed to instantiate downloader for content type "), e);
        }
    }
}

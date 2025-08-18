package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class de4 extends s5c {
    public final Object d = new Object();
    public final ExecutorService e = Executors.newFixedThreadPool(4, new j40(2));
    public volatile Handler f;
}

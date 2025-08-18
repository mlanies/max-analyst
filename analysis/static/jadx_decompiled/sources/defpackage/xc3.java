package defpackage;

import android.util.Base64;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class xc3 implements jde {
    public final /* synthetic */ int a;

    @Override // defpackage.jde
    public final Object get() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                try {
                    Object objInvoke = DefaultVideoFrameProcessor$Factory$Builder.class.getMethod("build", null).invoke(DefaultVideoFrameProcessor$Factory$Builder.class.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (zff) objInvoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof qm7) {
                    return (qm7) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new pc9((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new mc9(executorServiceNewSingleThreadExecutor);
            case 2:
                byte[] bArr = new byte[12];
                zc4.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new ec4(new n64(0), 50000, 50000, 2500, 5000);
            case 4:
                return new fc4(new n64(1), 50000, 50000, 2500, 5000, false);
            default:
                throw new IllegalStateException();
        }
    }
}

package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class bjg extends pig {
    public static final WeakReference f = new WeakReference(null);
    public WeakReference e;

    @Override // defpackage.pig
    public final byte[] L0() {
        byte[] bArrM0;
        synchronized (this) {
            try {
                bArrM0 = (byte[]) this.e.get();
                if (bArrM0 == null) {
                    bArrM0 = M0();
                    this.e = new WeakReference(bArrM0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM0;
    }

    public abstract byte[] M0();
}
